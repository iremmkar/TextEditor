package Strategy;
import javax.swing.text.SimpleAttributeSet;
//Interface üzerinden ilgili stratejiyi çalıştırır
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    
    public SimpleAttributeSet Align(){
        return strategy.Align();
    }
}
