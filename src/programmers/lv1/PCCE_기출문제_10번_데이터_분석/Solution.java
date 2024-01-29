/* 분류해야할 데이터가 코드번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)순의 배열로 주어지고,
 * 분류항목(ext), 분류 기준(val_ext), 정렬기준(sort_by)가 주어진다. 
 * 이 때
 * data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return
 * 
 * 예)
 * main 메소드 참조
 * */

package programmers.lv1.PCCE_기출문제_10번_데이터_분석;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		int[][] result = solution(new int[][] {{1, 20300104, 100, 80},
											   {2, 20300804, 847, 37},
											   {3, 20300401, 10, 8}}
								  , "date", 20300501, "remain");
		System.out.println("result: " + Arrays.deepToString(result)); // 예상값: {{3,20300401,10,8}, {1,20300104,100,80}}
	}
	
	public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> type = new HashMap<String, Integer>(); // 문자열로 주어지는 타입을 배열의 인덱스로 변환하기 위함
        type.put("code", 0);
        type.put("date", 1);
        type.put("maximum", 2);
        type.put("remain", 3);
        
        return Arrays.stream(data)
		        	 .filter( d -> d[type.get(ext)] < val_ext) // ext값이 val_ext보다 작은 데이터만 필터링
		        	 .sorted( (d1, d2) -> d1[type.get(sort_by)] - d2[type.get(sort_by)]) // sort_by에 해당하는 값으로 오름차순 정렬
		        	 .toArray(int[][]::new);
        
        // 스트림이 확실히 깔끔하긴 하군... 성능은 모르겠지만
    }
}
