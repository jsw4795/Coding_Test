/* 숫자 배열과 정수가 주어진다
 * 배열중에서 주어진 정수로 나누어떨어지는 것들만 남기고
 * 오름차순으로 정렬한 배열을 리턴
 * (나누어 떨어지는 수가 없으면 -1을 담은 배열을 리턴)
 * 
 * 예)
 * 배열: {3,5,6,9,10}
 * 정수: 3
 * 
 * 답: {3,6,9}
 * */

package programmers.lv1.나누어_떨어지는_숫자_배열;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] result = solution(new int[] {5, 9, 7, 10}, 5);
		System.out.println("result: " + Arrays.toString(result)); // 예상값: {5,10}
	}
	
	public static int[] solution(int[] arr, int divisor) {
		int[] result = Arrays.stream(arr).filter( num -> num % divisor == 0)
										 .sorted()
										 .toArray();
		return result.length > 0 ? result : new int[] {-1};
		// for문으로 풀때보다 확실히 느리다
    }
}
