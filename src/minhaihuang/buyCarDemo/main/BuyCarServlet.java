package minhaihuang.buyCarDemo.main;
/**
 * 这是购物车的servlet
 */
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BuyCarServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取到map，获取所有数据
		Map<String,Goods> goodsMap=(Map<String,Goods>)getServletContext().getAttribute("goodsMap");
		//获取点击购买商品的id。
		String goodsId=request.getParameter("goodsId");
		
		//获取到商品
		Goods goods=goodsMap.get(goodsId);
		
		
		if(goods!=null){
			Car car=(Car) request.getSession().getAttribute("car");
			if(car==null){
				car=new Car();
				request.getSession().setAttribute("car", car);
			}
			car.buy(goods);
		}
		
		request.getRequestDispatcher("/buyCar.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
