package Strategy;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class OperationAlignCenter implements Strategy{
    @Override
    public SimpleAttributeSet Align(){ 
        
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_CENTER);
        return attribs;
    }
}
