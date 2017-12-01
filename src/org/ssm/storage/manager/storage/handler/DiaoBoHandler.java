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
import org.ssm.storage.manager.storage.entity.DiaoBo;
import org.ssm.storage.manager.storage.entity.KuCun;
import org.ssm.storage.manager.storage.service.IDiaoBoService;
import org.ssm.storage.manager.storage.service.IKuCunService;

@Controller
@RequestMapping("/diaobo")
public class DiaoBoHandler {

	@Autowired
	private IDiaoBoService diaoboService;
	@Autowired
	private IKuCunService kucunService;
	
	@RequestMapping("/saveDiaoBo")
	public String saveDiaoBo(String goodsName, String userName, Integer dbNum, String oldCkName, String newCkName, Double otherPrice, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String ckName = newCkName;
		KuCun kucun = kucunService.queryckName(goodsName, ckName);
		int onecount = kucunService.queryOneCount(goodsName, ckName);
		if(kucun==null ){
			kucun = new KuCun();
			kucun.setGoodsName(goodsName);
			kucun.setCunCount(dbNum);
			kucun.setCkName(ckName);
			kucunService.saveKuCun(kucun);
		}else{
			Integer cuncount = onecount+dbNum; 
			kucun = new KuCun();
			kucun.setCkName(ckName);
			kucun.setGoodsName(goodsName);
			kucun.setCunCount(cuncount);
			kucunService.modifyCount(kucun);
		}
//		System.out.println("应该是可以进来的吧");
		DiaoBo diaobo = new DiaoBo();
		diaobo.setGoodsName(goodsName);
		diaobo.setUserName(userName);
		diaobo.setDbNum(dbNum);
		diaobo.setOldCkName(oldCkName);
		diaobo.setNewCkName(newCkName);
		diaobo.setOtherPrice(otherPrice);
		diaobo.setContent(content);
		diaobo.setDbTime(new Date());
		System.out.println(goodsName);
		System.out.println(userName);
		diaoboService.saveDiaoBo(diaobo);
		System.out.println("save过了");
		return StringUtil.REDIRECT+":diaobolist";
	}
	
	@RequestMapping("/removeDiaoBo")
	public String removeDiaoBo(int id) throws Exception{
		diaoboService.removeDiaoBo(id);
		return StringUtil.REDIRECT+":diaobolist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String,Object> map) throws Exception{
		DiaoBo diaobo = diaoboService.queryoneDiaoBo(id);
		map.put("diaobo", diaobo);
		return "diaobomodify";
	}
	
	@RequestMapping("/diaobomodify")
	public String diaobomodify(DiaoBo diaobo,Map<String,Object> map) throws Exception{
		diaoboService.modifyDiaoBo(diaobo);
		return StringUtil.REDIRECT+":diaobolist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String,Object> map) throws Exception{
		DiaoBo diaobo = diaoboService.queryoneDiaoBo(id);
		map.put("diaobo", diaobo);
		return "diaobodetail";
	}
	
	@RequestMapping("/diaobolist")
	public String diaobolist(Map<String,Object> map) throws Exception{
		List<DiaoBo> diaoboList = diaoboService.queryMoreDiaoBo();
		map.put("diaoboList", diaoboList);
		return "diaobo";
	}
	
	@RequestMapping("/mydiaobo")
	public void mydiaobo(String oldCkName, String newCkName, Map<String,Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Map<String, Object>> mydiaoboList = diaoboService.queryDiaoBoByckName(oldCkName, newCkName);
		map.put("mydiaoboList", mydiaoboList);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray mydiaoboArray = new JSONArray();
		for(Map<String,Object> mydiaobo : mydiaoboList){
			JSONObject mydiaoboObj = new JSONObject(mydiaobo);
			mydiaoboArray.put(mydiaoboObj);
		}
		jsonObject.put("mydiaoboList", mydiaoboArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
		
	}
}
