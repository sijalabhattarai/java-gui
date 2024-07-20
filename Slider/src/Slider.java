import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class Slider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    Slider() {
        frame = new JFrame("Colorful Vertical Slider");
        panel = new JPanel();
        panel.setBackground(new Color(173, 216, 230));

        label = new JLabel("Value: 50");
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setForeground(new Color(255, 69, 0));

        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        slider.setPreferredSize(new Dimension(50, 300));
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBackground(new Color(173, 216, 230));
        slider.addChangeListener(this);

        panel.setLayout(new BorderLayout());
        panel.add(slider, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setSize(200, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue();
        label.setText("Value: " + value);
    }

    public static void main(String[] args) {
        new Slider();
    }
}
