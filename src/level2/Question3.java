package level2;

public class Question3 {
	
	public int solution(int N, int M) {
		int total = 0;
		for(int i = N; i<=M; i++) {
			if(i%2 == 0) {
				total = total + (i*i);
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Question3 sol = new Question3();
		int N = 4;
		int M = 7;
		int ret = sol.solution(N, M);
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");


	}

}
