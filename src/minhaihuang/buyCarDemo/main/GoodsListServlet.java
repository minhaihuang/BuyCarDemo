package minhaihuang.buyCarDemo.main;
/**
 * 模仿购物车，利用session技术
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodsListServlet extends HttpServlet {
	
	//准备容器
	Map<String,Goods> goodsMap;
	@Override
	public void init() throws ServletException {
		super.init();
		//往容器添加数据
		goodsMap=new HashMap<String,Goods>();
		goodsMap.put("001", new Goods("001","华为","2000"));
		goodsMap.put("002", new Goods("002","三星","3000"));
		goodsMap.put("003", new Goods("003","小米","1800"));
		goodsMap.put("004", new Goods("004","魅族","3500"));
		goodsMap.put("005", new Goods("005","苹果","6000"));
		
		getServletContext().setAttribute("goodsMap", goodsMap);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("/BuyCarDemo/buy.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
