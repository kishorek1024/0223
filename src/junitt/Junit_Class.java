package junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Class {
	
	@BeforeClass
	public static void before(){
		System.out.println("This is Before");
	}
	@AfterClass
	public static void after(){
		System.out.println("This is After");
	}
	@Test
	public void x(){
		System.out.println("Test1");
	}
	@Test
	public void a(){
		System.out.println("Test2");
	}
	@Test
	public void k(){
		System.out.println("Test3");
	}

}
