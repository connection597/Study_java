package java0;
//Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� ���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��϶�. $1=1100������ �����ϰ� ����϶�.
//
//��ȭ�� �Է��ϼ���(���� ��)>>3300
//3300���� $3.0�Դϴ�.
import java.util.Scanner;

public class JavaSttudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money;
		double dollar;
		
		System.out.println("��ȭ�� �Է��ϼ���(����:��)");
		money = sc.nextInt();
		
		dollar =(double)money/1100;
		System.out.println(money +"���� $"+ dollar +"�Դϴ�");
		
		sc.close();

	}

}
