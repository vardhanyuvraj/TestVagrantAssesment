package testrunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import testbau.TestBauLogic;

public class TestRunner {

	@BeforeTest
	public void getTeamRcbObject() throws StreamReadException, DatabindException, IOException {
		TestBauLogic.getRcbRootObject();
	}

	@Test
	public void checkForeignPlayers() {
		Assert.assertEquals(TestBauLogic.getForeignPlayerCount(), 4);

	}

	@Test
	public void checkWicketKeeper() {
		Assert.assertTrue(TestBauLogic.isAtleastOneWicketKeeper());

	}
}
