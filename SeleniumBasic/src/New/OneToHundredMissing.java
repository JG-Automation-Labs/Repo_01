package New;

import java.util.ArrayList;

public class OneToHundredMissing {

	public static void main(String[] args) {
		int sum=0;
		long sum2 =0;
		long arr[]= {1,2,3,4,5,6,7,8,10};
		for(int i =0;i<=10;i++)
{
			System.out.print(" "+i);
			sum= sum+i;
}
		System.out.println(" \n"+sum);
		for(int i=0;i<arr.length;i++){	
			System.out.println(" "+arr[i]);
			sum2= sum2+arr[i];	
	}
		System.out.println("\n sum is : "+sum2);
		int missno = (int) (sum-sum2);
		System.out.println(" "+missno);
	}
			}


