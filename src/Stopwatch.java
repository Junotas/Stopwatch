import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Stopwatch implements ActionListener {


    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
   // JButton stopButton = new JButton("STOP");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    boolean running = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String hours_string = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            elapsedTime=elapsedTime+1000;
            hours = (elapsedTime/3600000);
            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);

        }

    });

    Stopwatch(){

        //The content of the frame printed out in the frame of the program
        timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        timeLabel.setBounds(100,100,200,100);
        timeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        timeLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        //buttons layout, did the start button then just copied everything from it to the others
        startButton.setBounds(100,200,100,30);
        startButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        startButton.setFocusPainted(false);
        startButton.addActionListener(this);

        resetButton.setBounds(200,200,100,30);
        resetButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        resetButton.setFocusPainted(false);
        resetButton.addActionListener(this);
/*
        stopButton.setBounds(100,200,100,30);
        stopButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        stopButton.setFocusPainted(false);
        stopButton.addActionListener(this);
        */


        //Frame of the program
        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);


}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==startButton){
            start();
        }

    }

    //three functions you need for the Stopwatch start, stop and reset
    void start() {
        timer.start();

    }
    void stop() {

    }
    void reset () {

    }
}
