//WAP to implement Thread by using Runnable Interface

import java.io.*;
import java.util.*;

public class runnableInterface implements Runnable {
	public void run()
	{
		System.out.println("Thread is Running Successfully");
	}

	public static void main(String[] args)
	{
		runnableInterface r1 = new runnableInterface();
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
