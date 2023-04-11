package level2;

public class Question6 {
	
	public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i =  floors[0]; i<length; ++i){
            if(floors[i]>floors[i-1])
                dist += floors[i] - floors[i-1];
            else
                dist += floors[i-1] - floors[i];
        }
        return dist;
	}
	public static void main(String[] args) {
		Question6 sol = new Question6();
        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}
