package leetcode.recursion;

public class Print_n {
	
	int n=0;
	

	public static void Print_n1(int n) {
		if(n==10) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		Print_n1(n+1);
		
	}
	
	public static void main(String[] args) {
		Print_n1(1);

	}

}
