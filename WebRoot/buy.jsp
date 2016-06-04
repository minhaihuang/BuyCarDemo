<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,minhaihuang.buyCarDemo.main.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>商品列表</h1>
	<table>
		<tr>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>操作</td>
		</tr>
		
		<%
			Map<String,Goods> goodsMap=(Map<String,Goods>)getServletContext().getAttribute("goodsMap");
			Collection<Goods> goodsAll=goodsMap.values();
			
			//for(int i=0;i<goodsAll.size();i++)
			for(Goods it:goodsAll){
			%>
			<tr>
				<td><%=it.getGoodsName() %></td>
				<td><%=it.getGoodsPrice() %></td>
				<td><a href="/BuyCarDemo/BuyCar?goodsId=<%=it.getId()%>">购买</a></td>	
			</tr>
			<%
			}
		 %>
	</table>
</body>
</html>