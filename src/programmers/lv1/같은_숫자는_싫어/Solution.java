/* 숫자 배열이 주어질 때 연속된 같은 숫자를 하나만 남긴 배열을 리턴
 * 
 * 예)
 * 주어진 배열: {1,1,1,2,3,3,2,2}
 * 답: {1,2,3,2}
 * */

package programmers.lv1.같은_숫자는_싫어;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Integer[] result = solution(new int[] {1,1,3,3,0,1,1});
		System.out.println("result: " + Arrays.toString(result)); // 예상값: {1,3,0,1}
	}
	
	public static Integer[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int n : arr) {
        	if(stack.size() == 0) stack.push(n); // 처음은 그냥 추가
        	else if(stack.peek() != n) stack.push(n); // 마지막거랑 다를때만 추가
        }
        Integer[] result = new Integer[stack.size()];
        
		return stack.toArray(result);
    }
}
