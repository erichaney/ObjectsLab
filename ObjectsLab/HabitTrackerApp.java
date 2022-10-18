/*#
 * This is the GUI (Graphical User Interface) for 
 * managing a list of habits.
 * 
 * This code will not work correctly until you have
 * completed all TODO items in the Habit class.
 * 
 * The only TODO items to complete here are to uncomment
 * the code after you have finished all parts of the Habit
 * class.
 */

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
import javafx.scene.text.Font;
import javafx.geometry.Insets;

public class HabitTrackerApp extends Application
{
    Habit h1, h2, h3;
    public void start(Stage stage)
    {
        //# TODO 10: Delete the /* comment symbol below
        /*
        Label appLabel = new Label("Habit Tracker");
        appLabel.setFont(new Font("Arial", 24));
        
        h1 = new Habit();
        h2 = new Habit();
        h3 = new Habit();
        
        HabitBox hb1 = new HabitBox(h1);
        HabitBox hb2 = new HabitBox(h2);
        HabitBox hb3 = new HabitBox(h3);
        
        VBox allHabits = new VBox(10, appLabel, hb1, hb2, hb3);
        allHabits.setPadding(new Insets(10));
        
        Scene scene = new Scene(allHabits);
        stage.setScene(scene);
        stage.show();
        */
       //# TODO 11: Delete the */ comment symbol above
    }

    //# TODO 12: Delete the /* comment symbol below
    /*
    class HabitBox extends VBox
    {
        Label nameLabel;
        Label progLabel;
        ProgressBar progBar;

        HabitBox(Habit h)
        {
            setSpacing(10);
            setMinSize(550, 70);

            // Habit label
            nameLabel = new Label("  " + h.name);

            // Configure progress bar showing the number of completions
            progLabel = new Label(getProgressText(h));
            progBar = new ProgressBar();
            progBar.setMinWidth(200);
            progBar.setProgress(0.0); // 0% completed at first.

            // Configure buttons and their actions
            Button setHabit = new Button("Habit/Goal");
            setHabit.setOnAction(event -> setHabitClicked(h));

            Button reset = new Button("Reset");
            reset.setOnAction(event -> resetClicked(h));

            Button addCompletion = new Button("+1");
            addCompletion.setOnAction(event -> addCompletionClicked(h));

            // Put all of the components into a layout
            ButtonBar buttons = new ButtonBar();
            buttons.getButtons().addAll(setHabit, reset, addCompletion);

            HBox indicators = new HBox(10,buttons, progBar, progLabel);

            this.getChildren().addAll(nameLabel, indicators);
        }

        void setHabitClicked(Habit h)
        {
            new HabitSettingsPopUp(h);
        }

        void resetClicked(Habit h)
        {
            h.resetCompletions();
            progLabel.setText(getProgressText(h));
            progBar.setProgress(h.getGoalProgress());
        }

        void addCompletionClicked(Habit h)
        {
            h.addCompletion();
            progLabel.setText(getProgressText(h));
            progBar.setProgress(h.getGoalProgress());
        }

        String getProgressText(Habit h)
        {
            return Integer.toString(h.completions) +
            "/" + Integer.toString(h.goal);
        }

        class HabitSettingsPopUp extends VBox
        {
            TextField nameField;
            TextField goalField;

            HabitSettingsPopUp(Habit h)
            {
                setSpacing(10);
                setPadding(new Insets(10));

                // Habit Name Settings
                Label habitLabel = new Label("Habit: ");
                nameField = new TextField(h.name);
                HBox habitSettings = new HBox(10, habitLabel, nameField);

                // Habit Goal Settings
                Label goalLabel = new Label("Goal: ");
                goalField = new TextField("" + h.goal);
                HBox goalSettings = new HBox(10, goalLabel, goalField);

                // Settings Confirmation Buttons
                Button cancel = new Button("Cancel");
                cancel.setOnAction(event -> cancelClicked());

                Button ok = new Button("Ok");
                ok.requestFocus();
                ok.setOnAction(event -> okClicked(h));

                // Put all of the components into a layout
                ButtonBar settingsButtons = new ButtonBar();
                settingsButtons.getButtons().addAll(cancel, ok);
                this.getChildren().addAll(habitSettings, goalSettings, settingsButtons);

                // Show a pop-up window
                Scene settingsScene = new Scene(this);
                Stage settingsStage = new Stage();
                settingsStage.setScene(settingsScene);
                settingsStage.initModality(Modality.APPLICATION_MODAL);
                settingsStage.show();
            }

            void cancelClicked()
            {
                Stage s = (Stage)this.getScene().getWindow();
                s.close();
            }

            void okClicked(Habit h)
            {
                // check if the input is a correctly-formatted positive number
                try {
                    int goal = Integer.parseInt(goalField.getText());
                    if (goal <= 0)
                    {
                        throw new IllegalArgumentException("Goal must be positive.");
                    }
                    h.setGoal(goal);
                    h.setName(nameField.getText());
                    nameLabel.setText(h.name);
                    progLabel.setText(getProgressText(h));
                    progBar.setProgress(h.getGoalProgress());
                    Stage s = (Stage)this.getScene().getWindow();
                    s.close();
                } catch (NumberFormatException e) {
                    goalField.setText("");
                    goalField.setPromptText("Invalid number format.");
                } catch (IllegalArgumentException e) {
                    goalField.setText("");
                    goalField.setPromptText(e.getMessage());
                }
            }
        }
    }  
    */
    //# TODO 13: Delete the */ comment symbol above
}