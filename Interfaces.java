
package interfaces;

import interfacesGUI.Carga;
import interfacesGUI.PrincipalBinv;
import javax.swing.JOptionPane;
public class Interfaces {
    public static void main(String[] args) {
        Carga l= new Carga();
        l.setVisible(true);
        PrincipalBinv m=new PrincipalBinv();
        m.setVisible(false);        
        try {
            for(int x=0;x<=100; x++){
                Thread.sleep(110);
                l.porcentaje.setText(Integer.toString(x)+"%");
                l.barra.setValue(x);
                if(x==100){
                    l.setVisible(false);
                    m.setVisible(true);
                }
                if(x==50 || x==90){
                    l.textlog.setText("Connecting to Database....");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
