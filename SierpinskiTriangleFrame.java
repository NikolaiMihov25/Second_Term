package edu;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;
	static int order = 0;



	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));

		JButton minusButton = new JButton("-");
		panel.add(minusButton);
		minusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order--;
				trianglePanel.setOrder(order);
			}
		});
		
		JButton plusButton = new JButton("+");
		panel.add(plusButton);
		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order++;
				trianglePanel.setOrder(order);
			}
		});
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
	

	}

}
