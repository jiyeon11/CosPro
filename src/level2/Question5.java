package level2;

public class Question5 {

	public int solution(int attack, int recovery, int hp) {
		int count = 0;
			while(true){
				count += 1;
				hp -= attack;
	            if(hp <= 0) {
	            	break;
	            }
	            hp += recovery;
	        }
	        return count;
	    }

	public static void main(String[] args) {
		Question5 sol = new Question5();
        int attack = 30;  //공격력
        int recovery = 10;  //몬스터 회복체력
        int hp = 60;  //몬스터 초기체력
        int ret = sol.solution(attack, recovery, hp);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");


	}

}
