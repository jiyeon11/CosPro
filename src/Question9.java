
public class Question9 {
	String solution(String characters) {
		String result = "";
		result += characters.charAt(0);
		for(int i = 1; i<characters.length(); i++) {
			if(characters.charAt(i) != characters.charAt(i-1)) {
				result += characters.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Question9 sol = new Question9();
		String characters = "senteeeencccccceeee";
		String ret = sol.solution(characters);
		
		System.out.println("Solution : return value of the mathod is " + ret + " .");
	}

}
