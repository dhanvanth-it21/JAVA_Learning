package sortingTechniques;

public class SortUse {
	
	
	public static void main(String[] args) {
		///using bubble sort object
		System.out.println("Bubble Sort : ");
		int[] bArr = {5, 2, 8, 1, 7, 4, 6, 3, 9, 10, 12, 
				14, 15, 16, 18, 20, 22, 24, 26, 28, 30, 
				32, 34, 36, 8, 40, 42, 44, 46, 48, 50}; 
		BubbleSort bso = new BubbleSort(bArr);
		System.out.println(bso);

		
		//using selection sort object
		System.out.println("Selection Sort : ");
		int[] sArr = {5, 2, 8, 1, 7, 4, 6, 3, 9, 10, 12, 
				14, 15, 16, 18, 20, 22, 24, 26, 28, 30, 
				32, 34, 36, 8, 40, 42, 44, 46, 48, 50};
		SelectionSort sso = new SelectionSort(sArr);
		System.out.println(sso);
		
		
		//using insertion sort object
				System.out.println("Insertion Sort : ");
				int[] iArr = {5, 2, 8, 1, 7, 4, 6, 3, 9, 10, 12, 
						14, 15, 16, 18, 20, 22, 24, 26, 28, 30, 
						32, 34, 36, 8, 40, 42, 44, 46, 48, 50};
				InsertionSort iso = new InsertionSort(iArr);
				System.out.println(iso);
				
				
		//using merge sort object not in_place
		System.out.println("Merge Sort : ");
		int[] mArr = {5, 2, 8, 1, 7, 4, 6, 3, 9, 10, 12, 
				14, 15, 16, 18, 20, 22, 24, 26, 28, 30, 
				32, 34, 36, 8, 40, 42, 44, 46, 48, 50};
		MergeSort mso = new MergeSort(mArr);
		System.out.println(mso);
		
		//using heap sort object in_place DSEC
		System.out.println("Merge Sort : ");
		int[] hArr = {5, 2, 8, 1, 7, 4, 6, 3, 9, 10, 12, 
				14, 15, 16, 18, 20, 22, 24, 26, 28, 30, 
				32, 34, 36, 8, 40, 42, 44, 46, 48, 50};
		HeapSortInPlace hso = new HeapSortInPlace(hArr);
		System.out.println(hso);
		
	}

}
