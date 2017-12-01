package org.ssm.storage.manager.user.handler;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.storage.converter.StringUtil;
import org.ssm.storage.manager.storage.service.ICangKuService;
import org.ssm.storage.manager.storage.service.IChuKuService;
import org.ssm.storage.manager.storage.service.IDiaoBoService;
import org.ssm.storage.manager.storage.service.IRuKuService;
import org.ssm.storage.manager.storage.service.IShunHuaiService;
import org.ssm.storage.manager.user.entity.KeHu;
import org.ssm.storage.manager.user.entity.User;
import org.ssm.storage.manager.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserHandler {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/login")
	public void login(String userName, String password, String userType, HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("kaishidenglul");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setUserType(userType);
		user = userService.login(user);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		if(user == null){
			request.getRequestDispatcher("/login.jsp").forward(request,response);
		}else if(userType.equals("经销商") || userType.equals("分销商")){
			response.sendRedirect("${pageContext.request.contextPath }/cangku/ownercangku?userName=" + userName);
		}else{
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
	}
	
	
	@RequestMapping("/saveUser")
	public void saveUser(String userName, String password, String userType, HttpServletRequest request, HttpServletResponse response) throws Exception{
		User user = new User();
		user.setUserName(userName);
		user.setUserType(userType);
		user.setPassword(password);
		HttpSession session = request.getSession();
		User sameuser = userService.querySameUser(userName, userType);
		if(sameuser!=null){
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}else {
			userService.saveUser(user);
			session.setAttribute("user", user);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
	
	@RequestMapping("/removeUser")
	public String removeUser(String userId) throws Exception{
		userService.removeUser(userId);
		return StringUtil.REDIRECT+":userlist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String, Object> map) throws Exception{
		User user = userService.queryoneUser(id);
		map.put("user", user);
		return "usermodify";
	}
	
	@RequestMapping("/modifyUser")
	public String modifyUser(User user) throws Exception{
		userService.modifyUser(user);
		return StringUtil.REDIRECT+":userlist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String, Object> map) throws Exception{
		User user = userService.queryoneUser(id);
		map.put("user", user);
		return "userdetail";
	}
	
	@RequestMapping("/userlist")
	public String userlist(Map<String, Object> map) throws Exception{
		List<User> userList = userService.queryMoreUser();
		map.put("userList", userList);
		return "user";
	}
	
	@RequestMapping(value="/userName",produces={"text/html;charset=UTF-8;","application/json;"})
	public void userName(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<User> userName = userService.queryUserName();
		map.put("userName", userName);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray userNameArray = new JSONArray();
		for(User userNamemap : userName){
			JSONObject userNameObject = new JSONObject(userNamemap);
			userNameArray.put(userNameObject);
		}
		jsonObject.put("userNameArray", userNameArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
	
	@RequestMapping("/addWorkTime")
	public void addWorkTime(String userId, String userName, String userType, Date workTime, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int count = userService.saveWorkTime(userId, userName, userType, workTime);
		Map<String, Object> map = new HashMap<>();
		map.put("count", count);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("count", count);
		out.print(jsonObject);
	}
	
	
	
}
