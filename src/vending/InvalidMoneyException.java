package vending;

public class InvalidMoneyException extends Exception {

	public InvalidMoneyException() {
		super();
	}

	public InvalidMoneyException(String message) {
		super(message);
	}
}
