package java0;
//Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num , a ,b; //a는 십의 자리, b는 일이자리
		
		System.out.println("2자리 정수 입력(10-99)");
		num =sc.nextInt();
		
		a = num/10;
		b =  num%10;
		
		if(a ==b)
			System.out.println(" Yes! 10의 자리와 1의 자리가 같습니다");
		else
			System.out.println(" NO! 10의 자리와 1의 자리가 다릅니다");
		
		sc.close();

	}

}
