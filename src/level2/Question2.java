package level2;

public class Question2 {
	public int func_a(int[] arr) {  //5의 배수 세기
		int count = 0; 
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%5 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public String func_b(int three, int five) { //string return
		String result = "";
		if(three>five) {
			result = "three";
		}else if(three == five) {
			result = "same";
		}else if(three<five) {
			result = "five";
		}
		return result;
	}
	
	public int func_c(int[] arr) {  //3의 배수 세기
		int count = 0; 
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%3 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public String solution(int[] arr) {
		int countThree = func_c(arr);
		int countFive = func_a(arr);
		String answer = func_b(countThree, countFive);
		return answer;
	}
	
	public static void main(String[] args) {
		Question2 sol = new Question2();
		int[] arr = {2,3,6,9,12,15,10,20,22,25};
		String ret = sol.solution(arr);
		
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}
