package my.func;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		int result = 0;					// ���� �����

		String str = "ab2v9bc13jasdf2ass111jf4j0v21";
		
		boolean isNum = false;			// ���� ���ڰ� ������ ��, true
		boolean prevIsNumber = false;	// ���� ���ڰ� ������ ��, true

		int number = 0;					// ����temp �� ����� ���ڿ��� int������ ����ȯ�Ͽ� ������ ����
		String temp = "";				// �ڸ��� ��ŭ ���ڸ� �����ϱ� ���� ����
		Character c = null;				// �־��� ���ڿ����� ���ڸ� �ϳ��� �̾Ƴ��� ������ ����

		for(int i=0; i < str.length(); i++) {
			c = str.charAt(i);					
			isNum = ( c >= 48 && c <= 57 );		// ASCII�ڵ�� 0~9�� 48~57

			// ���� ���ڰ� ���ڶ��,
			// temp�� ���ڸ� ����
			if( isNum ) {
				temp += c;
				prevIsNumber = true;
			}
			
			// ���� ���ڰ� ���ڰ� �ƴϰų�, ���ڿ��� ������ ������ ���
			if( !isNum || i == str.length()-1 ) {
				// ���� ���ڰ� ���ڿ��ٸ�,
				// temp�� ����� ���ڿ��� Integer�� ����ȯ�Ͽ� ����
				if( prevIsNumber ) {
					number = Integer.valueOf( temp );
					if( number % 2 == 1 ) {
						result += ( number * number );
					}
					temp = "";
				}
				prevIsNumber = false;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println( result + " / " + (end - start) + "ms");
	}
}
