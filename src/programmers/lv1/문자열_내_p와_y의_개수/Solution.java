/* 알파벳으로 이루어진 문자열이 주어질 때
 * 문자열 내의 p와 y의 개수가 같으면 true, 다르면 false를 리턴
 * *둘 다 없으면 true를 리턴
 * *p와 y는 대소문자를 구분하지 않는다
 * 
 * 예)
 * 문자열: "YfhdksPasdpadsyjafd"
 * p: 2개, y: 2개
 * 답: true
 * */

package programmers.lv1.문자열_내_p와_y의_개수;

public class Solution {

	public static void main(String[] args) {
		boolean result = solution("pPoooyY");
		System.out.println("result: " + result); // 예상값: true
	}

	static boolean solution(String s) {
		int count = 0;
		for(char c : s.toUpperCase().toCharArray()) { // 다 대문자로 바꿔서 비교
			if(c == 'P') count++;
			else if(c == 'Y') count--;
		}
		
		return count == 0;
		
		// 정규식 사용해서 replaceAll로 풀면 더 간단하고 빠를듯
    }
	
}
