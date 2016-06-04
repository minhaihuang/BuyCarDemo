package minhaihuang.buyCarDemo.main;

import java.util.HashMap;
import java.util.Map;

public class Car {
	Map<Goods,Integer> data;
	
	public Car(){
		data=new HashMap<Goods,Integer>();
	}
	
	public void buy(Goods goods){
		Integer count =data.get(goods);
		
		if(count==null){
			count=0;
		}
		
		count++;
		
		data.put(goods, count);
	}

	public Map<Goods, Integer> getData() {
		return data;
	}

	public void setData(Map<Goods, Integer> data) {
		this.data = data;
	}
	
	
}
