package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utilities.Colors;

/**
 * Game over screen. 
 * @author heshamsalman
 *
 */
public class GameOverMenu extends JPanel {

	private JLabel gameOver;
	private JLabel score;
	private ReplayButton replayButton;
	private BackButton backButton;
	
	public GameOverMenu(Window window, int points) {
		gameOver = new JLabel("Game Over");
		setOpaque(false);
		gameOver.setFont(new Font("Arial", Font.PLAIN, 40));
		gameOver.setForeground(Color.WHITE);
		score = new JLabel("Score: " + points); //TODO: Connect with database for actual score, or pass score to menu.
		score.setFont(new Font("Arial", Font.PLAIN, 40));
		score.setForeground(Color.WHITE);
		replayButton = new ReplayButton(window);
		backButton = new BackButton(window) {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == this) {
					this.setForeground(Color.WHITE);
				}
				this.updateUI();
			}
		};
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		gameOver.setSize(512, 256);
		add(gameOver);
		add(Box.createRigidArea(new Dimension(5, 25)));
		add(score);
		add(Box.createRigidArea(new Dimension(5, 25)));
		add(replayButton);
		add(Box.createRigidArea(new Dimension(5, 25)));
		add(backButton);
	}
	
	public void setScore(int points) {
		score.setText("Score: " + points);
		score.updateUI();
	}
	
}
