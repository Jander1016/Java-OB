package Structural_Patterns.Facade;

import java.io.File;

public class AudioMixer {
  public File fix(VideoFile result) {
    System.out.println("AudioMixer: fixing Audio ...");
    return new File("tmp");
  }
}
