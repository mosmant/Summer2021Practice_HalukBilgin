package day14_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Maps1 {
	public static void main(String[] args) {
		//MAplarde bir keye karþýlýk birden fazla value olabilir mi?
		
			/*  meyveler			--> elma
								armut
								çilek
				sebzeler		-->kabak
								patlýcan
								marul
								ýspanak
								
				vitaminler		a
								b
								c
								d
								
								*/
				
			HashMap<String, List<String> > karisik =new HashMap<>();
			
			/*					
			List<String>meyveler=new ArrayList();
			meyveler.add("elma");
			meyveler.add("armut");
			meyveler.add("çilek");
			System.out.println(meyveler);
			*/
			
			List<String> meyveler=Arrays.asList("elma","armut","çilek");
			karisik.put("meyveler",meyveler );
			
			List<String> sebzeler=Arrays.asList("kabak","patlýcan","marul","ýspanak");
			karisik.put("sebzeler", sebzeler);
			
			List<String> vitaminler=Arrays.asList("a","b","c","d");
			karisik.put("vitaminler", vitaminler);
			System.out.println(karisik);
			
	}

}
