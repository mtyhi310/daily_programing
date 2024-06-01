package j0513;

import java.util.Scanner; // 사용하고 하는 클래스의 위치 지정

public class If_Ex2 {

	public static void main(String[] args) {
		// 정수형 변수(kor)를 만들고 점수를 콘솔창으로 입력하기	
		
		
		int kor;
		
		Scanner sc=new Scanner(System.in);

		kor=sc.nextInt();
		
		// 국어점수가 60점 이상이면 "합격" 미만이면 "불합격"
		
		if(kor >= 60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
		
		// 국어점수가 60점 미만이면 "불합격" 이상이면 "합격"
		if(kor < 60)
		{
			System.out.println("불합격");
		}
		else
		{
			System.out.println("합격");
		}
	}

}










