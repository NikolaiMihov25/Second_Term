package naughtsAndCrosses;

import javax.swing.JFrame;

public class GameApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new GamePanel());
		frame.setTitle("Naughts and Crosses");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
