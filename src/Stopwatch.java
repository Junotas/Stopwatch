import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Stopwatch implements ActionListener {


    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    //JButton stopButton = new JButton("STOP");
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

    Stopwatch(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);


}
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //three functions you need for the Stopwatch start, stop and reset
    void start() {

    }
    void stop() {

    }
    void reset () {

    }
}
