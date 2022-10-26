import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch implements ActionListener{

    JLabel timeLabel = new JLabel();
    int elapsedTime = 300000;
    int seconds =0;
    int minutes =0;

    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);


    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            elapsedTime=elapsedTime-1000;

            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);

            timeLabel.setText(minutes_string+":"+seconds_string);

        }

    });


    StopWatch(){


    }
    @Override
    public void actionPerformed(ActionEvent e) {


    }
    void start() {
        timer.start();
    }

}
