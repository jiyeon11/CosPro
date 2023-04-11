

public class Question2 {
	public int solution(int price, String grade) {
		int answer = 0;
		
		if(grade.equals("S")) {
			answer = price-(int)(price*0.05);  //5%
		}else if(grade.equals("G")) {
			answer = price-(int)(price*0.1);  //10%
		}else if(grade.equals("V")) {
			answer = price-(int)(price*0.15);  //15%
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Question2 sol = new Question2();
		int price1 = 2500;
		String grade1 = new String("V");
		int ret1 = sol.solution(price1, grade1);
		
		System.out.println("Solution: retrun value of the method is " + ret1 + " .");
		
		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = sol.solution(price2, grade2);
		System.out.println("Solution: retrun value of the method is " + ret2 + " .");

	}

}
