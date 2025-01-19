//WAP to implement Threads by Extending Thread Class

import java.io.*;
import java.util.*;

public class extendingThreads extends Thread {
	public void run()
	{
		System.out.println("Thread Started Running...");
	}
	public static void main(String[] args)
	{
		extendingThreads t1 = new extendingThreads();
		t1.start();
	}
}
