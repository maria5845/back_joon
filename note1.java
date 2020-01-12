package beakJoon;

import java.util.Scanner;

public class note1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		String grade = "0";
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch(score/10) {
		
		case 10 : case 9 : 
			grade= "A";
		case 8 : 
			grade = "B";
		
		}

	}

}
