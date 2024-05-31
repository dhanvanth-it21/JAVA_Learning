package DemoPackage;

import java.util.Scanner;

import java.util.*;


public class DemoClass {

	public static void main(String[] args)
    {



        ArrayList<Integer> arr1 = new ArrayList<Integer>();
  
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
  
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
  

        for (int i = 1; i <= 5; i++) {
            arr1.add(i);
            arr2.add(i);
        }
  
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
//        
//        
        System.out.println(arr1.get(0));
        System.out.println(arr1.get(4));
//        
        arr1.set(0,100);
        System.out.println(arr1);
//        
//        
        arr1.add(0,1);
        System.out.println(arr1);
//        
//        
        arr1.remove(1);
        System.out.println(arr1);
//        
        System.out.println(arr1.size());
//        
//        
        System.out.println(arr1.contains(100));
        System.out.println(arr1.contains(1));
//        
//        
//        
        arr1.add(400);
        arr1.add(54);
        arr1.add(51);
        arr1.add(300);
        
        System.out.println(arr1);
        
        
        
        Collections.sort(arr1);
        System.out.println(arr1);
//        
//        
//        
        arr1.clear();
        System.out.println(arr1);
        

              
        
    }

}
