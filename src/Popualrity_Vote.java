import java.util.Arrays;

public class Popualrity_Vote {
	
	public int[] popualrity_Vote(String idol[]) {
		int[] answer = new int[5];
		for(int i = 0; i<idol.length; i++) {
			if(idol[i].equals("더보이즈")) {
				answer[0] ++;
			}else if(idol[i].equals("아이브")) {
				answer[1] ++;
			}else if(idol[i].equals("뉴진스")) {
				answer[2] ++;
			}else if(idol[i].equals("르세라핌")) {
				answer[3] ++;
			}else if(idol[i].equals("엔믹스")) {
				answer[4] ++;
			}
		}
		System.out.println(Arrays.toString(answer));
		Arrays.parallelSort(answer);
		return answer;
	}
	public static void main(String[] args) {
		Popualrity_Vote pv = new Popualrity_Vote();
		String[] idol = {"더보이즈","아이브","뉴진스","르세라핌","엔믹스","더보이즈","아이브","아이브","뉴진스","더보이즈"};
		int[] res = pv.popualrity_Vote(idol);
		
		for(int i = 0; i<res.length; i++) {
			
			System.out.print(idol[i] + " : ");
			System.out.println(res[i]);
		}
	}

}
