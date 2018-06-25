package practice.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class _99999RandomQuestions {

	public static void main(String... args) {

		String movies[] = getMovieTitles("spiderman");
		for(String movie: movies) {
			System.out.println(movie);
		}

	}

	static String[] getMovieTitles(String substr) {
		final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
		List<String> movies = new ArrayList<>();
		try {
			String response = getResponse(url + substr);
			JsonParser parser = new JsonParser();
			JsonElement rootNode = parser.parse(response);

			JsonObject details = rootNode.getAsJsonObject();

			JsonElement totalMovies = details.get("total");
			//System.out.println(totalMovies.toString());

			JsonElement totalPages = details.get("total_pages");
			//System.out.println(totalPages.toString());

			int currentPage = 0;
			while (currentPage++ < Integer.parseInt(totalPages.toString())) {
				nextPage(movies, currentPage, substr);
			}
			Collections.sort(movies);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String[] result = new String[movies.size()];
		return movies.toArray(result);
	}

	static void nextPage(List<String> movies, int currentPage, String substr) throws Exception {
            final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
            String response = getResponse(url + substr + "&page=" + currentPage);
            JsonParser parser = new JsonParser();
            JsonElement rootNode = parser.parse(response);

            JsonObject details = rootNode.getAsJsonObject();
            JsonElement data = details.get("data");
            JsonArray jsonArray = data.getAsJsonArray();
            for (JsonElement each : jsonArray) {
                JsonObject titleObject = each.getAsJsonObject();
                String title = titleObject.get("Title").getAsString();
                movies.add(title);
            }
	}

        static String getResponse(String urlToRead) throws Exception {
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            return result.toString();
        }
    }
