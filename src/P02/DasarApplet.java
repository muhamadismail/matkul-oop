package P02;

/**
 * Created by Ismail on 28-Feb-17.
 */

import java.applet.*;
import java.awt.*;

public class DasarApplet extends Applet
{
    public void paint (Graphics g)
    {
        Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
        g.setColor(Color.GREEN);
        g.drawString ("Ini adalah program Applet", 140, 250);
    }
}
