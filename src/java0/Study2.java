package java0;
//Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����, 500¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ�Ǵ��� ����϶�.
//
//�ݾ��� �Է��Ͻÿ�>>65376
//�������� 1��
//������ 1��
//õ���� 5��
//��� 3��
//���ʿ� 1��
//�ʿ� 2��
//�Ͽ� 6��
import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money, a,b,c,d,e,f,g;
		//a=5����,b=1����,c=1õ��,d=100��,e=50��,f=10��,g=1��
		
		System.out.println("�ݾ��� �Է��ϼ���");
		money =sc.nextInt();
		
		a= money/50000;
		money = money -(a*50000);
		
		b= money/10000;
		money = money =(b*10000);
		
		c= money/1000;
		money = money =(c*1000);
		
		d= money/100;
		money = money =(d*100);
		
		e= money/50;
		money = money =(e*50);
		
		f= money/10;
		money = money =(f*10);
		
		g= money; //1�����
		
		System.out.println("��������" +a+ "��");
		System.out.println("������" +b+ "��");
		System.out.println("õ����" +c+ "��");
		System.out.println("���" +d+ "��");
		System.out.println("���ʿ�" +e+ "��");
		System.out.println("�ʿ�" +f+ "��");
		System.out.println("�Ͽ�" +g+ "��");
		
		sc.close();
	}

}
