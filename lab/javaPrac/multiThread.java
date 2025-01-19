//WAP to implement Multi-Threading

import java.io.*;
import java.util.*;

class A extends Thread {
	public void run()
	{	
		for(int i=0; i<5; i++){
			System.out.println("A: "+i);
		}
		System.out.println("Exit A");	
	}
}

class B extends Thread {
	public void run()
	{	
		for(int i=0; i<5; i++){
			System.out.println("B: "+i);
		}
		System.out.println("Exit B");	
	}
}


public class multiThread extends Thread {
	
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}
