import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

class F_Level1 implements ActionListener {
    JTextField[] field=new JTextField[25];


    MyLabel timeLabel = new MyLabel();
    int elapsedTime = 300000;
    int seconds =0;
    int minutes =0;
    int num[][] = new int[5][5];

    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    MyFrame frame = new MyFrame();
    MyLabel label = new MyLabel();
    MyButton button = new MyButton();
    MyButton button2 = new MyButton();
    Sound buttonM = new Sound();
    Sound music = new Sound();
    Sound music2 = new Sound();


    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            elapsedTime=elapsedTime-1000;

            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);

            timeLabel.setText(minutes_string+":"+seconds_string);
            if(seconds_string.equals("12")&&minutes_string.equals("00")){
                music.stop();
                music2.setFile("cd.wav");
                music2.play();
            }
            if(seconds_string.equals("00")&&minutes_string.equals("00")){

                new F_Lost();
                frame.dispose();
            }

        }

    });






    /*

     */

    F_Level1(){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        timeLabel.setText("05:00");
        timer.start();
        timeLabel.setFont(new Font("Now Bold", Font.PLAIN, 60));
        timeLabel.setBounds(
                size.width-300,
                50,
                200,
                50
        );
        button2.setText("Check");
        button2.setBounds(
                size.width-300,
                size.height-165,
                200,
                50
        );


        JPanel gridPanel=new JPanel();
        gridPanel.setLayout(new GridLayout(5, 5));
         gridPanel.setBounds((size.width/2)-250, 150, 500, 500);
        gridPanel.setPreferredSize(new Dimension(500, 500));
        for(int i=0; i<25; i++) {
            field[i]=new JTextField();
            field[i].setFont(new Font("Times new Roman", Font.BOLD, 30));
            field[i].setHorizontalAlignment(JTextField.CENTER);
            gridPanel.add(field[i]);

        }
        label.setFont(new Font("Now Bold",Font.PLAIN,50));
        label.setBounds(100,size.height-180,250,65);

        button.setText("Main Menu");
        button.setBounds(
                100,
                50,
                250,
                50
        );
        music.setFile("music.wav");
        music.play();
        music.loop();
        frame.add(label);
        frame.add(button2);
        frame.add(button);
        frame.add(timeLabel);


        frame.add(gridPanel);
        frame.setLayout(null);


        button.addActionListener(this);
        button2.addActionListener(this);


        field[0].setText("5");
        field[0].setEnabled(false);
        field[0].setDisabledTextColor(new Color(15, 156, 123));
        field[1].setText("4");
        field[1].setEnabled(false);
        field[1].setDisabledTextColor(new Color(15, 156, 123));
        field[3].setText("1");
        field[3].setEnabled(false);
        field[3].setDisabledTextColor(new Color(15, 156, 123));
        field[4].setText("2");
        field[4].setEnabled(false);
        field[4].setDisabledTextColor(new Color(15, 156, 123));
        field[5].setText("2");
        field[5].setEnabled(false);
        field[5].setDisabledTextColor(new Color(15, 156, 123));
        field[8].setText("4");
        field[8].setEnabled(false);
        field[8].setDisabledTextColor(new Color(15, 156, 123));
        field[12].setText("2");
        field[12].setEnabled(false);
        field[12].setDisabledTextColor(new Color(15, 156, 123));
        field[14].setText("4");
        field[14].setEnabled(false);
        field[14].setDisabledTextColor(new Color(15, 156, 123));
        field[15].setText("4");
        field[15].setEnabled(false);
        field[15].setDisabledTextColor(new Color(15, 156, 123));
        field[17].setText("1");
        field[17].setEnabled(false);
        field[17].setDisabledTextColor(new Color(15, 156, 123));
        field[20].setText("3");
        field[20].setEnabled(false);
        field[20].setDisabledTextColor(new Color(15, 156, 123));
        field[22].setText("4");
        field[22].setEnabled(false);
        field[22].setDisabledTextColor(new Color(15, 156, 123));
        field[16].setText("2");
        field[16].setEnabled(false);
        field[16].setDisabledTextColor(new Color(15, 156, 123));
        field[24].setText("1");
        field[24].setEnabled(false);
        field[24].setDisabledTextColor(new Color(15, 156, 123));


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            buttonM.setFile("buttonM.wav");
            buttonM.play();
            new F_Menu();
            music.stop();
            frame.dispose();
            timer.stop();
            if(minutes==0&&seconds<=12){
            music2.stop();
            }
        }
        if(e.getSource() == button2) {
            buttonM.setFile("buttonM.wav");
            buttonM.play();
            num[0][0] = Integer.parseInt(field[0].getText());
            num[0][1] = Integer.parseInt(field[1].getText());
            num[0][2] = Integer.parseInt(field[2].getText());
            num[0][3] = Integer.parseInt(field[3].getText());
            num[0][4] = Integer.parseInt(field[4].getText());
            num[1][0] = Integer.parseInt(field[5].getText());
            num[1][1] = Integer.parseInt(field[6].getText());
            num[1][2] = Integer.parseInt(field[7].getText());
            num[1][3] = Integer.parseInt(field[8].getText());
            num[1][4] = Integer.parseInt(field[9].getText());
            num[2][0] = Integer.parseInt(field[10].getText());
            num[2][1] = Integer.parseInt(field[11].getText());
            num[2][2] = Integer.parseInt(field[12].getText());
            num[2][3] = Integer.parseInt(field[13].getText());
            num[2][4] = Integer.parseInt(field[14].getText());
            num[3][0] = Integer.parseInt(field[15].getText());
            num[3][1] = Integer.parseInt(field[16].getText());
            num[3][2] = Integer.parseInt(field[17].getText());
            num[3][3] = Integer.parseInt(field[18].getText());
            num[3][4] = Integer.parseInt(field[19].getText());
            num[4][0] = Integer.parseInt(field[20].getText());
            num[4][1] = Integer.parseInt(field[21].getText());
            num[4][2] = Integer.parseInt(field[22].getText());
            num[4][3] = Integer.parseInt(field[23].getText());
            num[4][4] = Integer.parseInt(field[24].getText());

            if(Algo.isValidSudoku(num)){
             new F_Win();

                music.stop();
                frame.dispose();
                timer.stop();
                if(minutes==0&&seconds<=12){
                    music2.stop();
                }
            }   else {

                label.setText("Wrong");
            }

        }


    }



}

