/* 숫자로 이루어진 문자열 a, b 가 주어질 때
 * 길이가 b와 같은 a의 부분 문자열 중
 * b보다 작거나 같은 것의 개수
 * 
 * 예)
 * a = 31415
 * b = 367
 * 
 * 길이기 3인 a의 부분 문자열 : 314, 141, 415
 * b보다 작거나 같은 것 : 314, 141
 * 답 : 2(개)
 * */


package programmers.lv1.크기가_작은_부분문자열;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		int result = solution("3141592", "271");
		System.out.println(">> 결과: " + result); // 예상 결과 : 2
	}
	
	public static int solution(String t, String p) {
		List<Long> splitList = new ArrayList<Long>(); // 범위초과로 int -> long으로 사용
		int listSize = t.length() - p.length() + 1; // 부분문자열의 개수
		
		for(int i = 0; i < listSize; i++) 
			splitList.add(Long.parseLong(t.substring(i, i + p.length()))); // 부분문자열을 리스트로 저장

		long smallerThan = Long.parseLong(p); // 숫자 비교를 위해 String -> long 변환 
		
		return (int)splitList.stream().filter(num -> num <= smallerThan).count(); // 조건에 맞는 요소의 개수 계산
    }
}
