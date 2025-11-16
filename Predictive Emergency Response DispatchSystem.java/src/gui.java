import javax.swing.*;
import java.awt.*;

public class MainUI{
     public static void main(String[] args) {
        JFrame frame = new JFrame("PERDS System GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 700);
        frame.setLayout(new BorderLayout());

        //makinng a input panel

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 1));
        inputPanel.setPreferredSize(new Dimension(250, 120));
        inputPanel.setBackground(Color.LIGHT_GRAY);

}