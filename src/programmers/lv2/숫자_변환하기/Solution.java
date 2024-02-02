/* 정수 x,y,n이 주어질 때
 * y는 다음의 연산을 이용해서 만들어진 수 이다
 * 1. x에 n을 더한다
 * 2. x에 2를 곱한다
 * 3. x에 3을 곱한다
 * 
 * x를 y로 변환하기 위한 최소 연산 횟수를 리턴
 * *x를 y로 만들 수 없다면 -1을 리턴
 */

package programmers.lv2.숫자_변환하기;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int result = solution(5, 1000000, 5);
		System.out.println("result: " + result); // 예상값: 18
	}
	
	public static int solution(int x, int y, int n) {
		int cnt = 0;
        HashSet<Integer> curr = new HashSet<>(); // 계산의 대상이 담길 set
        curr.add(y); // y부터 시작해서 역산해서 줄여가겠다
        
        HashSet<Integer> next = null; // 계산의 결과가 담길 set 
        

        while (!curr.isEmpty()) { // 더이상 의미있는 값이 남아있지 않으면 끝
            if (curr.contains(x)) return cnt; // x에 처움 도달하면 계산 횟수를 리턴
            
            next = new HashSet<Integer>();
            for (int val : curr) {
            	// 하나의 값에 대해 3가지 게산을 모두 한다 (나누어 떨어질 때만 나누기)
                int pVal = val - n;
                int dVal = val % 2 == 0 ? val / 2 : -1;
                int tVal = val % 3 == 0 ? val / 3 : -1;
                
                // 값이 x보다 클 때에만 계산 결과에 포함시킨다 (의미없음)
                if (pVal >= x) next.add(pVal);
                if (dVal >= x) next.add(dVal);
                if (tVal >= x) next.add(tVal);
            }
            
            curr = next; // 현재 계산 결과를 다음 계산 대상으로
            cnt++;
        }
        
        return -1;
	}
}
