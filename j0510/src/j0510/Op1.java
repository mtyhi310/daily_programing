package j0510;

public class Op1 {

	public static void main(String[] args) {
		// 산술연산자 => + , - , * , / , %
		
		int num1=12;
		int num2=8;
		
		System.out.println(num1-num2);
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); // 몫을 가져온다
		// 나누기 연산을 할 때 정수와 정수를 나누면 결과값은 무조건 정수형으로 나온다..
		System.out.println(12/8.0);
		System.out.println(num1%num2); // 나머지만 가져온다..

	}

}
