//650점에서 800점 미만인 점수만
public class Question7 {
	int solution(int[]scores) {
		int count = 0;
		for(int i = 0; i<scores.length; i++) {
			if(scores[i]>=650 && scores[i]<800) {
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Question7 sol = new Question7();
		int[] scores = {650,722,914,558,714,803,650,679,669,800};
		int ret = sol.solution(scores);
		System.out.println("Solution : return value of the mathod is " + ret + " .");

	}

}
