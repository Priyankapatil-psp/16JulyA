package Armtrong_number;

public class Demo1 {

	public static void main(String[] args) {
		{
			int OrgNum=153;   //1+125+27=153     cube of all number
		int sum=0;
		  //     153  0>0
		for(int i=OrgNum;i>0;i=i/10)
		{
			int rem =i%10;
			sum=sum+(rem*rem*rem);	
		
		System.out.println(sum);
		}
		
		if(OrgNum==sum) {
			System.out.println("given number" + OrgNum+"is an armtrong number");
		}

		else
		{
			System.out.println("given number" + OrgNum+"is an armtrong number");
		}
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
