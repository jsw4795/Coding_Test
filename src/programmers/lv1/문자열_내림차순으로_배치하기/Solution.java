/* 주어진 문자열을 반대로 정렬하시오
 * */


package programmers.lv1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
	public static void main(String[] args) {
		String result = solution("Zbcdefg");
		System.out.println("result: " + result); // 예상값: "gfedcbZ"
	}
	
	public static String solution(String s) {
		return Arrays.stream(s.split(""))
					 .sorted((s1, s2) -> s2.compareTo(s1))
					 .collect(Collectors.joining());
		// 느려... 하지만 난 스트림 연습중
    }
}
