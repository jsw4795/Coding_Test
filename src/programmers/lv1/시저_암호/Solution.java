/* 주어진 문자열을 n만큼 뒤로 민 문자열을 리턴
 * *공백은 밀어도 공백이다
 * *'Z', 'z'는 1만큼 밀면 'a'가 된다
 * */

package programmers.lv1.시저_암호;

public class Solution {

	public static void main(String[] args) {
		String result = solution("a B z", 4); 
		System.out.println("reesult: " + result); // 예상값: "e F d"
	}
	
	public static String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		int length = s.length();
		for(int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				c = (char) ('A' + (c + n - 'A') % 26);
			} else if(Character.isLowerCase(c)) {			
				c = (char) ('a' + (c + n - 'a') % 26);
			} else {} // 공백일 때
			
			
			sb.append(c);
		}
        return sb.toString();
    }
	
}
