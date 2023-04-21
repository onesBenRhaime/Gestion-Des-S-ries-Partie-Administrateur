
import java.time.LocalDate;

public class EpisodeData {
    private String seriesName;
    private String episodeName;
    private LocalDate date;
    private int score;

    public EpisodeData(String seriesName, String episodeName, LocalDate date, int score) {
        this.seriesName = seriesName;
        this.episodeName = episodeName;
        this.date = date;
        this.score = score;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getScore() {
        return score;
    }
}
