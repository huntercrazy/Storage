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
import org.ssm.storage.manager.storage.entity.CangKu;
import org.ssm.storage.manager.storage.service.ICangKuService;
import org.ssm.storage.manager.storage.service.IChuKuService;
import org.ssm.storage.manager.storage.service.IDiaoBoService;
import org.ssm.storage.manager.storage.service.IRuKuService;
import org.ssm.storage.manager.storage.service.IShunHuaiService;

@Controller
@RequestMapping("/cangku")
public class CangKuHandler {

	@Autowired
	private ICangKuService cangkuService;
	@Autowired
	private IChuKuService chukuService;
	@Autowired
	private IDiaoBoService diaoboService;
	@Autowired
	private IRuKuService rukuService;
	@Autowired
	private IShunHuaiService shunhuaiService;
	
	@RequestMapping("/saveCangKu")
	public String saveCangKu(String ckName, String userName, String ckAddress, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		CangKu cangku = new CangKu();
		cangku.setCkName(ckName);
		cangku.setUserName(userName);
		cangku.setCkAddress(ckAddress);
		cangku.setContent(content);
		cangkuService.saveCangKu(cangku);
		return StringUtil.REDIRECT+":cangkulist";//页面saveCangKu  可换
	}

	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String,Object> map) throws Exception{
		CangKu cangku = cangkuService.queryoneCangKu(id);
		map.put("cangku", cangku);
		return "cangkumodify";//页面detail
	}
	
	@RequestMapping("/modifyCangKu")
	public String modifycangku(int id, String ckName, String userName, String ckAddress, String content) throws Exception{
		CangKu cangku = new CangKu();
		cangku.setId(id);
		cangku.setCkName(ckName);
		cangku.setUserName(userName);
		cangku.setCkAddress(ckAddress);
		cangku.setContent(content);
		cangkuService.modifyCangKu(cangku);
		return StringUtil.REDIRECT+":cangkulist";//请求转发到页面list
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String,Object> map) throws Exception{
		CangKu cangku = cangkuService.queryoneCangKu(id);
		map.put("cangku", cangku);
		return "cangkudetail";//页面  detail
	}
	
	@RequestMapping("/detailN")
	public String detailN(String ckName,Map<String,Object> map) throws Exception{
		CangKu cangku = cangkuService.queryoneCangKuN(ckName);
		map.put("cangku", cangku);
		return "cangkudetail";
	}
	
	@RequestMapping("/cangkulist")
	public String cangkulist(Map<String,Object> map) throws Exception{
		List<CangKu> cangkuList = cangkuService.queryMoreCangKu();
		map.put("cangkuList", cangkuList);
		return "cangku";//页面  list
	}
	
	@RequestMapping("/ckNamelist")
	public String ckNamelist(Map<String, Object> map) throws Exception{
		List<CangKu> ckNameList = cangkuService.queryCangKuName();
		map.put("ckNameList", ckNameList);
		return "newdiaobo";
	}
	
	
	//这个方法的目的是为了方便所有需要使用到仓库的部分，用ajax调用方法，目前是试着使用，不一定好用
	@RequestMapping(value="/ckName",produces={"text/html;charset=UTF-8;","application/json;"})
	public void ckName(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
//		System.out.println("看看ajax是不是进来了");
		List<CangKu> ckName = cangkuService.queryCangKuName();
//		System.out.println(ckName.size());
//		System.out.println(ckName.get(0).getCkName());
		map.put("ckName", ckName);
//		request.setAttribute("ckName", ckName);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray ckNameArray = new JSONArray();
		for(CangKu ckNamemap : ckName){
			JSONObject ckNameObject = new JSONObject(ckNamemap);
			ckNameArray.put(ckNameObject);
		}
		jsonObject.put("ckNameArray", ckNameArray);
//		jsonObject.put("www", "我就是我");
//		jsonObject.put("qqq", "qqqqqqqq");
		jsonObject.put("error", "");
		out.print(jsonObject);
//		return "newdiaobo";
	}
	
	@RequestMapping("/ownercangku")
	public String ownercangku(String userName, Map<String, Object> map) throws Exception{
		List<CangKu> ownerList = cangkuService.queryownerCangku(userName);
		map.put("ownerList", ownerList);
		return "business";
	}
	
	@RequestMapping("/mycangku")
	public String mycangku(String ckName, Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("wo jin lai l ");
		String oldCkName = ckName;
		String newCkName = ckName;
		List<Map<String,Object>> mychukuList = chukuService.queryChuKuByckName(ckName);
		map.put("mychukuList", mychukuList);
		System.out.println(mychukuList.size()+"======================");
		List<Map<String, Object>> mydiaoboList = diaoboService.queryDiaoBoByckName(oldCkName, newCkName);
		map.put("mydiaoboList", mydiaoboList);
		System.out.println(mydiaoboList.size()+"===================");
		List<Map<String, Object>> myrukuList = rukuService.queryRuKuByckName(ckName);
		map.put("myrukuList", myrukuList);
		List<Map<String, Object>> myshunhuaiList = shunhuaiService.queryShunHuaiByckName(ckName);
		map.put("myshunhuaiList", myshunhuaiList);
		return StringUtil.REDIRECT+":${pageContext.request.contextPath }/cangku/ownercangku";
	}
}
