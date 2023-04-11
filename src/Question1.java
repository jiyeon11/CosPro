import java.util.*;

public class Question1{
	public int[] solution(String[] shirtSize) {
		int[] answer = new int[6];
		for(int i = 0; i<shirtSize.length; i++) {
			switch(shirtSize[i]) {
			case "XS" : answer[0]++; break;
			case "S" : answer[1]++; break;
			case "M" : answer[2]++; break;
			case "L" : answer[3]++; break;
			case "XL" : answer[4]++; break;
			case "XXL" : answer[5]++; break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Question1 sol = new Question1();
		String[] shirtSize = {"XS","S","L","L","XL","S"};
		int[] ret = sol.solution(shirtSize);
		System.out.println("Solution : return value of the method is " + Arrays.toString(ret));
	}
}
