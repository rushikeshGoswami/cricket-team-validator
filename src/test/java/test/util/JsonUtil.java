package test.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import test.pojo.Player;
import test.pojo.Team;

public class JsonUtil {

	/**
	 * @return Team
	 */
	@SuppressWarnings("deprecation")
	public static Team extractTeamFromJson() {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("data.json");
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = null;
		try {
			jsonObject = (JsonObject) jsonParser.parse(new InputStreamReader(is, "UTF-8"));
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JsonArray jsonArray = jsonObject.getAsJsonArray("player");
		Team team = new Team();
		team.setName(jsonObject.get("name").getAsString());
		team.setName(jsonObject.get("location").getAsString());
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < jsonArray.size(); i++) {
			JsonObject obj = (JsonObject) jsonArray.get(i).getAsJsonObject();
			Player player = new Player(obj.get("name").getAsString(), obj.get("country").getAsString(),
					obj.get("role").getAsString(), obj.get("price-in-crores").getAsDouble());
			players.add(player);
		}
		team.setPlayers(players);
		return team;
	}
	
}
