package java0;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("정수 3개 입력");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a<b&&b<c)|| (c<b && b<a)) {
			System.out.println("중간 값은" +b);
		}
		else if((b<a && a<c) || (c<a && a<b)){
			System.out.println("중간 값은"  +a);
		}
		else {
			System.out.println("중간값은" +c);
		}
		sc.close();
	}

}
