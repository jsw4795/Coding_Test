/* 주어진 정수를 내림차순으로 정렬하여 리턴
 * */

package programmers.lv1.정수_내림차순으로_배치하기;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		System.out.println("result: " + solution(118372)); // 873211
	}

	public static long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, (s1, s2) -> s2.compareTo(s1));
		return Long.valueOf(String.join("", arr));
	}

}
