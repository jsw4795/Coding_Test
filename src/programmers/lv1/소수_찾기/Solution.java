/* 1부터 주어진 정수 사이의 소수의 개수를 리턴
 * 
 * '아라토스테네스의 체'를 사용하겠다
 * */

package programmers.lv1.소수_찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int result = solution2(1000000);
		System.out.println("result: " + result); 
	}

	public static int solution(int n) {
		Set<Integer> table = new HashSet<Integer>();
		for(int i = 2; i <= n; i++) table.add(i); // 2~n의 테이블 생성 (1은 소수가 아니다)
		
		Set<Integer> primeNums = new HashSet<Integer>(); // 이미 찾은 소수를 저장해 놓을 Set
		
		loop:
		for(int i = 2; i <= Math.sqrt(n); i++) { // 루트n 까지만 검사하면 된다
			for(int primeNum : primeNums) { // 체크할 숫자가 이미 찾은 소수의 배수라면 건너뛰기
				if(i % primeNum == 0) continue loop;
			}
			
			final int temp = i; // 람다에서 사용하기 위해 final로 선언
			table.removeIf( num -> (num != temp) && (num % temp == 0)); // 테이블에서 현재 값의 배수를 제거
			primeNums.add(i);
		}
		
		return table.size();
	}
	
	// 효율성 개선 (너무 있는 그대로 할 필요가 없었다)
	public static int solution2(int n) {
		int result = 0;
		
		// 각 숫자를 2~제곱근 까지만 나눠지는지 검사하면 끝
		
		loop:
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) continue loop;
			}
			result++;
		}
		
		return result;
	}

}
