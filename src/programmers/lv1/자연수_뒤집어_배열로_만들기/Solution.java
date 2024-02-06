/* 자연수 n이 주어질 때 n을 뒤집은 순서대로 배열에 담아서 리턴
 * */

package programmers.lv1.자연수_뒤집어_배열로_만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		System.out.println("result: " + Arrays.toString(solution(12345)));
	}
	
	public static Integer[] solution(long n) {
		List<Integer> list = new ArrayList<Integer>();
		
		while(n > 0) {
			list.add((int)(n % 10));
			n = n / 10;
		}
		
		return list.toArray(Integer[]::new);
	}

}
