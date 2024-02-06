/* 정수 n이 주어질 때,
 * n의 약수의 합을 리턴
 * */

package programmers.lv1.약수의_합;

public class Solution {

	public static void main(String[] args) {
		int result = solution(12); 
		System.out.println("result: " + result); // 예상값: 28
	}
	
	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n / 2; i++) { // 절반까지만 확인하고, n을 더하면 됨
        	if(n % i == 0) answer += i;
        }
        return answer + n;
    }

}
