package level2;

//화씨온도(℉)에서 섭씨온도(℃)로 환산 : (화씨온도 - 32) ÷ 1.8 = 섭씨온도
//섭씨온도(℃)에서 화씨온도(℉)로 환산 : (섭씨온도 x 1.8) + 32 = 화씨온도

public class Question7 {
	public int solution(int value, String unit) {
        int converted = 0;
        if(unit.equals("C")) {
        	converted = (int)(value*1.8)+32;
        }else if(unit.equals("F")) {
        	converted = (int)((value-32)/1.8);
        }


        return converted;
    }
	public static void main(String[] args) {
		Question7 sol = new Question7();
        int value = 527;
        String unit = "C";
        int ret = sol.solution(value, unit);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
