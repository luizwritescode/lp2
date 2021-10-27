package game;

public class Game {
	 
	 
	public static void main(String[] args) {
		GUI gui = new GUI();
		
		javax.swing.SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				gui.startScreen();
			}
		});
	}
}
