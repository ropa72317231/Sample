import java.util.Arrays;

public class �ζ��ϵ���߱� {
	public static void main(String[] args) {
		int[] lotto = {3, 4, 11, 19, 22, 45} ;
		int count = 0;
		
		
		//�ζ� ����
		while(true) {
			int[] my = new int[6];
			
			//�ζǹ�ȣ 6��(1��) ����
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			
			//���� (�������� 1, 2, 3,...)
			Arrays.sort(my);
			
			//���� ���� ���
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("Ƚ��:" + count);
			// ��ȣ ��
			boolean result = Arrays.equals(lotto, my);
			if(result) {  // 1�� ��÷�̸�
				System.out.println(Arrays.toString(my));
				break;  // �����
			}
			
		}
	}
}
