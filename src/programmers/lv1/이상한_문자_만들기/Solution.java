/* 문자열이 주어질 때,
 * 짝수번째 알파벳은 대문자, 홀수번째 알파벳은 소문자로 바꾼 문자열 리턴
 * *공백 다음 알파벳은 첫 알파벳임
 * *첫 글자는 짝수다 (인덱스로 계산)
 * */

package programmers.lv1.이상한_문자_만들기;

public class Solution {

	public static void main(String[] args) {
		String result = solution2("try hello world");
		System.out.println("result: " + result); // 예상값: TrY HeLlO WoRlD
	}
	
	// 외부 반복문을 이용한 풀이 (빠름)
	public static String solution2(String s) {
		StringBuilder sb = new StringBuilder();
		boolean upper = true;
		for(String word : s.split("")) {
			sb.append( upper ? word.toUpperCase() : word.toLowerCase());
			if(word.equals(" ")) 
				upper = true;
			else 
				upper = !upper;
		}
		return sb.toString();
	}
	
	// Stream 이용한 풀이 (오래걸림)
	private static boolean upper = true;
	public static String solution(String s) {
		return s.chars().mapToObj(c -> (char)c)
						.map( c -> {
							if(c == ' ') {
								upper = true;
								return ' ';
							}
							else {
								if(upper) c = Character.toUpperCase(c);
								else c = Character.toLowerCase(c);
								upper = !upper;
								return c;
							}
						})
						.collect(StringBuilder::new,  StringBuilder::appendCodePoint, StringBuilder::append)
						.toString();
    }

}
