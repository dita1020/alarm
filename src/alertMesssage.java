import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class alertMesssage {
    private JTextField vket;
    public String info2;
    
    public alertMesssage(){}
    
    public void alert(String vpath){
    }
    public void setVket(JTextField vKet){
        this.vket = vket;
    }
}

class alertInfo extends alertMesssage{
    public void alert(JTextField vket) {
        setVket(vket);
    JOptionPane.showMessageDialog(null, ""+vket.getText()+"");
    }
}