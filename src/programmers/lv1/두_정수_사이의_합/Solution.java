/* 두 정수가 주어질 때
 * 두 정수 사이의 합을 리턴
 * 
 * 예)
 * 주어진 정수: 2, -3
 * 두 정수 사이의 정수: 2,1,0,-1,-2,-3
 * 답: -3
 * */

package programmers.lv1.두_정수_사이의_합;

public class Solution {
	
	public static void main(String[] args) {
		long result = solution(3, -1);
		System.out.println("result: " + result); // 예상값: 12
	}
	
	public static long solution(int a, int b) {
		int max = Math.max(a, b);
	    int min = Math.min(a, b);
	    
	    long n = max - min + 1; // 항의 개수
	    
	    return n * (min + max) / 2; // 등차 수열의 합 공식
	}
}
