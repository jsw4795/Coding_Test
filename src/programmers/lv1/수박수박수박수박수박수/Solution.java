/* 길이가 n인 "수박수박수박수..." 패턴의 문자열을 리턴
 * */

package programmers.lv1.수박수박수박수박수박수;

public class Solution {

	public static void main(String[] args) {
		String result = solution(9);
		System.out.println("result: " + result);
	}

	public static String solution(int n) {
		
		return n % 2 == 0 ? "수박".repeat(n / 2) : "수박".repeat(n / 2) + "수";
    }
}
