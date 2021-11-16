package Command;


import Command.Document;
import Command.Command;
import java.util.Stack;
import javax.swing.JTextPane;

//Geri alma komutu sınıfı
public class UndoCommand implements Command{
    private final Document  dc;
    
 public UndoCommand( final Document dc ) {
    this.dc = dc;
    }
 
    @Override
    public void execute() {
        dc.Undo();
    }
}
