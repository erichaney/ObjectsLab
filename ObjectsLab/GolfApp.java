/*#
 * This is the graphics code setting up the windowing and
 * drawing of a golf game.
 * 
 * This code will not compile and work correctly until 
 * you have completed all TODO items in the Golf classes.
 * 
 * The only TODO items to complete here are to uncomment
 * the code after you have finished all parts of the
 * lab.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class GolfApp extends Application
{
    
    GolfGame game;
    GraphicsContext gc;
    double mouseX;
    double mouseY;
    
    public void start(Stage stage)
    {
        //# TODO 18: Delete the /* comment symbol below 
        /*
        game = new GolfGame();
        
        Canvas canvas = new Canvas(game.width, game.height);
        gc = canvas.getGraphicsContext2D();
        
        VBox vbox = new VBox();
        vbox.getChildren().add(canvas);
        Scene scene = new Scene(vbox);
        
        scene.setOnMouseClicked(this::handleClick);
        scene.setOnMouseMoved(this::handleMove);
        scene.setOnKeyPressed(this::handleKey);
        
        stage.setScene(scene);
        stage.setTitle("Golf Game");
        stage.show();
 
        GameTimer timer = new GameTimer();
        timer.start();
        */
       //# TODO 19: Delete the */ comment symbol above
    }
    
    //# TODO 20: Delete the /* comment symbol below 
    /*
    void handleClick(MouseEvent e)
    {
        if (!game.isGameOver && !game.ball.isMoving())
        {
            game.putt(mouseX, mouseY);
        }
    }
    
    void handleMove(MouseEvent e)
    {
        mouseX = e.getX();
        mouseY = e.getY();
    }
    
    void handleKey(KeyEvent e)
    {
        KeyCode k = e.getCode();
        
        if (k == KeyCode.ESCAPE)
        {
            startNewGame();
        }
    }
    
    void drawGame()
    {
        if (game.isGameOver)
        {
            drawGameOver();
            return;
        }
        
        drawGreen();
        drawGolfHole();
        drawGolfBall();
        drawPutts();
        
        if (!game.ball.isMoving())
        {
            drawPutter();
        }
    }
    
    void drawGameOver()
    {
        gc.setFill(Color.WHITE);
        gc.fillRect(game.width/2 - 100, game.height/2 - 100, 200, 200);
        gc.setFill(Color.BLACK);
        gc.fillText("You Win!", game.width/2 - 25, game.height/2 - 50);
        gc.fillText("Press ESCAPE to play again.", game.width/2 - 70, game.height/2);
    }
    
    void drawGreen()
    {
        // walls
        gc.setFill(Color.FIREBRICK);
        gc.fillRect(0, 0, game.width, game.height);
        
        // golf green
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(5, 5, game.width - 10, game.height - 10);
    }
    
    void drawGolfBall()
    {
        gc.setFill(Color.WHITE);
        gc.fillOval(game.ball.xPos - 10, game.ball.yPos - 10, 20, 20);
        gc.setStroke(Color.BLACK);
        gc.strokeOval(game.ball.xPos - 10, game.ball.yPos - 10, 20, 20);
    }
    
    void drawGolfHole()
    {
        gc.setFill(Color.BLACK);
        gc.fillOval(game.hole.xPos - 15, game.hole.yPos - 15, 30, 30);
    }
    
    void drawPutter()
    {
        gc.setStroke(Color.ORANGE);
        gc.strokeLine(game.ball.xPos, game.ball.yPos, mouseX, mouseY);
        gc.setFill(Color.ORANGE);
        gc.fillOval(mouseX - 10, mouseY - 10, 20, 20);
        
        gc.setStroke(Color.BLACK);
    }
    
    void drawPutts()
    {
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.WHITE);
        gc.fillText("Putts: " + game.putts, 8, 18);
    }
    
    void startNewGame()
    {
        game = new GolfGame();
    }
    
    class GameTimer extends AnimationTimer
    {
        public void handle(long time)
        {
            game.update();
            drawGame();
        }
    }
    */
   //# TODO 21: Delete the */ comment symbol above
}
