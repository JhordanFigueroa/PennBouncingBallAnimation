import java.util.ArrayList;

public class BouncingBall {
//This is the primary functionality of the program

    public static void main(String[] args) {
        PennDraw.setCanvasSize(500, 500);
        PennDraw.setScale(0, 500);
        PennDraw.enableAnimation(60); //Every 1/60 of a second, position will update
        Ball ball = new Ball(250, 250, 15);
        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>(); //arbitrary number of obstacles
//        ball.draw();
        while(true) {
            PennDraw.clear(); //to clear screen
            if(PennDraw.mousePressed()) {
                Vector2 mousePos = new Vector2(PennDraw.mouseX(), PennDraw.mouseY());
                Obstacle newObst = new Obstacle(mousePos.x, mousePos.y, 30); //everytime the user clicks, it draws
                //an obstacle and appdends that ball to the arraylist of obstacles
                obstacles.add(newObst);
            }
            ball.checkForBounce(obstacles);
            ball.updatePosition(0.167);
            ball.draw();
            for(Obstacle o : obstacles) {
                o.draw();
            }
            PennDraw.advance();
        }

    }
}
