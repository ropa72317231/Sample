public class Exam04_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;
		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			count ++;  //���� Ƚ�� ����
			
			System.out.printf( "(%s, %s)\n" , num1, num2 );
			System.out.println();
			
			// ������ ���� 10�̸� ����
			if(num1 + num2  == 10) {
				isContinue = false ;
			}

			
			// �ڵ� �ۼ�
		}
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	}
}

//�ΰ��� �ֻ����� �������� ������ ���� (��1, ��2) ���·� ����ϰ�,
//���� ���� 10�̸� ������ �����ϴ� �ڵ� �ۼ� (Math.random() �޼ҵ�)