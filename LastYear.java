import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {
  
  private String[] pictures;
  private String[] captions = {  //Captions
    "Friends",
    "Friends",
    "Friends",
    "Friends",
    "Sweet Sixteen",
    "Sweet Sixteen",
    "Sweet Sixteen",
    "Sweet Sixteen",
    "My Dog Tofu",
    "My Dog Tofu",
    "My Dog Tofu",
    "My Dog Tofu",
  };

  public LastYear() {
    pictures = FileReader.toStringArray("data1.txt");
  }

  public LastYear(String[] pictures) {
    this.pictures = pictures;
  }

  public void drawScene() {
    drawTitleScreen();
    pause(2.0);
  
    
    drawImagesWithCaptions();
    drawEndScreen();
  }
 /**
   * Draws the Title Screen
   */
  public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("End", 125, 100);
    drawText("of", 150, 160);
    drawText("Year", 120, 215);
    drawText("Recap", 86, 265);
  }

 
/**
   * Sets the height, color, and font style for the captions
   */
  public void drawImagesWithCaptions() {
   setCaptionStyle();
    for (int index = 0; index < pictures.length; index++) {
      //provides the argument, the image and then x and y positions
      drawImage(pictures[index], 0, 0, 400,400,0.0);
      //provides the argument, the image and then x and y positions
      drawText(captions[index], 50, 300);
      //pause for 2 second
      pause(2.5);
    }
  }
/**
   * Draws the End Screen and gives a 3 second pause after
   */
public void drawEndScreen() { 
  setEndScreenStyle(); 
  clear("pink"); 
  drawText("Goodbye 2025!", 40, 100);
  pause (3.0); 
}

 public void setTitleScreenStyle() {
    setTextHeight(70);
    setTextColor("pink");
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }

public void setCaptionStyle() {
  setTextHeight(50);
  setTextColor ("white");
  setTextStyle(Font.SANS, FontStyle.ITALIC);
}

  /**
   * Sets the End Screen's height, color, and font style
   */
  public void setEndScreenStyle() { 
    setTextHeight(45); 
    setTextColor("White"); 
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC); {
}
}
}