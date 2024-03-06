package practice;

public class ArmstrongNum {

	public static void main(String[] args) {
    
	int num=153;
	int d=num;
	int output=0;
	int digit=0;
	while(num!=0)
	{
		digit=num%10;
		output=output+digit*digit*digit;
		num=num/10;		
	}
		if(d==output)
		{
			System.out.println("Armstrong number");
		}

	}

}
