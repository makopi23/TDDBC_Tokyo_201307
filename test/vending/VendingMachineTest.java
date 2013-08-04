package vending;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void _50円を入れたら総額が50円になる() throws Throwable {
		VendingMachine machine = new VendingMachine();
		machine.input(Money.Fifty);
		assertThat(machine.getTotalMoney(), is(50));
	}

	@Test
	public void _50円と100円を入れたら150円になる() throws Throwable {
		VendingMachine machine = new VendingMachine();
		machine.input(Money.Fifty);
		machine.input(Money.Hundred);
		assertThat(machine.getTotalMoney(), is(150));
	}

	@Test
	public void ＿50円入れたらおつりは50円() throws Throwable {
		VendingMachine machine = new VendingMachine();
		machine.input(Money.Fifty);
		assertThat(machine.returnChange().getToalAmount(), is(50));
	}

	@Test
	public void ＿50円と100円入れたらおつりは150円() throws Throwable {
		VendingMachine machine = new VendingMachine();
		machine.input(Money.Fifty);
		machine.input(Money.Hundred);
		assertThat(machine.returnChange().getToalAmount(), is(150));
		assertThat(machine.getTotalMoney(), is(0));
	}

	@Test(expected=InvalidMoneyException.class)
	public void _5円を入れたらInvalidMoneyExceptionが返る() throws Throwable {
		VendingMachine machine = new VendingMachine();
		machine.input(Money.Five);
	}

	@Test
	public void _500円入れたらおつりは500円() throws Throwable {
		VendingMachine machine = new VendingMachine();
		machine.input(Money.FiveHundred);
		assertThat(machine.returnChange().getToalAmount(), is(500));
		assertThat(machine.getTotalMoney(), is(0));
	}

	@Test
	public void 初期状態でコーラを5本格納している() throws Throwable {
		VendingMachine machine = new VendingMachine();
		Stock stock = machine.getStock();
		assertThat(stock.getCount(), is(5));
		assertThat(stock.getJuice(), is(new Juice("コーラ",120)));
	}
}
