package java0;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("���� 3�� �Է�");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a<b&&b<c)|| (c<b && b<a)) {
			System.out.println("�߰� ����" +b);
		}
		else if((b<a && a<c) || (c<a && a<b)){
			System.out.println("�߰� ����"  +a);
		}
		else {
			System.out.println("�߰�����" +c);
		}
		sc.close();
	}

}
