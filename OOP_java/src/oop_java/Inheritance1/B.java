package oop_java.Inheritance1;
public class B extends A{
       int bVar1;
       void bMeth1() {
    	   System.out.println("Method in class B");
    	   
       }
       
       public B (int aVar1,int bVar1 ) {
    	   super(aVar1);
    	   this.bVar1=bVar1;
       }
	public B(int bVar1) {
		super();
		this.bVar1=bVar1;
	}
}
