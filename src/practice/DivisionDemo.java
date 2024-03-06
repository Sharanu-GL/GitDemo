package practice;

import java.util.Arrays;

public class DivisionDemo {

	public static void main(String[] args) {
	
		int a[]=division(10, 2);
		System.out.println(Arrays.toString(a));

	}
	
	static int[] division(int a,int b)
	{
		int quotient=a/b;
		int rem =a%b;
		int arr[]=new int[2];
		arr[0]=quotient;
		arr[1]=rem;
		return arr;
	}

}
