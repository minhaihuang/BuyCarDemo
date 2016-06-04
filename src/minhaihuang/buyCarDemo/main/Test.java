package minhaihuang.buyCarDemo.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<Goods,Integer> map=new HashMap<Goods,Integer>();
		
		map.put(new Goods("001","hhm","3000"), 1);
		map.put(new Goods("002","hhm01","3000"), 2);
		map.put(new Goods("003","hhm02","3000"), 3);
		map.put(new Goods("004","hhm03","3000"), 4);
		map.put(new Goods("005","hhm04","3000"), 5);
		
		Set<Goods> set=map.keySet();
		
		Iterator<Goods> it=set.iterator();
		
		while(it.hasNext()){
			Goods goods=it.next();
			System.out.println(goods.getGoodsName());
		}
	}
}
