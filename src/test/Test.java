package test;

import java.net.NetworkInterface;
import java.net.SocketException;

public class Test {

	
	public static void main(String [] args) throws SocketException {
		
		
		System.out.println(System.getProperty("java.library.path"));
		//System.out.println(NetworkInterface.getByName("enp2s0").getDisplayName());
		
		int LEN = 8000;
		long time;
       
		time = System.nanoTime();
		double b = ((LEN<<3)>>>10);
		System.out.println("b time is " + (System.nanoTime()-time));
		
	    time = System.nanoTime();
		double a = (double)LEN*8/1024;
        System.out.println("a time is " + (System.nanoTime()-time));	
        
        
       	
		
		
		
		System.out.println(a);
		
		
	}
	
}
