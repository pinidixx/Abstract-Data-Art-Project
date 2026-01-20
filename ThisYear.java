import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

    // Instance variables
    private String[] goals;

    // No-argument constructor
    public ThisYear() {
        goals = new String[] {
            "Get better at running",
            "Read 3 books",
            "Practice piano",
            "Learn to cook"
        };
    }

    // Parameterized constructor
    public ThisYear(String[] goals) {
        this.goals = goals;
    }

    /**
   * Draws the Title Screen with the text My 2025 Goals
   */
    public void drawTitleScreen() {
        clear("pink");

        setTextHeight(60);
        setTextColor("white");
        setTextStyle(Font.SANS, FontStyle.BOLD);

        drawText("My", 125, 100);
        drawText("2025", 140, 160);
        drawText("Goals", 120, 215);
    
        pause(2.0);
    }

     /**
   * Draws all four goals on screen
   */
    public void drawScene() {
      drawTitleScreen();

        clear("pink");

        setTextHeight(30);
        setTextColor("white");
        setTextStyle(Font.SANS, FontStyle.ITALIC);

        // Display all goals
        drawText(goals[0], 40, 120);
        drawText(goals[1], 40, 180);
        drawText(goals[2], 40, 240);
        drawText(goals[3], 40, 300);
    }
       public void drawEndScreen() {
    setEndScreenStyle();
    clear("black");
    drawText("Goodbye!", 40, 120);
  }

  public void setTitleScreenStyle() {
    setTextHeight(70);
    setTextColor("pink");
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }
  

  public void setEndScreenStyle() {
    setTextHeight(60);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
  }

}
