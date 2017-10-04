package Singleton;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FiveTon {
	
	private static List<FiveTon> list = Collections.synchronizedList(new LinkedList<FiveTon>());
	private static int index = 0;
	public static int numInstances = 0;

	private FiveTon()
	{
	}

	public static FiveTon getInstance() throws Exception
	{
		if(numInstances == 0)
		{
			FiveTon newObj1 = new FiveTon();
			list.add(newObj1);
			
			FiveTon newObj2 = new FiveTon();
			list.add(newObj2);
			
			numInstances = 2;
		}
		
		if(index < 2)
		{
			return list.get(index++);
		}
		else if(index == 2)
		{
			index++;
			if (numInstances == 2)
			{
				create();
				numInstances++;
			}
			return list.get(2);
		}		
		else
		{
			throw new Exception("Out of index");
		}
	}
	
	public static void freeInstance()
	{
		index--;
	}
	
	private static void create()
	{
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("Exceção");
		}
		synchronized(list)
		{
			FiveTon newObj = new FiveTon();
			list.add(newObj);
		}
	}
	
	public static void main (String args[])
	{
		FiveTon f1;
		FiveTon f2;
		FiveTon f3;
		FiveTon f4;
		FiveTon f5;
		
		try {
			f1 = FiveTon.getInstance();
			System.out.println(f1);
		}catch(Exception e)
		{
			System.out.println("Exceção na primeira execução");
		}
		
		try {
			f2 = FiveTon.getInstance();
			System.out.println(f2);
		}catch(Exception e)
		{
			System.out.println("Exceção na segunda execução");
		}
		
		try {
			f3 = FiveTon.getInstance();
			System.out.println(f3);
		}catch(Exception e)
		{
			System.out.println("Exceção na terceira execução");
		}
		
		try
		{
			f4 = FiveTon.getInstance();
			System.out.println(f4);
		}
		catch(Exception e)
		{
			System.out.println("Exceção na quarta execução");
		}
		
		FiveTon.freeInstance();
		
		try {
			f5 = FiveTon.getInstance();
			System.out.println(f5);
		}catch(Exception e)
		{
			System.out.println("Exceção na quinta execução");
		}
		
	}
}
