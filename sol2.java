package beakJoon;

import java.util.Scanner;

public class sol2 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		String grade = "0";
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (90 <= score && score <= 100) {
			grade = "A";

		} else if (80 <= score && score < 90) {
			grade = "B";

		} else if (70 <= score && score < 80) {
			grade = "C";
		} else if (60 <= score && score < 70) {

		} else {
			grade = "F";
		}
		System.out.println("����� ����� "+grade+"�Դϴ�");

	}
}
