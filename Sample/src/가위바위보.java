
public class ���������� {
	public static void main(String[] args) {
		// ���� Random 
		// 0.0 <= X < 1.0
		// ���� 0, ���� 1, �� 2
		double ran = Math.random();
		int com = (int)(ran * 3);
		System.out.println(ran);
		System.out.println(com);
		int player = 1;
		
		if(player == com) {
			System.out.println("�����");
		}	else if( (player + 1) %3 == com) {
			System.out.println("player ��");
		}	else {
			System.out.println("player ��");
		}
			
	}

}

