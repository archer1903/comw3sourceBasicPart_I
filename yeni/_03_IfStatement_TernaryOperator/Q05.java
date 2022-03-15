package yeni._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Yaşınızı giriniz");
		double yas=scanner.nextDouble();
		System.out.println("Kilonuzu giriniz");
		double kilo=scanner.nextDouble();

		if(yas<18){
			System.out.println("Kan bağışı yapamaz");
		}else{

			if(kilo<50){
				System.out.println("Kan bağışı yapamaz");

			}else{
				System.out.println("Kan bağışı yapabilir");
			}



		}









	}

}
