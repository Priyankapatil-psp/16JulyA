package Factorial_number;

import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
	int num1;
	int fact=1;
	System.out.println("enter num");

Scanner scan=new Scanner(System.in);

int num=scan.nextInt();
for(int i=num;i>1;i--)

{fact=fact*i;
	
}
System.out.println(fact);

}
}
