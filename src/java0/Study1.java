package java0;
//Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�,
//���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num , a ,b; //a�� ���� �ڸ�, b�� �����ڸ�
		
		System.out.println("2�ڸ� ���� �Է�(10-99)");
		num =sc.nextInt();
		
		a = num/10;
		b =  num%10;
		
		if(a ==b)
			System.out.println(" Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		else
			System.out.println(" NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		
		sc.close();

	}

}
