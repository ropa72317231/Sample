import java.util.Arrays;

public class 로또일등맞추기 {
	public static void main(String[] args) {
		int[] lotto = {3, 4, 11, 19, 22, 45} ;
		int count = 0;
		
		
		//로또 구매
		while(true) {
			int[] my = new int[6];
			
			//로또번호 6개(1장) 구매
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			
			//정렬 (오름차순 1, 2, 3,...)
			Arrays.sort(my);
			
			//구매 상태 출력
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("횟수:" + count);
			// 번호 비교
			boolean result = Arrays.equals(lotto, my);
			if(result) {  // 1등 당첨이면
				System.out.println(Arrays.toString(my));
				break;  // 멈춰라
			}
			
		}
	}
}
