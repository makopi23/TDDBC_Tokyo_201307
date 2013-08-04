package vending;

import java.util.Arrays;
import java.util.List;

public class Change {
	List<Money> moneyList;

	public Change(Money... moneys) {
		moneyList = Arrays.asList(moneys);
	}

	public Change(List<Money> money) {
		this.moneyList = money;
	}

	public int getToalAmount(){
		int sum = 0;
		for(Money m : moneyList) {
			sum += m.getValue();
		}
		return sum;
	}
}
