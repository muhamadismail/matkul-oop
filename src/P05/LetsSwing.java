package P05;

/**
 * Created by Ismail on 13-Mar-17.
 */
import javax.swing.JOptionPane;

public class LetsSwing {
    public static void main(String[] args)
    {
        String x = new String();
        for (int i = 0; i < 5; i++) {
            x = JOptionPane.showInputDialog("Haha");
        }

        System.out.println(x);
    }
}
