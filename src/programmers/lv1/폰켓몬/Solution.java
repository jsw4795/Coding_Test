/* 숫자의 배열이 주어질 때,
 * 배열의 크기의 절반을 선택한다
 * 이 떼, 가장 많은 종류의 숫자를 선택한다면 몇종류인가
 * 
 * 예)
 * 배열: {1,1,2,3}
 * 선택하는 숫자의 개수: 4/2 = 2
 * 배열에서 숫자 종류의 수: 3
 * 
 * 답: 2
 * */


package programmers.lv1.폰켓몬;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		int result = solution(new int[] {3,3,3,2,2,4});
		System.out.println(result); // 예상 결과: 3
	}
	
	public static int solution(int[] nums) {
        int choiceCount = nums.length / 2; // 고를 수 있는 숫자의 개수
        int typeCount = (int)Arrays.stream(nums).distinct().count(); // 배열안에 숫자 종류의 수    
        
        return Math.min(choiceCount, typeCount); // 둘 중에 작은 숫자가 정답
    }
}
