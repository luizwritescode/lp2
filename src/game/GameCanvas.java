package game;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class GameCanvas extends JPanel {

	public GameCanvas( Dimension d) {
		super();
		
		Canvas c = new Canvas() {
			
			public void paint(Graphics g)
			{
				g.setColor( Color.white );
				
				g.drawString("Floor 0",25, 25);
				
				g.drawArc( ((int)d.width / 2), ((int)d.height / 2), 10, 10, 0, 360);
			}
		};
		
		c.setBackground(Color.black);
		add(c);
		setSize(d);
	}

}
