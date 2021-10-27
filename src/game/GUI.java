package game;

import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	public JFrame frame;
	public JPanel home;
	public GameCanvas game;
	public Dimension dim;
	public BoxLayout bl;
	
	public GUI() {
		frame = new JFrame("Aquatica");
		home = new JPanel();
		dim = new Dimension(1280,768);
		game = new GameCanvas( dim );
	}
	
	
	public void startScreen() {
        //Cria janela
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Aquatica");
        label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        
        this.home.setPreferredSize( this.dim );
        this.home.setAlignmentX( JComponent.CENTER_ALIGNMENT);
        this.home.setAlignmentY( JComponent.CENTER_ALIGNMENT );
        this.home.setLayout( new BoxLayout(this.home,BoxLayout.PAGE_AXIS) );
        
        JPanel buttons = new JPanel();
        buttons.setLayout( new BoxLayout(buttons,BoxLayout.PAGE_AXIS) );
        buttons.setPreferredSize( new Dimension(this.dim.width, this.dim.height ));
        buttons.setAlignmentX( JComponent.CENTER_ALIGNMENT );
        
 
        //Adciona titulo e botoes
        JButton b_play = new JButton("Jogar");
        b_play.setAlignmentX( JComponent.CENTER_ALIGNMENT );
        b_play.setVerticalTextPosition(AbstractButton.CENTER);
        b_play.setHorizontalTextPosition(AbstractButton.CENTER);
        b_play.setMnemonic(KeyEvent.VK_SPACE);
        b_play.addActionListener(this);
        buttons.add(b_play);
        
        
        JButton b_tutorial = new JButton("Tutorial");
        b_tutorial.setAlignmentX( JComponent.CENTER_ALIGNMENT );
        b_tutorial.setVerticalTextPosition(AbstractButton.CENTER);
        b_tutorial.setHorizontalTextPosition(AbstractButton.CENTER);
        b_tutorial.setMnemonic(KeyEvent.VK_T);
        b_tutorial.addActionListener(this);
        buttons.add(b_tutorial);
        
        JButton b_exit = new JButton("Sair");
        b_exit.setAlignmentX( JComponent.CENTER_ALIGNMENT );
        b_exit.setVerticalTextPosition(AbstractButton.CENTER);
        b_exit.setHorizontalTextPosition(AbstractButton.CENTER);
        b_exit.setMnemonic(KeyEvent.VK_ESCAPE);
        b_exit.addActionListener(this);
        buttons.add(b_exit);
        
        //Mostra a janela
        this.home.add(label);
        this.home.add(buttons);
        
        this.frame.add(home);
        this.frame.pack();
        this.frame.setVisible(true);
    }
	
	public void actionPerformed( ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		switch(cmd) {
		case "Jogar":
			gameScreen();
			break;
		case "Tutorial":
			tutorialScreen();
			break;
		case "Sair":
			System.exit(0);
		}
		
	}
	
	public void gameScreen() {
		this.frame.add( this.game );
		this.home.setVisible(false);
		this.game.setVisible(true);
		

	}
	public void tutorialScreen() {
		
	}
	
}
