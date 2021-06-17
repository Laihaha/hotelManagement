package workdemo;

public class SaleMachine {

	private int fiveNum,orangeNum,beerNum;
	private String[] type = {"beer", "orange"};
	private String[] answer = {"�ܱ�Ǹ��û��","��ȡ��","�ú�5Ԫ����ȡ��","û����Ǯ�ң�����10Ԫ","����ָ�"};
	
	public SaleMachine() {
		orangeNum = 5;
		beerNum = 5;
		fiveNum = 5;
	}
	
	public String sale(String drink,int money) {
		String result = null;
		if(beerNum <1 && drink.equals(type[0]) || orangeNum < 1 && drink.equals(type[1]) ) {
			result = answer[0] + drink;
		} else if(money == 5) {
			fiveNum++;
			result = answer[1] + drink;
			if(drink.equals(type[0])) {
				beerNum--;
			} else if(drink.equals(type[1])) {
				orangeNum--;
			} else {
				result = answer[4];
			}
		} else if(money == 10) {
			if(fiveNum < 1) {
				result = answer[3];
			} else {
				fiveNum--;
				result = answer[2] + drink;
				if(drink.equals(type[0])) {
					beerNum--;
				} else if(drink.equals(type[1])) {
					orangeNum--;
				} else {
					result = answer[4];
				}
			}
			
		} else {
			result = answer[4];
		}
		return result;
	}
	
}
