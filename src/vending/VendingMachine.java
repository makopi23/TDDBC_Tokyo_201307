package vending;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	//private int totalMoney= 0;

	private List<Money> totalMoney = new ArrayList<>();
	private Stock stock;
	{
		stock = new Stock(new Juice("コーラ", 120), 5);
	}

	public void input(Money money) throws InvalidMoneyException {
		switch (money) {
		case Fifty:
			break;
		case FiveHundred:
			break;
		case Hundred:
			break;
		case Ten:
			break;
		case Thousand:
			break;
		default:
			throw new InvalidMoneyException("想定外の金額が入力されました。 金額：" + money.getValue());

		}
		//totalMoney += money.getValue();
		totalMoney.add(money);
	}

	public int getTotalMoney() {
		//return totalMoney;
		int sum = 0;
		for(Money money : totalMoney){
			sum += money.getValue();
		}
		return sum;
	}

	public Change returnChange() {
		List<Money> m = new ArrayList<>(totalMoney);
		totalMoney.clear();
		return new Change(m);

	}

	public Stock getStock() {
		return stock;
	}

}
