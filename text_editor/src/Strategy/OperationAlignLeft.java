package Strategy;


import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class OperationAlignLeft implements Strategy{
    @Override
    public SimpleAttributeSet Align(){
        
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_LEFT);
        return attribs;
    }
}
