package j0513;
import java.util.Scanner;
public class Cal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("1:더하기 2:뺴기 3:곱하기 4:나누기");
		int c = sc.nextInt();

		if(c==1)
		System.out.println(a+b);
		else if(c==2)
		System.out.println(a-b);
		else if(c==3)
		System.out.println(a*b);
		else
		System.out.print(a/b);
	}

}
