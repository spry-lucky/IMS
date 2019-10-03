package sample;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    private TextField tname;
    private TextField tid;
    private TextField tmarks;
    private TextField tcontact;

    public TextArea texta;

    public void buttonclicked()
    {

        texta.appendText(tname.getText()+"\t"+tid.getText()+"\t"+tmarks.getText()+"\t"+tcontact.getText()+"\n");

    }

}
