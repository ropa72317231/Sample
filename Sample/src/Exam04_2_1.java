public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 6;
		
		if((score%2 ==0 || score%3==0)) {
			System.out.println("��¦");
		} 	else if(score%3 == 0  ) {
			System.out.println('��');
		}	else if(score%2 == 0) {
				System.out.println('¦');
		}	else {
			System.out.println(score);
			}	
	}
		
}


//score�� 2�� ����� ��� ��¦��, 3�� ����� ��� ������, 2�� ����̸鼭 3�� ����� ��� ����¦��, �� ���� ���� score�� ��µǵ��� �ڵ� �ۼ�