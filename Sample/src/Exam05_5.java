import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {
		
// ���ѹݺ� ����
		boolean isRun = true;
		
// �л� ��
		int studentNum = 0;
		
// �л��� ����
		int[] scores = null;
		
		Scanner scan = new Scanner(System.in);
		while (isRun) {
			System.out.println("======================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("======================================");
			System.out.print("���� > ");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				System.out.print("�л� �� �Է� >");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				for(int i = 0;  i < scores.length; i++) {
				System.out.print("scores[" + i +"] > " );
				scores = new int[studentNum];
				}

			} else if (selectNo == 3) {
				for(int i = 0; i<scores.length; i++) {
					
				}

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		System.out.println("���α׷� ����");
		scan.close();
	}
}