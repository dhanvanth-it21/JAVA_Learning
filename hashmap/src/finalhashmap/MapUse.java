package finalhashmap;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Map<>();
		for(int i = 0;i<20;i++) {
			map.insert("abc"+i, i+1);
			System.out.println(map.loadFactor());
		}
		
		map.removeNode("abc3");
		map.removeNode("abc7");
		for(int i = 0;i<20;i++) {
			System.out.println("abc"+i+" : " + map.getValue("abc"+i));
		}

	}

}
