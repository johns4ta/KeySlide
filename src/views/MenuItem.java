package views;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.java.swing.plaf.windows.resources.windows;

import utilities.Colors;

/**
 * Menu Items are JButtons that allow the user to go to different panels of the game. 
 * @author heshamsalman
 *
 */
public class MenuItem extends JButton implements MouseListener{
	private static final long serialVersionUID = 3699142395262583263L;
	Window window;
	public MenuItem(Window window, String text) {
		this.window = window;
		this.setText(text);
		this.setActionCommand(text);
		this.setFont(new Font("Arial", Font.PLAIN, 40));
		this.setMaximumSize(new Dimension(400, 100));
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setForeground(Colors.orange());
		addMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == this) {
			this.setForeground(Colors.selected());
		}
		this.updateUI();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == this) {
			this.setForeground(Colors.orange());
		}
		this.updateUI();
	}

	@Override
	public void mouseClicked(MouseEvent e) {}
}
