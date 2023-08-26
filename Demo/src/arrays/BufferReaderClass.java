package arrays;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferReaderClass {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader ir = new InputStreamReader(System.in);
		//ir is object for the InputStreamReader
		// ir will get input by byte by byte
		//ir will then decode the input to character stream
		// and ir will store the character stream in the buffer
		
		BufferedReader br = new BufferedReader(ir);
		//br is the object of the BufferReader class
		//br will read the character stream from the buffer stored by the ir
		// Buffer Reader can only read characters and strings
		// two functions of BufferReader
		//read();  reads only singlr character
		//readLine(); read multiple character nd strings
		
		String s = br.readLine();
		String[] sarr = s.split(" ");
		//split function have the delimiter as space
		System.out.println(s);
		for(int i = 0;i<sarr.length;i++) {
			System.out.print(sarr[i]+ " ");
		}

	}

}
