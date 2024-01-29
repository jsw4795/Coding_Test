/* 정사각형 모양의 칸에 색이 칠해져 있다
 * 2차원 배열로 주어질 때 [h][w]에 칠해진 색과 같은 색이 칠해진 칸의 개수를 구하라
 * 
 * 예)
 * main메소드 참조
 * */

package programmers.lv1.PCCE_기출문제_9번_이웃한_칸;

public class Solution {

	public static void main(String[] args) {
		int result = solution(new String[][] {{"blue", "red", "orange", "red"},
											  {"red", "red", "blue", "orange"},
											  {"blue", "orange", "red", "red"},
											  {"orange", "orange", "red", "blue"}}
											  , 1, 1);
		System.out.println("result: " + result); // 예상값: 2

	}
	
	public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        String thisColor = board[h][w];
        int[] hIndex = new int[] {-1, 1, 0, 0}; // 위,아래
        int[] wIndex = new int[] {0, 0, -1, 1}; // 왼쪽, 오른쪽
        
        for(int i = 0; i <= 4; i++) {
        	try { 
        		if(board[h + hIndex[i]][w + wIndex[i]].equals(thisColor)) // 같은 색이면 answer에 1씩 추가
        			answer++; 
        	} 
        	catch (ArrayIndexOutOfBoundsException e) {} // OutOfBounds 발생시 그냥 넘기기
        }
        return answer;
    }

}
