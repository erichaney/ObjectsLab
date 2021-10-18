/*#
 * This is the GUI (Graphical User Interface) for 
 * managing a list of habits.
 * 
 * This code will not compile and work correctly until 
 * you have completed all TODO items in the Habit class.
 * 
 * There are no todo items to complete in this class.
 * Uncomment all of the code when you have finished the 
 * other parts of the lab.
 */

/*
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HabitTrackerApp extends Application
{
    Habit h1, h2, h3;
    VBox root;
    public void start(Stage stage)
    {
        h1 = new Habit();
        h2 = new Habit();
        h3 = new Habit();

        root = new VBox();

        layoutHabit(h1);
        layoutHabit(h2);
        layoutHabit(h3);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    void layoutHabit(Habit h)
    {
        VBox habitPane = new VBox();
        habitPane.setMinSize(550, 70);
        HBox indicators = new HBox(10);

        Label nameLabel = new Label(h.name);

        ProgressBar progBar = new ProgressBar();
        progBar.setMinWidth(200);
        progBar.setProgress(0.0);

        Label progLabel = new Label(getProgressText(h));

        Button settings = new Button("Habit/Goal");
        settings.setOnAction(event -> settingsPopUp(h, nameLabel, progLabel, progBar));

        Button reset = new Button("Reset");
        reset.setOnAction(event -> {
                h.resetCompletions();
                progLabel.setText(getProgressText(h));
                progBar.setProgress(h.getGoalProgress());
            });

        Button addCompletion = new Button("+1");
        addCompletion.setOnAction(event -> {
                h.addCompletion();
                progLabel.setText(getProgressText(h));
                progBar.setProgress(h.getGoalProgress());
            });

        ButtonBar buttons = new ButtonBar();
        buttons.getButtons().addAll(settings, reset, addCompletion);

        indicators.getChildren().addAll(buttons, progBar, progLabel);
        habitPane.getChildren().addAll(nameLabel, indicators);
        root.getChildren().add(habitPane);
    }

    String getProgressText(Habit h)
    {
        return Integer.toString(h.completions) +
        "/" + Integer.toString(h.goal);
    }

    void settingsPopUp(Habit h, Label nameLabel, Label progLabel, ProgressBar progBar)
    {
        HBox habitBox = new HBox(10);
        Label habitLabel = new Label("Habit: ");
        TextField nameField = new TextField(h.name);
        habitBox.getChildren().addAll(habitLabel, nameField);

        HBox goalBox = new HBox(10);
        Label goalLabel = new Label("Goal: ");
        TextField goalField = new TextField("" + h.goal);
        habitBox.getChildren().addAll(goalLabel, goalField);

        Button cancel = new Button("Cancel");
        cancel.setOnAction(event -> {
                Stage s = (Stage)cancel.getScene().getWindow();
                s.close();
            });
        Button ok = new Button("Ok");
        ok.requestFocus();
        ok.setOnAction(event -> {
                try {
                    int goal = Integer.parseInt(goalField.getText());
                    h.setGoal(goal);
                    h.setName(nameField.getText());
                    nameLabel.setText(h.name);
                    progLabel.setText(getProgressText(h));
                    progBar.setProgress(h.getGoalProgress());
                    Stage s = (Stage)cancel.getScene().getWindow();
                    s.close();
                } catch (NumberFormatException dumbUserError) {
                    goalField.setText("");
                    goalField.setPromptText("BAD NUMBER! :(");
                }
            });

        ButtonBar settingsButtons = new ButtonBar();
        settingsButtons.getButtons().addAll(cancel, ok);

        VBox settingsPane = new VBox(10);
        settingsPane.getChildren().addAll(habitBox, goalBox, settingsButtons);

        Scene settingsScene = new Scene(settingsPane);
        Stage settingsStage = new Stage();
        settingsStage.setScene(settingsScene);
        settingsStage.initModality(Modality.APPLICATION_MODAL);
        settingsStage.show();
    }
}
*/