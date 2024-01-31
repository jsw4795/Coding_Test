/* 주어진 문자열 배열에서 "Kim"의 인덱스를 리턴
 * * "김서방은 1에 있다" 형시으로 리턴
 * */

package programmers.lv1.서울에서_김서방_찾기;

public class Solution {

	public static void main(String[] args) {
		String result = solution(new String[] {"Jane", "Kim"});
		System.out.println("result: " + result); // 예상값: "김서방은 1에 있다"
	}

	public static String solution(String[] seoul) {
		for(int i = 0; i < seoul.length; i++)
			if(seoul[i].equals("Kim")) return "김서방은 " + i + "에 있다";
		return null;
	}

}
