/* Scanner를 통해 문자열과 숫자가 입력된다
 * 
 * 입력된 숫자만큼 문자열을 반복하여 출력하라
 * 
 * 예)
 * 문자열 : abc
 * 숫자 : 3
 * 
 * 출력 : abcabcabc
 * */



package programmers.lv0.문자열_반복해서_출력하기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n; i++)
        	System.out.print(str);
    }
}
