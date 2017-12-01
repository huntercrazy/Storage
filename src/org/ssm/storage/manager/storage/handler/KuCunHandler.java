package org.ssm.storage.manager.storage.handler;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.storage.converter.StringUtil;
import org.ssm.storage.manager.storage.entity.KuCun;
import org.ssm.storage.manager.storage.service.IKuCunService;

@Controller
@RequestMapping("/kucun")
public class KuCunHandler {

	@Autowired
	private IKuCunService kucunService;
	
	@RequestMapping("/queryallbyname")
	public String queryallbyname(String goodsName,Map<String,Object> map) throws Exception{
		
		List<KuCun> kucunList = kucunService.queryAllKuCunByName(goodsName);
		map.put("kucunList", kucunList);
		return "kucunlist";
	}
	
	@RequestMapping("/queryall")
	public String queryall(Map<String,Object> map) throws Exception{
		List<KuCun> kucunList = kucunService.queryAllKuCun();
		map.put("kucunList", kucunList);
		return "kucunlist";
	}
	
	@RequestMapping("/getOneCount")
	public void getOneCount(String goodsName, String ckName, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int onecount = kucunService.queryOneCount(goodsName, ckName);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("onecount", onecount);
		out.print(onecount);
	}
	
	@RequestMapping("/modifyoldCK")
	public String modifyoldCk(String goodsName, String userName, Integer dbNum, String oldCkName, String newCkName, Double otherPrice, String content,String ckName, HttpServletRequest request, HttpServletResponse response) throws Exception{
		int onecount = kucunService.queryOneCount(goodsName, ckName);
		Integer cunCount = onecount-dbNum;
		KuCun kucun = new KuCun();
		kucun.setCkName(ckName);
		kucun.setGoodsName(goodsName);
		kucun.setCunCount(cunCount);
		kucunService.modifyCount(kucun);
		return StringUtil.REDIRECT+":diaobo/saveDiaoBo?goodsName=" + goodsName + "&userName=" + userName + "&dbNum=" + dbNum + "&oldCkName=" + oldCkName + "&newCkName=" + newCkName + "&otherPrice=" + otherPrice + "&content=" + content;
	}
	
	@RequestMapping("/ckdetail")
	public String ckdetail(String ckName, HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<KuCun> ckkucunList = kucunService.kcckList(ckName);
		Map<String,Object> map = new HashMap<>();
		map.put("ckkucunList", ckkucunList);
		return "cangku";
	}
}
