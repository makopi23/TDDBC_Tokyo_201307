package vending;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ChangeTest {

	@Test
	public void _0円のときのお釣の総計は0円() {
		Change sut = new Change();

		assertThat(sut.getToalAmount(), is(0));
	}

	@Test
	public void _50円のときのお釣の総計は50円() {
		Change sut = new Change(Money.Fifty);

		assertThat(sut.getToalAmount(), is(50));
	}

	@Test
	public void _50円と100円と1000円のときのお釣の総計は1150円() {
		Change sut = new Change(Money.Fifty, Money.Hundred, Money.Thousand);

		assertThat(sut.getToalAmount(), is(1150));
	}
}
