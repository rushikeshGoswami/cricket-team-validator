package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import test.pojo.Player;
import test.pojo.Team;
import test.util.JsonUtil;

public class TeamValidatorTest {

	Team team;

	@Before
	public void setUp() {
		System.out.println("setup started");
		team = JsonUtil.extractTeamFromJson();
	}

	@Test
	public void validateIfTeamHasOnlyFourForiegnPlayers() {

		List<Player> players = team.getPlayers();
		int countOfForiegnPlayers = 0;
		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			if (!"India".equalsIgnoreCase(player.getCountry())) {
				countOfForiegnPlayers = +1;
			}
		}

		assertEquals("Only four foriegn players are allowed", 4, countOfForiegnPlayers);

	}

	@Test
	public void validateIfAtleastOneWKIsInTeam() {
		System.out.println("test started");

		List<Player> players = team.getPlayers();
		boolean wkFlag = false;
		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			if ("Wicket-keeper".equalsIgnoreCase(player.getRole())) {
				wkFlag = true;
				break;
			}
		}

		assertTrue("Atleast one weeket-keeper should be in the team", wkFlag);

	}

}
