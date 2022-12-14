package Latihan2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Soal4 extends JFrame {

    private JButton openButton, saveButton;

    public static void main(String[] args) {
        new Soal4();
    }

    public Soal4() {
        JFileChooser chooser = new JFileChooser();

        setSize(220, 150);
        setTitle("Stream");
        setLayout(null);

        openButton = new JButton("Open");
        openButton.setBounds(10, 10, 80, 80);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser.showOpenDialog(null);
                String path = chooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(null, "Anda membuka file : " + path);
            }
        });
        this.add(openButton);

        saveButton = new JButton("Save");
        saveButton.setBounds(120, 10, 80, 80);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser.showSaveDialog(null);
                String path = chooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(null, "Anda menyimpan file : " + path);
            }
        });
        this.add(saveButton);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
