/* 숫자 a, b가 주어질 때
 * 2016년 a월 b일은 무슨 요일일까
 * (SUN,MON,TUE,WED,THU,FRI,SAT)
 * 
 * 예)
 * a = 5
 * b = 24
 * 2016년 5월 24일은 '화요일'이다
 * 답: TUE
 * */


package programmers.lv1._2016년;

import java.time.LocalDate;

public class Solution {
	
	public static void main(String[] args) {
		String result = solution(5, 24);
		System.out.println("result: " + result); // 예상결과: TUE
	}
	
	public static String solution(int a, int b) {
        String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        LocalDate date = LocalDate.of(2016, a, b);
        int weekNum = date.getDayOfWeek().getValue(); // 월요일=1, ..., 일요일=7
        return week[weekNum - 1];
    }
}
