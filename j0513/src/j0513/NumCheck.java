package j0513;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// 숫자를 입력받는다
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		// 입력된 숫자가 홀수인지 짝수인지 출력하시오
        if(num%2 == 1)
        {
        	System.out.println("홀수");
        }
        else
        {
        	System.out.println("짝수");
        }
	}

}
