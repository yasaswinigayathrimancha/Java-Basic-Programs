package oop_java.inheritance2;

public class C1 {

	public static void main(String[] args) {
       
		A1 aobj=new A1(10);
		B1 bobj=new B1(1,aobj);
		System.out.println(bobj.bvar2.aVar1);
		
	}

}
