package Command;

import java.util.Stack;
import javax.swing.JTextPane;
//Receiver sınıf
//Asıl işlemlerimiz bu sınıfta gerçekleşiyor
import javax.swing.JTextPane;

public class Document{
    protected JTextPane textarea;
    protected Stack stack;

    public Document(JTextPane textarea, Stack s) {
        this.textarea = textarea;
        this.stack = s;
    }
    public JTextPane Undo(){
        JTextPane newTextArea = textarea;
        String oldText = "";
        try {
            oldText = (String) stack.pop();
            newTextArea.setText(oldText);
        } catch (Exception e) {
        }
        return newTextArea;
    }
}
