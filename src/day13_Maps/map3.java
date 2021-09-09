package day13_Maps;

import java.util.HashMap;

public class map3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(101, "Ali Han");// eleman eklemek için kullanýlýr. 
		hm1.put(102, "veli Can");
		hm1.put(103, "Ayþe Tan");
		hm1.put(101, "Kemal Yýldýz"); // ayný key kullanýldýðýnda eski kaydýn üzerine yazar.
		System.out.println(hm1);
		
		hm1.put(104, "veli Can"); //tekrarlý kEye izin vermez ancak tekrarlý value ya izin verir.
		System.out.println(hm1);
		
		hm1.put(null, "merve aslan");
		
		System.out.println(hm1);
		
		
		hm1.put(null,"hakan inal");
		System.out.println(hm1);
		
		hm1.put(105,null);
		System.out.println(hm1);
		hm1.put(106,null);
		System.out.println(hm1);
		
		System.out.println(hm1.get(103));
		
		System.out.println(hm1.values());
		
		System.out.println(hm1.keySet());
		
		hm1.putIfAbsent(104, "kubilay tuncel");//belirtilen key e ait key ve value olduðu için eklemedi
		System.out.println("---------------------------------------");
		System.out.println(hm1.putIfAbsent(104, "kubilay tuncel"));
		System.out.println(hm1);
		
		
		
		
		System.out.println("--------------////----------------");
		System.out.println(hm1.putIfAbsent(107, "hakan tetik"));
		System.out.println(hm1);
		
		hm1.putIfAbsent(105, "faruk efehan");
		System.out.println(hm1);
		
		System.out.println("1. mapin eleman sayýsý :"+hm1.size());
		
		HashMap<Integer,String>hm2=new HashMap<>();
		hm2.put(107, "elma");
		hm2.put(106, "Armut");
		hm2.put(200, "mandalina");
		
		System.out.println("2. mapin eleman sayýsý :"+hm2.size());
		
		hm1.putAll(hm2);
		
		System.out.println(hm1);
		System.out.println("1. mapin eleman sayýsý :"+hm1.size());
		//hm2.putAll(hm1);
		System.out.println(hm2);
		
		
		

	}

}