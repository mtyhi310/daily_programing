package j0514;

public class RandomEx3 {
   public static void main(String[] args) {
	
	   for(int i=1;i<=6;i++)
		{
			double num=Math.random()*45; // 0~45 사이의 실수
			
			int ran=(int)num;  // 0~44까지의 정수
			ran=ran+1;  // 1~45의 정수
			
			System.out.print(ran+" ");
					 
		}
  }
}
