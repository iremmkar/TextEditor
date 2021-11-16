package Command;


import Command.Command;

//invoker sınıf
//Komut sınıflarının çağrılması
public class Commander {
    private final Command undoCommand;
    
    public Commander( final Command undoCommand) {
        this.undoCommand = undoCommand;
        
    }
    public void undoCom() {
       undoCommand.execute();
    }
}
