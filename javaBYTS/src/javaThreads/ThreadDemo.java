package javaThreads;

class MyThread extends Thread{
	public void run(){
		for(int i = 0;i<10;i++) {
			System.out.println("Dhanvanth");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.run();
		for(int i = 0;i<10;i++) {
			System.out.println("S B");
		}

	}

}
