package footballdata.api;

import java.util.ArrayList;
import java.util.List;

import footballdata.models.Competition;
import footballdata.models.Fixture;
import footballdata.models.LeagueTable;
import footballdata.models.GamePreview;
import footballdata.models.Player;
import footballdata.models.Team;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by davidduarte on 07/03/2018.
 * The REST API
 * http://api.football-data.org/documentation
 */
public interface FootballDataService {

    @GET("competitions")
    Call<List<Competition>> competitions();

    @GET("competitions/{competitionId}/teams")
    Call<ArrayList<Team>> teamsForCompetition(@Path("competitionId") int competitionId);

    @GET("competitions/{competitionId}/leagueTable")
    Call<LeagueTable> leagueTableForCompetition(@Path("competitionId") int competitionId);

    @GET("fixtures")
    Call<ArrayList<Fixture>> fixtures();

    @GET("fixtures/{fixtureId}")
    Call<GamePreview> gamePreview(@Path("fixtureId") int fixtureId);

    @GET("competitions/{competitionId}/fixtures")
    Call<ArrayList<Fixture>> fixturesForCompetition(@Path("competitionId") int competitionId);

    @GET("teams/{teamId}/fixtures")
    Call<ArrayList<Fixture>> fixturesForTeam(@Path("teamId") int teamId);

    @GET("teams/{teamId}")
    Call<Team> team(@Path("teamId") int teamId);

    @GET("teams/{teamId}/players")
    Call<ArrayList<Player>> playersForTeam(@Path("teamId") int teamId);

}
