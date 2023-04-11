
public class Question8 {
	boolean solution(String sentence) {
		String str = "";
		for(int i = 0; i<sentence.length(); i++) { //공백 . , 제거
			char c = sentence.charAt(i);
			if(c != ' ' && c != ',' && c != '.') str += c;
		}
		
		int len = str.length();
		for(int i = 0; i< len/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-(i+1))) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Question8 sol = new Question8();
		String sentence1 = "never odd or even";
		boolean ret1 = sol.solution(sentence1);
		
		System.out.println("Solution : return value of the mathod is " + ret1 + " .");
		
		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		
		System.out.println("Solution : return value of the mathod is " + ret2 + " .");


	}

}
