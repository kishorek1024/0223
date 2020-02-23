package packone;

import java.io.BufferedReader;
import java.io.FileReader;

public class NotePad {

	public static void main(String[] args) throws Exception {
		
		FileReader f=new FileReader("‪C:\\Users\\DELL\\Desktop\\WD10Jan\\0131.txt");
		BufferedReader b=new BufferedReader(f);
		
		System.out.println(b.readLine());

	}

}
