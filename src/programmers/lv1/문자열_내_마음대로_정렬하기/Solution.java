/* 문자열 배열과 정수가 주어질 때
 * 문자열의 n번째 글자로 오름차순 정렬하라
 * *모든 문자열은 길이가 n이상이다
 * *n번째 글자가 같을 경우, 사전순으로 정렬
 * 
 * 예)
 * 주어진 문자열 배열: {"aeb", "daf", "igd"}
 * 주어진 정수: 2
 * 답: {"daf", "aeb", "igd"}
 * */

package programmers.lv1.문자열_내_마음대로_정렬하기;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String[] result = solution(new String[] {"abce", "abcd", "cdx"}, 2);
		System.out.println("result: " + Arrays.toString(result)); // 예상값: "abcd", "abce", "cdx"
	}
	
	public static String[] solution(String[] strings, int n) {
		
		return Arrays.stream(strings)
				     .sorted((s1, s2) -> {
				    	 if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2); // n번째 글자가 같으면 전체로 비교
				    	 else return s1.charAt(n) - s2.charAt(n);
				     })
				     .toArray(String[]::new);
		// 배열에서 스트림, 스트림에서 배열로 변환하는게 오래걸리나보다
    }
}
