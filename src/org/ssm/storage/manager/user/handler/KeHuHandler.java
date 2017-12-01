package org.ssm.storage.manager.user.handler;

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
import org.ssm.storage.manager.user.entity.KeHu;
import org.ssm.storage.manager.user.service.IKeHuService;

@Controller
@RequestMapping("/kehu")
public class KeHuHandler {

	@Autowired
	private IKeHuService kehuService;
	
	@RequestMapping("/saveKeHu")
	public String saveKeHu(String khName, String khAddress, String khPhone, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		KeHu kehu = new KeHu();
		kehu.setKhName(khName);
		kehu.setKhAddress(khAddress);
		kehu.setKhPhone(khPhone);
		kehu.setContent(content);
		kehuService.saveKeHu(kehu);
		return StringUtil.REDIRECT+":kehulist";
	}
	
	@RequestMapping("/removeKeHu")
	public String removeKeHu(int id) throws Exception{
		kehuService.removeKeHu(id);
		return StringUtil.REDIRECT+":kehulist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String,Object> map) throws Exception{
		KeHu kehu = kehuService.queryoneKeHu(id);
		map.put("kehu", kehu);
		return "kehumodify";
	}
	
	@RequestMapping("/modifyKeHu")
	public String modifyKeHu(KeHu kehu) throws Exception{
		kehuService.modifyKeHu(kehu);
		return StringUtil.REDIRECT+":kehulist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String,Object> map) throws Exception{
		KeHu kehu = kehuService.queryoneKeHu(id);
		map.put("kehu", kehu);
		return "kehudetail";
	}
	
	@RequestMapping("/detailN")
	public String detailN(String khName,Map<String,Object> map) throws Exception{
		KeHu kehu = kehuService.queryoneKeHuN(khName);
		map.put("kehu", kehu);
		return "kehudetail";
	}
	
	@RequestMapping("/kehulist")
	public String kehulist(Map<String, Object> map) throws Exception{
		List<KeHu> kehuList = kehuService.queryMoreKeHu();
		map.put("kehuList", kehuList);
		return "kehu";
	}
	
	
	@RequestMapping(value="/khName",produces={"text/html;charset=UTF-8;","application/json;"})
	public void khName(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<KeHu> khName = kehuService.queryKeHuName();
		map.put("khName", khName);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray khNameArray = new JSONArray();
		for(KeHu khNamemap : khName){
			JSONObject khNameObject = new JSONObject(khNamemap);
			khNameArray.put(khNameObject);
		}
		jsonObject.put("khNameArray", khNameArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
	
	
}
