import java.util.Arrays;

public class Question6 {
	public int solution(int number) {
		int count = 0;
		
		for(int i = 1; i<=number; i++) { //준 숫자까지 반복해서 박수짝을 골라냄
			int current = i;
			int temp = 3;
			
			while(current != 0) {
				if(current%10 == 3 || current%10 == 6 || current %10 == 9) {
					count++;
					System.out.println("pair");
				}
				current/= 10;
			}
		}
		System.out.println();
		return count;
	}
	
	public static void main(String[] args) {
		Question6 sol = new Question6();
		int number = 40;
		int ret = sol.solution(number);
		System.out.println("Solution: return value of the method is " + ret + " .");
	}

}
