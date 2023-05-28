package leetcode.recursion;

public class Fibonacci_Number {
	
	
	static int fibb(int n) {
		
		if(n<2) {
			return n;
		}
		return fibb(n-1) + fibb(n-2);
		
	}

	public static void main(String[] args) {
		fibb(4);
		int x = fibb(50);
		System.out.println(x);

	}

}
