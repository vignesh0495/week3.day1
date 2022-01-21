package week3.day1;

public class LearnCalculator {
	
	 public int add(int a , int b) {
		 return a+b;
		}
	
     public int add2(int a , int b , int c) {
		
		return a+b+c;
		}
     
     public int Multiply(int d, int e) {
		 return d*e;
		}
     
     public double Multiply1(double d, double e) {
		 return d*e;
 		}
	
	 public static void main(String[] args) {
		LearnCalculator calc = new LearnCalculator();
		System.out.println("The total values for the methods are ");
		int add = calc.add(20,50);
		int add2 = calc.add2(10,10,10);
		int Multiply = calc.Multiply(5,5);
		double Multiply1 = calc.Multiply1(2,2);
		
		System.out.println(add);
		System.out.println(add2);
		System.out.println(Multiply);
		System.out.println(Multiply1);
		
	}
}