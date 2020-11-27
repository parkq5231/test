package test;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		int[] Array = new int[10];
		Scanner scn = new Scanner(System.in);
		int sum=0;
		int sum2=0;
		
		for (int i = 0; i < Array.length; i++) {
			System.out.println("입력값: ");
			Array[i] = scn.nextInt();

			if (Array[i] % 2 == 0) {
				sum+=Array[i];
				
				
			}else if (Array[i]%2 !=0){
				sum2+=Array[i];
			}
		}

		System.out.println("짝수의 합: "+sum);
		System.out.println("홀수의 합: "+sum2);
		
	}// end of main
}// end of class