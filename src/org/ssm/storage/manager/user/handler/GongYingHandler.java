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
import org.ssm.storage.manager.user.entity.GongYing;
import org.ssm.storage.manager.user.entity.KeHu;
import org.ssm.storage.manager.user.service.IGongYingService;

@Controller
@RequestMapping("/gongying")
public class GongYingHandler {

	@Autowired
	private IGongYingService gongyingService;
	
	@RequestMapping("/saveGongYing")
	public String saveGongYing(String gyName, String gyAddress, String gyPhone, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		GongYing gongying = new GongYing();
		gongying.setGyName(gyName);
		gongying.setGyAddress(gyAddress);
		gongying.setGyPhone(gyPhone);
		gongying.setContent(content);
		gongyingService.saveGongYing(gongying);
		return StringUtil.REDIRECT+":gongyinglist";
	}
	
	@RequestMapping("/removeGongYing")
	public String removeGongYing(int id) throws Exception{
		gongyingService.removeGongYing(id);
		return StringUtil.REDIRECT+":gongyinglist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(String gyName,Map<String,Object> map) throws Exception{
		GongYing gongying = gongyingService.queryoneGongYing(gyName);
		map.put("gongying", gongying);
		return "gongyingmodify";
	}
	
	@RequestMapping("/modifyGongYing")
	public String modifyGongYing(int id, String gyName, String gyAddress, String gyPhone, String content ) throws Exception{
		GongYing gongying = new GongYing();
		gongying.setId(id);
		gongying.setGyName(gyName);
		gongying.setGyAddress(gyAddress);
		gongying.setGyPhone(gyPhone);
		gongying.setContent(content);
		gongyingService.modifyGongYing(gongying);
		return StringUtil.REDIRECT+":gongyinglist";
	}
	
	@RequestMapping("/detail")
	public String detail(String gyName,Map<String,Object> map) throws Exception{
		GongYing gongying = gongyingService.queryoneGongYing(gyName);
		map.put("gongying", gongying);
		return "gongyingdetail";
	}
	
	@RequestMapping("/gongyinglist")
	public String gongyinglist(Map<String,Object> map) throws Exception{
		List<GongYing> gongyingList = gongyingService.queryMoreGongYing();
		map.put("gongyingList", gongyingList);
		return "gongying";
	}
	
	@RequestMapping(value="/gyName",produces={"text/html;charset=UTF-8;","application/json;"})
	public void gyName(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<GongYing> gyName = gongyingService.queryGongYingName();
		map.put("gyName", gyName);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray gyNameArray = new JSONArray();
		for(GongYing gyNamemap : gyName){
			JSONObject gyNameObject = new JSONObject(gyNamemap);
			gyNameArray.put(gyNameObject);
		}
		jsonObject.put("gyNameArray", gyNameArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
}
