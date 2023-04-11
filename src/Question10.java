
public class Question10 {
	public int solution(int[] data) {
		double total = 0;
		int len = data.length;
		
		for(int i = 0; i< len; i++) {  //숫자 합
			total += data[i];
		}
		
		int cnt = 0; //평균 이하 숫자 카운트 변수
		
		double average = (double)(total/len); //평균 구하기
		
		for(int i = 0; i< len; i++) {  //평균 이하 숫자 카운트
			if(data[i] < average) {
				cnt ++;
			}
		}
		return cnt;
	}
	public static void main(String args[]) {
		Question10 sol = new Question10();
		int[] data1 = {1,2,3,4,5,6,7,8,9,10};
		int ret1 = sol.solution(data1);
		System.out.println("Solution: return value of the method is " + ret1 + " .");
		
		int[] data2 = {1,1,1,1,1,1,1,1,1,10};
		int ret2 = sol.solution(data2);
		System.out.println("Solution: return value of the method is " + ret2 + " .");
	}
}
