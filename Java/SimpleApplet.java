// <applet code="SimpleApplet" width=400 height=200></applet>
import java.applet.*;
import java.awt.*;
 public class SimpleApplet extends Applet
 {
	 public void paint(Graphics g)
	 {
		 g.drawString("Hello world in the applet form" , 20 , 20);
		 g.drawString("\tyou wrote the same shit" , 20 , 35);
	 }
 }
