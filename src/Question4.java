

public class Question4 {
	
	int[] func_a(int[] arr) {  //자연수의 개수 세기
		int[] counter = new int[1001];
		for(int i = 0; i<arr.length; i++) {
			counter[arr[i]]++; //@@@
		}
		return counter;
	}
	
	int func_b(int[] arr) {  //가장 많이 등장
		int ret = 0;
		for(int i = 0; i<arr.length; i++) {
			if(ret < arr[i]) {//@@@
				ret = arr[i];//@@@
			}
		}
		return ret;
	}
	int func_c(int[] arr) { //가장 적게 등장하는 수 구하기
		final int INF = 1001;
		int ret = INF;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && ret>arr[i]) {//@@@
				ret = arr[i];
			}
		}
		return ret;
	}
	
	public int solution(int[] arr) {  //가장 많이 등장하는 수가 가장 적게 등장하는 수보다 몇 배 더 많은지
		int[] counter = func_a(arr);
		int maxCnt = func_b(counter);
		int minCnt = func_c(counter);
		return maxCnt/minCnt;
	}
	
	public static void main(String[] args) {
		Question4 sol = new Question4();
		int[] arr = {1,2,3,3,1,3,3,2,3,2};
		int ret = sol.solution(arr);
		
		System.out.println("Solution: return value of the method is " + ret + " .");
	}
}
