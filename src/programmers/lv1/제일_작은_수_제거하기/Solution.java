/* 주어진 정수 배열에서 가장 작은 수 만 제거한 배열을 리턴하라
 * *제거 후 길이가 0이면, -1을 담아서 리턴
 * */

package programmers.lv1.제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		System.out.println("result: " + Arrays.toString(solution(new int[] {4,3,1,2}))); // {4,3,2}
	}
	
	public static Integer[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		
		int val = Integer.MAX_VALUE;
		int index = -1;
		
		int l = arr.length;
		for(int i = 0; i < l; i++) {
			list.add(arr[i]);
			
			if(arr[i] < val) {
				val = arr[i];
				index = i;
			}
		}
		
		list.remove(index);
		
		if(list.size() == 0) 
			list.add(-1);
		
		return list.toArray(Integer[]::new);
	}

}
