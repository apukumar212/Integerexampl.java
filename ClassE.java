package com.pack1;

public class ClassE
{
public int meth1()
{
	System.out.println("HI");
	String data=new ClassE().meth2();
	System.out.println(data);
	return 100;
}
String meth2() 
{
	System.out.println("HELLO");
	return"JAVA";
}
public static void main(String[] args)
{
	ClassE eobj=new ClassE();
	int x=eobj.meth1();
	System.out.println(x);
}
}