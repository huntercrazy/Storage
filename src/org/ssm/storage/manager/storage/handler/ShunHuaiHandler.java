package org.ssm.storage.manager.storage.handler;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.storage.converter.StringUtil;
import org.ssm.storage.manager.storage.entity.ShunHuai;
import org.ssm.storage.manager.storage.service.IShunHuaiService;

@Controller
@RequestMapping("/shunhuai")
public class ShunHuaiHandler {

	@Autowired
	private IShunHuaiService shunhuaiService;
	
	@RequestMapping("/saveShunHuai")
	public String saveShunHuai(String goodsName, String userName, Integer breakNum, String ckName, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		ShunHuai shunhuai = new ShunHuai();
		shunhuai.setGoodsName(goodsName);
		shunhuai.setUserName(userName);
		shunhuai.setBreakNum(breakNum);
		shunhuai.setCkName(ckName);
		shunhuai.setContent(content);
		shunhuaiService.saveShunHuai(shunhuai);
		return StringUtil.REDIRECT+":shunhuailist";
	}
	
	@RequestMapping("/removeShunHuai")
	public String removeShunHuai(int id) throws Exception{
		shunhuaiService.removeShunHuai(id);
		return StringUtil.REDIRECT+":shunhuailist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String,Object> map) throws Exception{
		ShunHuai shunhuai = shunhuaiService.queryoneShunHuai(id);
		map.put("shunhuai", shunhuai);
		return "shunhuaimodify";
	}
	
	@RequestMapping("/modifyShunHuai")
	public String modifyShunHuai(ShunHuai shunhuai) throws Exception{
		shunhuaiService.modifyShunHuai(shunhuai);
		return StringUtil.REDIRECT+":shunhuailist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String,Object> map) throws Exception{
		ShunHuai shunhuai = shunhuaiService.queryoneShunHuai(id);
		map.put("shunhuai", shunhuai);
		return "shunhuaidetail";
	}
	
	@RequestMapping("/shunhuailist")
	public String shunhuailist(Map<String,Object> map) throws Exception{
		List<ShunHuai> shunhuaiList = shunhuaiService.queryMoreShunHuai();
		map.put("shunhuaiList", shunhuaiList);
		return "shunhuai";
	}
	
	@RequestMapping("/myshunhuai")
	public void myshunhuai(String ckName, Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Map<String, Object>> myshunhuaiList = shunhuaiService.queryShunHuaiByckName(ckName);
		map.put("myshunhuaiList", myshunhuaiList);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray myshunhuaiArray = new JSONArray();
		for(Map<String, Object> myshunhuai : myshunhuaiList){
			JSONObject myshunhuaiObj = new JSONObject(myshunhuai);
			myshunhuaiArray.put(myshunhuaiObj);
		}
		jsonObject.put("myshunhuaiList", myshunhuaiArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
}
