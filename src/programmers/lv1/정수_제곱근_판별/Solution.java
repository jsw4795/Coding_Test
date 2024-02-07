/* 주어진 정수 n이 x의 제곱이라면, x+1의 제곱을 리턴, 아니면 -1 리턴
 */

package programmers.lv1.정수_제곱근_판별;

public class Solution {

	public static void main(String[] args) {
		System.out.println("result: " + solution(121)); // 144
	}

	public static long solution(long n) {
		if(Math.sqrt(n) % 1 == 0) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		} else {
			return -1;
		}
	}
}
