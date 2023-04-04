package oop_java.abstract_demo;

	class AbstractSumClass extends Sum{
		
		   public int sumOfTwo(int num1, int num2){
			return num1+num2;
		   }
		   public int sumOfThree(int num1, int num2, int num3){
			return num1+num2+num3;
		   }
		   
		   public String stringto() {
			   return "Yes iam string method in child class ";
		   }
}
