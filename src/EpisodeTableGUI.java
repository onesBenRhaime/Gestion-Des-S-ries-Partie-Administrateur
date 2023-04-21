
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;

public class EpisodeTableGUI extends Application {
    private TableView<EpisodeData> table = new TableView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Créer les colonnes de la table
        TableColumn<EpisodeData, String> seriesNameCol = new TableColumn<>("Nom de la série");
        seriesNameCol.setCellValueFactory(new PropertyValueFactory<>("seriesName"));

        TableColumn<EpisodeData, String> episodeNameCol = new TableColumn<>("Nom de l'épisode");
        episodeNameCol.setCellValueFactory(new PropertyValueFactory<>("episodeName"));

        TableColumn<EpisodeData, LocalDate> dateCol = new TableColumn<>("Date de publication");
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<EpisodeData, Integer> scoreCol = new TableColumn<>("Score");
        scoreCol.setCellValueFactory(new PropertyValueFactory<>("score"));

        // Ajouter les colonnes à la table
        table.getColumns().addAll(seriesNameCol, episodeNameCol, dateCol, scoreCol);

        // Ajouter les données à la table
        ObservableList<EpisodeData> data = FXCollections.observableArrayList(
                new EpisodeData("Game of Thrones", "Winter is Coming", LocalDate.of(2011, 4, 17), 9),
                new EpisodeData("Breaking Bad", "Pilot", LocalDate.of(2008, 1, 20), 8),
                new EpisodeData("The Sopranos", "Pilot", LocalDate.of(1999, 1, 10), 9),
                new EpisodeData("The Wire", "The Target", LocalDate.of(2002, 6, 2), 9)
        );
        table.setItems(data);

        // Créer une nouvelle scène avec la table
        Scene scene = new Scene(table);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
