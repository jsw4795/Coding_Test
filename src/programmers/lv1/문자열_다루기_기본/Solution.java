/* 문자열이 주어질 때,
 * 문자열의 길이가 4 혹은 6이고, 숫자로만 이루어져 있으면 true 리턴
 */

package programmers.lv1.문자열_다루기_기본;

public class Solution {

	public static void main(String[] args) {
		boolean result = solution("a12345"); 
		System.out.println("result: " + result); // 예상값: false
	}
	public static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) // 길이 체크
			try {
				Integer.parseInt(s); // 내용 체크
				return true;
			} catch (NumberFormatException e) { // 숫자 이외의 것이 들어있으면 false 리턴
				return false;
			}
		return false;
    }

}
