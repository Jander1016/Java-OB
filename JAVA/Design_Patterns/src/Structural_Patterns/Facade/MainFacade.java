package Structural_Patterns.Facade;

import java.io.File;

public class MainFacade {
  public static void main(String[] args) {
    VideoConversionFacade convert = new VideoConversionFacade();
    File mp4Video = convert.convertVideo("youtubevideo.ogg", "mp4");
  }
}
