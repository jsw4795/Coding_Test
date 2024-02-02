/* 비내림차순으로 정렬된 수열과 정수 k가 주어질 때,
 * 수열의 합이 k인 부분수열의 시작 인덱스와 끝 인덱스를 구하라
 * 
 * *시작 인덱스와 끝 인덱스의 원소를 포함한다.
 * *수열의 합이 k인 부분 수열이 여러 개인 경우 길이가 짧은 수열을 찾는다.
 * *길이가 짧은 수열이 여러개일 경우 앞쪽에 나오는 수열을 찾는다.
 * */

package programmers.lv2.연속된_부분_수열의_합;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] result = solution(new int[] { 1, 2, 3, 4, 5 }, 7);
		System.out.println("reuslt: " + Arrays.toString(result)); // 예상값: {2,3}
	}

	// 시간 초과로 인해 해설을 찾아봄
	// 투포인터 알고리즘을 사용하겠다
	public static int[] solution(int[] sequence, int k) {
		int[] answer = { 0, sequence.length - 1 };
		
		int left = 0; // left 포인터
		int right = 1; // right 포인터
		
		int sum = sequence[0]; // 초기값은 첫 번째 값으로 설정
		while (left < right) {
			if (sum == k) {
				if (right - 1 - left < answer[1] - answer[0]) { // 길이가 더 짧을 때만 답으로 변경
					answer[0] = left;
					answer[1] = right - 1;
				}
				sum -= sequence[left++]; // left 포인터 1 증가하면서 다음 탐색
			} else if (sum > k) { // 합이 k보다 크면 left 포인터 1 증가
				sum -= sequence[left++];
			} else if (right < sequence.length) { // 합이 k보다 작으면 right 포인터 1 증가 (right가 수열 길이보다 작을 때만 증가)
				sum += sequence[right++];
			} else { // right가 끝까지 도달하고, 합이 k보다 작으면 종료
				break;
			}
		}
		return answer;

	}

}
