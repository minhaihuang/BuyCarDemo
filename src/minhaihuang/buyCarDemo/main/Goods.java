package minhaihuang.buyCarDemo.main;
/**
 * 创建一个商品类，有商品名称，商品id和商品价格三个属性
 * @author 黄帅哥
 *
 */
public class Goods {
	
	private String id;
	private String goodsName;
	private String goodsPrice;
	
	public Goods(String id, String goodsName, String goodsPrice) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsPrice() {
		return goodsPrice;
	}
	
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	
}
