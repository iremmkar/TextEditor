package Strategy;

import Strategy.Strategy;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class OperationAlignRight implements Strategy{
    @Override
    public SimpleAttributeSet Align(){
        
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_RIGHT);
        return attribs;
    }
}
