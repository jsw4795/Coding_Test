/* 주어진 정수가 짝수면 "Even", 홀수면 "Odd"를 리턴
 * */

package programmers.lv1.짝수와_홀수;

public class Solution {

	public static void main(String[] args) {
		System.out.println("result: " + solution(4)); // true
	}
	
	public static String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}

}
