package forLoop;
import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial=1;
		if (n==0)
		{
			factorial=factorial*1;
		}
		else {
			for(int i=1;i<=n;i++)
			{
				factorial=factorial*i;
			}
			
		}
		System.out.println(factorial);
		
		
	}

	

}

