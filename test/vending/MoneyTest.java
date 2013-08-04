package vending;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void _50円ならば数値として50を返す() {
		Money m = Money.Fifty;

		assertThat(m.getValue(), is(50));
	}

}
