package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelImc;
import views.ViewImc;

public class ControllerImc implements ActionListener {
    
    private final ModelImc modelMessage;
    private final ViewImc viewMessage;

    public ControllerImc(ModelImc modelMessage, ViewImc viewMessage) {
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        this.viewMessage.jb_calcular.addActionListener(this);
       
    }
    
     public final void initView(){
        viewMessage.setTitle("Calcular Imc");
        viewMessage.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if( viewMessage.jtf_altura.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa Estatura");
        } else if ( viewMessage.jtf_peso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa Peso");
        
        }
          
        
     modelMessage.setPeso(Integer.parseInt(viewMessage.jtf_peso.getText()));
     modelMessage.setAltura(Double.parseDouble(viewMessage.jtf_altura.getText()));
     modelMessage.IMC();
      
     
     
    }

}
