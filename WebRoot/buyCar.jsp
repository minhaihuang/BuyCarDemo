<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="minhaihuang.buyCarDemo.main.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>购物车</h1>
	<table>
		<tr>
			<td>商品名名称</td>
			<td>商品单价</td>
			<td>购买数量</td>
			<td>操作</td>
		</tr>
		
		<% 
		  	Car car=(Car)session.getAttribute("car");
		  	Map<Goods,Integer> goodsCar=car.getData();
		  	
		  	Set<Goods> set=goodsCar.keySet();
		  	Iterator<Goods> it=set.iterator();
		  	
		  	while(it.hasNext()){
		  	Goods goods=it.next();
		  	%>
		  	<tr>
		  		<td><%=goods.getGoodsName() %></td>
		  		<td><%=goods.getGoodsPrice() %></td>
		  		<td><%=goodsCar.get(goods) %></td>
		  		<td><a href="xxxxxxx">删除</a></td>
		  	</tr>
		  	<%
		  	
		  	}
		 %>
	</table>
	
	<br/>
	<a href="/BuyCarDemo/GoodsList">返回商品列表</a>
</body>
</html>