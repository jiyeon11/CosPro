import java.util.Arrays;

public class Question5 {
	public int[] solution(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		//1,4,2,3
		//3,2,4,1
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			System.out.println("현재 arr[left] : " + arr[left]);
			System.out.println("현재 arr[right] : " + arr[right]);
			left++;
			right--;
			System.out.println("left : " + left + "\nright : " + right);
		}
		return arr;
	}
	public static void main(String[] args) {
		Question5 sol = new Question5();
		int[] arr = {1,4,2,3};
		int[] ret = sol.solution(arr);
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
	}
}
