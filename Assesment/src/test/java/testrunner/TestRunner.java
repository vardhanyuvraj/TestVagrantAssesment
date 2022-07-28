package testrunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import pojoclasses.Player;
import pojoclasses.RcbRoot;
import utilities.TestUtils;

public class TestRunner {

	private RcbRoot rcbRoot;

	@BeforeTest
	public void getRcbObject() throws StreamReadException, DatabindException, IOException {
		this.rcbRoot = TestUtils.getJsonObject();
	}

	@Test
	public void checkForeignPlayers() {
		int indianPlayers = 0;
		for (Player player : rcbRoot.getPlayer()) {
			if (player.getCountry().equalsIgnoreCase("India")) {
				indianPlayers++;
			}
		}
		Assert.assertEquals(11 - indianPlayers, 4);

	}

	@Test
	public void checkWicketKeeper() {

	}
}
