package java0;
//Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
//
//금액을 입력하시오>>65376
//오만원권 1매
//만원권 1매
//천원권 5매
//백원 3매
//오십원 1매
//십원 2매
//일원 6매
import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money, a,b,c,d,e,f,g;
		//a=5만원,b=1만원,c=1천원,d=100원,e=50원,f=10원,g=1원
		
		System.out.println("금액의 입력하세요");
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
		
		g= money; //1원계산
		
		System.out.println("오만원권" +a+ "매");
		System.out.println("만원권" +b+ "매");
		System.out.println("천원권" +c+ "매");
		System.out.println("백원" +d+ "매");
		System.out.println("오십원" +e+ "매");
		System.out.println("십원" +f+ "매");
		System.out.println("일원" +g+ "매");
		
		sc.close();
	}

}
