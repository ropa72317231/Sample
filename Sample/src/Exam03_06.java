import java.io.IOException;
import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		char ch = in.charAt(0);
		
		
		
		// 1�� ���
		int input = System.in.read();
		System.out.println(input);
		
		//char ch=(char)input;
		
				
		char ch2 = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
		
		System.out.println(ch2);
		
		
		
		//���� �� ��
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("�Էµ� ���� :");
		
		
	
		/* �ڵ� �ۼ� */
	}
}