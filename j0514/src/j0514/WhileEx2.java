package j0514;

public class WhileEx2 {

	public static void main(String[] args) {
		// while : 횟수를 알지 못하는 예제
		
	    // 임의의 숫자(1~10)를 발생했을때 1이 발생하면 종료가 되는 소스
		
		int chk=(int)(Math.random()*10)+1 ;
		
		while(chk != 1) // 조건에 비교할 값을 새로 생성하는 문장이 필요
		{
			System.out.println("안녕하세요");
						
			chk=(int)(Math.random()*10)+1 ;
		}
		
	}

}
