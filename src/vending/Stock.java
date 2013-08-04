package vending;

public class Stock {
	private Juice juice;
	private int count;
	public Stock(Juice juice, int count) {
		super();
		this.juice = juice;
		this.count = count;
	}
	public Juice getJuice() {
		return juice;
	}
	public int getCount() {
		return count;
	}


}
