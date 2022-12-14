package Latihan5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class MessageForm extends JFrame {

    private JLabel messageLabel;
    private JButton saveButton, openButton, clearButton;
    private JTextArea messageTextArea;

    public static void main(String[] args) {
        new MessageForm();
    }

    public MessageForm() {
        setSize(400, 260);
        setTitle("Message Form");
        setLayout(null);

        JFileChooser chooser = new JFileChooser();

        messageLabel = new JLabel("Message");
        messageLabel.setBounds(10, 10, 100, 30);
        this.add(messageLabel);

        messageTextArea = new JTextArea();
        messageTextArea.setBounds(10, 50, 360, 100);
        this.add(messageTextArea);

        saveButton = new JButton("Save");
        saveButton.setBounds(10, 160, 80, 30);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser.showSaveDialog(null);
                File outputFile = chooser.getSelectedFile();
                FileOutputStream outputStream = null;
                try {
                    outputStream = new FileOutputStream(outputFile);
                    outputStream.write(messageTextArea.getText().getBytes());
                    outputStream.close();
                    String path = chooser.getSelectedFile().getAbsolutePath();
                    JOptionPane.showMessageDialog(null, "Anda menyimpan file : " + path);
                    
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        this.add(saveButton);

        openButton = new JButton("Open");
        openButton.setBounds(100, 160, 80, 30);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser.showOpenDialog(null);
                File inputFile = chooser.getSelectedFile();
                String path = chooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(null, "Anda membuka file : " + path);
                FileInputStream inputStream = null;
                try {
                    inputStream = new FileInputStream(inputFile);
                    byte[] byteArray = new byte[(int) inputFile.length()];
                    inputStream.read(byteArray);
                    StringBuilder inputText = new StringBuilder();
                    for (int i = 0; i < byteArray.length; i++) {
                        inputText.append((char) byteArray[i]);
                    }
                    inputStream.close();

                    messageTextArea.setText(inputText.toString());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        this.add(openButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(190, 160, 80, 30);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageTextArea.setText("");
            }
        });
        this.add(clearButton);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
