import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

  Clip clip;

  public void setFile(String i) {
    try {
      AudioInputStream ais = AudioSystem.getAudioInputStream(new File(i));
      clip = AudioSystem.getClip();
      clip.open(ais);
    } catch (Exception e) {}
  }

  public void play() {
    clip.start();
  }

  public void loop() {
    clip.loop(Clip.LOOP_CONTINUOUSLY);
  }

  public void stop() {
    clip.stop();
  }
}
