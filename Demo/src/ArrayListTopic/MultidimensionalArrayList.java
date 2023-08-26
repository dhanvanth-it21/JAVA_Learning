package ArrayListTopic;
import java.util.ArrayList;
import java.util.Scanner;
public class MultidimensionalArrayList {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
;	// TODO Auto-generated method stub
		//created a multiDimension ArrayList
// ArrayList inside ArrayList
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        //	[null,null,...]
		//now initializing the inner ArrayList
		
		for(int i = 0;i<3.;i++) {
			list.add(new ArrayList<>());
			
		}
		
//		[[null,null...],[null,null...],[null,null...]]
		//to access the element of the inner ArrayList
		// lsuit.get(i) => this will return the inner ArrayList
		// list.get(i).add(Element) => will add the element in side the inner ArrayList
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				list.get(i).add(in.nextInt());
			}
		}
//		input => 1 2 3 4 5 6 7 8 9
		System.out.println(list);
//		printing the list => [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
	}

}
