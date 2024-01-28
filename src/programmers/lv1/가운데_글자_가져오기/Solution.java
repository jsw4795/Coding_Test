/* 문자열이 주어질 때 가운데 글자를 반환한다
 * 길이가 짝수일 경우 가운데 두 글자를 반환한다
 * 
 * 예)
 * 입력값: "abcdef"
 * 답: "cd"
 * */


package programmers.lv1.가운데_글자_가져오기;

public class Solution {
	
	public static void main(String[] args) {
		String result = solution("abcdef");
		System.out.println("result: " + result); // 예상값: c
	}
	
	public static String solution(String s) {
		int startIndex = s.length() % 2 == 0 ? s.length() / 2 - 1 : s.length() / 2; 
		int endIndex = s.length() / 2 + 1;
		
		String result = s.substring(startIndex, endIndex);
		
        return result;
    }
}
