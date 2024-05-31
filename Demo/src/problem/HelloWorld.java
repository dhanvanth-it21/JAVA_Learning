package problem;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;


class HelloWorld {




 public static void solve(ArrayList<Range> arr, Range obj){
     int s = obj.startRange;
     int e = obj.endRange;
     int sum = obj.value;
     int n = arr.size();
     for(int i = 0; i < n ; i++){
         int as = arr.get(i).startRange;
         int ae = arr.get(i).endRange;
         boolean check = false;
         if(s >= as && s <= ae){
             s = Math.min(s,as);
             check = true;
         }
         if(e >= as && e <= ae){
             e = Math.max(e,ae);
             check = true;
         }
         if(as >= s && as <= e){
             s = Math.min(s,as);
             check = true;
         }
         if(ae >= s && ae <= e){
             e = Math.max(e,ae);
             check = true;
         }
         if(check){
             sum += arr.get(i).value;
             arr.remove(i);
             n = arr.size();
             i--;
         }
        
        
     }
     arr.add(new Range(s,e,sum));
 }







 public static void print(ArrayList<Range> arr) {
System.out.println("Range \t Value");
int n = arr.size();
for(int i = 0;i<n;i++) {
System.out.println(arr.get(i).startRange+"-"+arr.get(i).endRange+ " \t "+ arr.get(i).value);
}
System.out.println("\n");
}

public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
ArrayList<Range> arr = new ArrayList<>();

int iteration = 0;
boolean check = true;
while(check) {
iteration++;
System.out.println("iteration : " + iteration);

System.out.println("Enter Start Range :");
int start = sc.nextInt();
System.out.println("Enter End Range :");
int end = sc.nextInt();
System.out.println("Enter value to be stored :");
int vlaue = sc.nextInt();

Range obj = new Range(start, end, vlaue);
//arr.add(obj);
solve(arr, obj);
print(arr);
}

}

}

class Range{
 int startRange;
int endRange;
int value;

public Range(int s, int e, int v) {
//TODO Auto-generated constructor stub
this.startRange = s;
this.endRange = e;
this.value = v;
}

}
