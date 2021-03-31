import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(220,120);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Left Count:" + leftCount);
    rightLabel = new JLabel("Right Count:" + rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")) {
      leftCount++;
      leftLabel.setText("Left Count:" + leftCount);
    }
    else if(ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("Right Count:" + rightCount);
    }
    else if(ae.getActionCommand().equals("Reset")) {
      leftCount = 0;
      rightCount = 0;
      leftLabel.setText("Left Count:" + leftCount);
      rightLabel.setText("Right Count:" + rightCount);
    } //From what I found on the internet, there are definitely better ways of doing this. However, my monkey brain needs to do more excerises before I understand them haha
  }
}