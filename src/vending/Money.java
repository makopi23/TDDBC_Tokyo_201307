package vending;

public enum Money {
	Ten(10),Fifty(50),Hundred(100), FiveHundred(500), Thousand(1000), 	// 想定内
	One(1), Five(5), FiveThousand(5000), TenThousand(10000)				// 想定外
	;
	private int value;
	Money(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
