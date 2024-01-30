/* [시전시간, 1초당 회복량, 완료시 추가 회복량], 초기(최대)체력, [공격시기, 데미지]...
 * 가 주어질 때, 모든 공격이 끝났을 때 남아있는 체력을 리턴
 * *체력이 0이하로 떨어지면 -1을 리턴
 * */

package programmers.lv1.PCCE_기출문제_1번_붕대_감기;

public class Solution {
	public static void main(String[] args) {
		int result = solution(new int[] {5,1,5}, 30, new int[][] {{2,10}, {9,15}, {10,5}, {11,5}});
		System.out.println("result: " + result); // 예상값: 5
	}
	
	public static int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int attackLength = attacks.length;
        
        for(int i = 0; i < attackLength; i++) {
        	int[] nowAttack = attacks[i];
        	
        	health -= nowAttack[1]; // 공격당해서 체력 소모
        	if(health <= 0) return -1; // 사망
        	
        	if(i < attackLength - 1) { // 다음 공격이 남았을 때만, 다음 공격 전까지 체력 회복량 계산
        		int[] nextAttack = attacks[i + 1];
        		int attackTerm = nextAttack[0] - nowAttack[0] - 1; // 다음 공격까지의 시간 (공격 받을 때는 회복X)
        		int heal = ((attackTerm / bandage[0]) * bandage[2]) + (bandage[1] * attackTerm); // 회복량
        		health = Math.min(health + heal, maxHealth);
        	}
        }
        
        return health;
    }
}
