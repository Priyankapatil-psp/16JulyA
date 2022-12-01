package Armtrong_number;

public class Demo3 {
public static void main(String[] args) {
	
	int num=142;
	int sum=0;
	
	
	for(int i=num;i>0;i=i/10)
	
	{
		int rem=i%10;
		
		sum=sum+(rem*rem*rem);
	}
	
	
	System.out.println(sum);
	
	
	
	
	
}
}
