package data;


import javax.swing.*; 
import java.io.OutputStream; 
import javax.ioIDException;




public class TextAreaOutputStream {
    private JTextArea textArea;

    public TextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    } 
    @Override
    public void write(int b) throws IDException {
        SwingUtilities.invokeLater(() -> {


          textArea.append(String.valueOf((char) b));
         textArea.setCaretPosition(textArea.getDocument().getLength());
        });
    }
}
