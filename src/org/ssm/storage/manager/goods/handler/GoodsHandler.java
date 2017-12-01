package org.ssm.storage.manager.goods.handler;

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
import org.ssm.storage.manager.goods.entity.Goods;
import org.ssm.storage.manager.goods.service.IGoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsHandler {

	@Autowired
	private IGoodsService goodsService;
	
	@RequestMapping("/saveGoods")
	public String saveGoods(String goodsName, String goodsType, String goodsKind, String content, HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Goods goods = new Goods();
		goods.setGoodsName(goodsName);
		goods.setGoodsType(goodsType);
		goods.setGoodsKind(goodsKind);
		goods.setContent(content);
		goodsService.saveGoods(goods);
		return StringUtil.REDIRECT+":goodslist";
	}
	
	@RequestMapping("/removeGoods")
	public String removeGoods(int id) throws Exception{
		goodsService.removeGoods(id);
		return StringUtil.REDIRECT+":goodslist";
	}
	
	@RequestMapping("/tomodify")
	public String tomodify(int id,Map<String, Object> map) throws Exception{
		Goods goods = goodsService.queryoneGoods(id);
		map.put("goods", goods);
		return "goodsmodify";
	}
	
	@RequestMapping("/modifyGoods")
	public String modifyGoods(int id, String goodsName, String goodsType, String goodsKind, String content) throws Exception{
		Goods goods = new Goods();
		goods.setId(id);
		goods.setGoodsName(goodsName);
		goods.setGoodsType(goodsType);
		goods.setGoodsKind(goodsKind);
		goods.setContent(content);
		goodsService.modifyGoods(goods);
		return StringUtil.REDIRECT+":goodslist";
	}
	
	@RequestMapping("/detail")
	public String detail(int id,Map<String, Object> map) throws Exception{
		Goods goods = goodsService.queryoneGoods(id);
		map.put("goods", goods);
		return "goodsdetail";
	}
	
	@RequestMapping("/detailN")
	public String detailM(String goodsName,Map<String, Object> map) throws Exception{
		Goods goods = goodsService.queryoneGoodsN(goodsName);
		map.put("goods", goods);
		return "goodsdetail";
	}
	
	@RequestMapping("/goodslist")
	public String goodslist(Map<String, Object> map) throws Exception{
		List<Goods> goodsList = goodsService.queryMoreGoods();
		map.put("goodsList", goodsList);
		return "goods";
	}
	
	@RequestMapping("/gdName")
	public void gdName(Map<String, Object> map, HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("我应该是可以进来的啊");
		List<Goods> goodsName = goodsService.querygoodsName();
		System.out.println("看一下长度======"+ goodsName.size());
		map.put("goodsName", goodsName);
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		JSONArray goodsNameArray = new JSONArray();
		for(Goods goodsNamemap : goodsName){
			JSONObject goodsNameObject = new JSONObject(goodsNamemap);
			goodsNameArray.put(goodsNameObject);
		}
		jsonObject.put("goodsNameArray", goodsNameArray);
		jsonObject.put("error", "");
		out.print(jsonObject);
	}
}
