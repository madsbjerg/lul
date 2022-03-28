package application.controller;

public class Controller {
    private static Controller controller;

    public Controller getController(){
        if(controller == null) controller = new Controller();
        return controller;
    }

    
}
