package j0513;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
		
    	// 두개의 숫자를 입력받는다 
    	int num1,num2;
    	Scanner sc=new Scanner(System.in);
    	num1=sc.nextInt();
    	num2=sc.nextInt();
    	
    	// 사용자로부터 1:더하기  2:빼기  3:곱하기  4:나누기 
    	// 4개의 숫자를 입력을 받아서 두개의 숫자를 산술연산하는 프로그램을 작성하시오.
    	
    	System.out.print("1:더하기  2:빼기  3:곱하기  4:나누기  ");
    	
    	int chk=sc.nextInt();
    	
    	if(chk==1)
    	{
    		System.out.println(num1+num2);
    	}
    	else if(chk==2)
    	     {
    		      System.out.println(num1-num2);
    	     }
    	     else if(chk==2)
    	          {
    	    	       System.out.println(num1*num2);
    	          }
    	          else
    	          {
    	        	   System.out.println(num1/num2);
    	          }
	}
}









