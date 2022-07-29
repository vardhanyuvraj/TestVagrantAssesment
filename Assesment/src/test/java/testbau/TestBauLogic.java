package testbau;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import pojoclasses.Player;
import pojoclasses.RcbRoot;
import utilities.TestUtils;

public class TestBauLogic {

	private static RcbRoot rcbRoot;

	public static void getRcbRootObject() throws StreamReadException, DatabindException, IOException {
		rcbRoot = TestUtils.getRcbRootObject();
	}

	public static int getForeignPlayerCount() {
		int indianPlayers = 0;
		for (Player player : rcbRoot.getPlayer()) {
			if (player.getCountry().equalsIgnoreCase("India")) {
				indianPlayers++;
			}
		}
		return 11 - indianPlayers;
	}

	private static int getWicketKeeperCount() {
		int wicketKeeper = 0;
		for (Player player : rcbRoot.getPlayer()) {
			if (player.getRole().equalsIgnoreCase("Wicket-keeper")) {
				wicketKeeper++;
			}
		}
		return wicketKeeper;
	}

	public static boolean isAtleastOneWicketKeeper() {
		if (getForeignPlayerCount() >= 1) {
			return true;
		}
		return false;
	}

}
