package org.ssm.storage.manager.storage.handler;

import java.io.PrintWriter;
import java.util.Date;
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
import org.ssm.storage.manager.storage.entity.KuCun;
import org.ssm.storage.manager.storage.entity.RuKu;
import org.ssm.storage.manager.storage.service.IKuCunService;
import org.ssm.storage.manager.storage.service.IRuKuService;

@Controller
@RequestMapping("/ruku")
public class RuKuHandler {

	@Autowired
	private IRuKuService rukuService;
	@Autowired
	private IKuCunService kucunService;
	
	@RequestMapping("/saveRuKu")
	public String saveRuKu(String goodsName, String userName, Double inPrice, Integer inNum, String gyName, String ckName, String status, Double otherPrice, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		KuCun kucun = kucunService.queryckName(goodsName, ckName);
		int onecount = kucunService.queryOneCount(goodsName, ckName);
		if(kucun==null ){
			kucun = new KuCun();
			kucun.setGoodsName(goodsName);
			kucun.setCunCount(inNum);
			kucun.setCkName(ckName);
			kucunService.saveKuCun(kucun);
		}else{
			Integer cuncount = onecount+inNum; 
			kucun = new KuCun();
			kucun.setCkName(ckName);
			kucun.setGoodsName(goodsName);
			kucun.setCunCount(cuncount);
			kucunService.modifyCount(kucun);
			
		}
		
		
		RuKu ruku = new RuKu();
		ruku.setGoodsName(goodsName);
		ruku.setUserName(userName);
		ruku.setInTime(new Date());
		ruku.setInPrice(inPrice);
		ruku.setInNum(inNum);
		ruku.setGyName(gyName);
		ruku.setCkName(ckName);
		ruku.setStatus(status);
		ruku.setOtherPrice(otherPrice);
		ruku.setContent(content);
		rukuService.saveRuKu(ruku);
		return StringUtil.REDIRECT+":rukulist";
	}
	
	@RequestMapping("/removeRuKu")
	public String removeRuKu(int id) throws Exception{
		rukuService.removeRuKu(id);
		return StringUtil.REDIRECT+":rukulist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String,Object> map) throws Exception{
		RuKu ruku = rukuService.queryoneRuKu(id);
		map.put("ruku", ruku);
		return "rukumodify";
	}
	
	@RequestMapping("/modifyRuKu")
	public String modifyRuKu(RuKu ruku) throws Exception{
		rukuService.modifyRuKu(ruku);
		return StringUtil.REDIRECT+":rukulist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String,Object> map) throws Exception{
		RuKu ruku = rukuService.queryoneRuKu(id);
		map.put("ruku", ruku);
		return "rukudetail";
	}
	
	@RequestMapping("/rukulist")
	public String rukulist(Map<String,Object> map) throws Exception{
		List<RuKu> rukuList = rukuService.queryMoreRuku();
		map.put("rukuList", rukuList);
		return "ruku";
	}
	
	@RequestMapping("/getinfo")
	public String getinfo(Map<String, Object> map, String goodsName, String ckName) throws Exception{
		int count = rukuService.querycounts(goodsName, ckName);
		Double inPrice = rukuService.queryinPrice(goodsName, ckName);
		Double totalinP = count * inPrice;
		map.put("count", count);
		map.put("inPrice", inPrice);
		map.put("totalinP", totalinP);
		return null;//此处的return需要做修改
	}
	
	@RequestMapping("/myruku")
	public void myruku(String ckName, Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Map<String, Object>> myrukuList = rukuService.queryRuKuByckName(ckName);
		map.put("myrukuList", myrukuList);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray myrukuArray = new JSONArray();
		for(Map<String, Object> myruku : myrukuList){
			JSONObject myrukuObj = new JSONObject(myruku);
			myrukuArray.put(myrukuObj);
		}
		jsonObject.put("myrukuList", myrukuArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
}
