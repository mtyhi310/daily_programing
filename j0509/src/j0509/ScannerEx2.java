package j0509;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		// 이름과 나이를 입력받아보자
		
		String name=sc.next();
		
		int age=sc.nextInt();
		
		// 홍길동 43이 출력되게 해보자
		
		System.out.println(name);
		System.out.println(age);
	}

}
