package main;
import controllers.ControllerImc;
import models.ModelImc;
import views.ViewImc;


public class Main {

    private static ViewImc viewMessage;
    private static ModelImc modelMessage;
    private static ControllerImc controllerMessage;
    public static void main(String[] args) {
        viewMessage = new ViewImc();
        modelMessage = new ModelImc();
        controllerMessage = new ControllerImc(modelMessage, viewMessage);
        controllerMessage.initView();
        viewMessage.setVisible(true);
        
    }
    
}

