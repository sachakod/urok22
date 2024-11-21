import javax.swing.*;
import java.awt.*;
public class Main {
    public Main(String string) {
    }
    public static void main(String[] args) {
        var a=new SunModel();
        var b=new View();
        Presenter p=new Presenter(a, b);
    }
    public class ContactForm extends JFrame {
    public ContactForm() {
        super("test");
        super.setBounds(200, 300, 400, 500);
        ContactForm form=new ContactForm();
        form.setVisible(true);
}


}
   
}