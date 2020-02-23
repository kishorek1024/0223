package packone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Notepaddd {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD10Jan\\0202.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Kishore Kumar");
		bw.newLine();
		bw.append("This is Selenium");
	
		bw.close();
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD10Jan\\0131.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null){
			String[] val=s.split(" ");
		if(val.length==2)
			System.out.println(s);
		}*/
	}

}
