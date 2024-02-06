/* 자연수 n이 주어질 때 각 자리수의 합을 리턴
 * */

package programmers.lv1.자릿수_더하기;

public class Solution {

	public static void main(String[] args) {
		System.out.println("result: " + solution(987)); // 24
	}

	public static int solution(int n) {
        int answer = 0;
        while(n > 0) {
        	answer += n % 10;
        	n = n / 10;
        }
        return answer;
    }
	
}
