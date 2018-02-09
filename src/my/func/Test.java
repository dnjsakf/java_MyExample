package my.func;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		int result = 0;					// 최종 결과값

		String str = "ab2v9bc13jasdf2ass111jf4j0v21";
		
		boolean isNum = false;			// 현재 문자가 숫자일 때, true
		boolean prevIsNumber = false;	// 이전 문자가 숫자일 때, true

		int number = 0;					// 변수temp 에 저장된 문자열을 int형으로 형변환하여 저장할 변수
		String temp = "";				// 자릿수 만큼 문자를 저장하기 위한 변수
		Character c = null;				// 주어진 문자열에서 문자를 하나씩 뽑아내어 저장할 변수

		for(int i=0; i < str.length(); i++) {
			c = str.charAt(i);					
			isNum = ( c >= 48 && c <= 57 );		// ASCII코드로 0~9는 48~57

			// 현재 문자가 숫자라면,
			// temp에 문자를 저장
			if( isNum ) {
				temp += c;
				prevIsNumber = true;
			}
			
			// 현재 문자가 숫자가 아니거나, 문자열의 마지막 문자일 경우
			if( !isNum || i == str.length()-1 ) {
				// 이전 문자가 숫자였다면,
				// temp에 저장된 문자열을 Integer로 형변환하여 제곱
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
