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
import org.ssm.storage.manager.storage.entity.ChuKu;
import org.ssm.storage.manager.storage.entity.KuCun;
import org.ssm.storage.manager.storage.service.IChuKuService;
import org.ssm.storage.manager.storage.service.IKuCunService;

@Controller
@RequestMapping("/chuku")
public class ChuKuHandler {

	@Autowired
	private IChuKuService chukuService;
	@Autowired
	private IKuCunService kucunService;
	
	@RequestMapping("/saveChuKu")
	public String saveChuKu(String goodsName, String userName, Double outPrice, Integer outNum, String khName, String ckName, String status, Double otherPrice, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int onecount = kucunService.queryOneCount(goodsName, ckName);
		Integer cunCount = onecount-outNum;
		KuCun kucun = new KuCun();
		kucun.setCkName(ckName);
		kucun.setGoodsName(goodsName);
		kucun.setCunCount(cunCount);
		kucunService.modifyCount(kucun);
		
		ChuKu chuku = new ChuKu();
		chuku.setGoodsName(goodsName);
		chuku.setUserName(userName);
		chuku.setOutTime(new Date());
		chuku.setOutPrice(outPrice);
		chuku.setOutNum(outNum);
		chuku.setKhName(khName);
		chuku.setCkName(ckName);
		chuku.setStatus(status);
		chuku.setOtherPrice(otherPrice);
		chuku.setContent(content);
		
		chukuService.saveChuKu(chuku);
		return StringUtil.REDIRECT+":chukulist";
	}
	
	@RequestMapping("/removeChuKu")
	public String removeChuKu(int id) throws Exception{
		chukuService.removeChuKu(id);
		return StringUtil.REDIRECT+":chukulist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String,Object> map) throws Exception{
		ChuKu chuku = chukuService.queryoneChuKu(id);
		map.put("chuku", chuku);
		return "chukumodify";
	}
	
	@RequestMapping("/modifyChuKu")
	public String modifyChuKu(ChuKu chuku) throws Exception{
		chukuService.modifyChuKu(chuku);
		return StringUtil.REDIRECT+":chukulist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String,Object> map) throws Exception{
		ChuKu chuku = chukuService.queryoneChuKu(id);
		map.put("chuku", chuku);
		return "chukudetail";
	}
	
	@RequestMapping("/chukulist")
	public String chukulist(Map<String,Object> map) throws Exception{
		List<ChuKu> chukuList = chukuService.queryMoreChuKu();
		map.put("chukuList", chukuList);
		return "chuku";
	}
	
	@RequestMapping("/getinfo")
	public String getinfo(Map<String, Object> map, String goodsName, String ckName) throws Exception{
		int count = chukuService.querycounts(goodsName, ckName);
		Double outPrice = chukuService.queryoutPrice(goodsName, ckName);
		Double totaloutP = count * outPrice;
		map.put("count", count);
		map.put("outPrice", outPrice);
		map.put("totaloutP", totaloutP);
		return null;//此处的return需要改
	}
	
	@RequestMapping("/mychuku")
	public void mychuku(String ckName, Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Map<String,Object>> mychukuList = chukuService.queryChuKuByckName(ckName);
		map.put("mychukuList", mychukuList);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray mychukuArray = new JSONArray();
		for(Map<String,Object> mychuku : mychukuList){
			JSONObject mychukuObj = new JSONObject(mychuku);
			mychukuArray.put(mychukuObj);
		}
		jsonObject.put("mychukuList", mychukuArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
}
