package naughtsAndCrosses;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private boolean xOnTurn = true;
	private char[][] board = { { ' ', ' ', ' ',}, { ' ', ' ', ' ',}, { ' ', ' ', ' ',}, };
			 
	double boardMarginRatio = 0.1;
	double elementMarginRatio = 0.2;
	int upBoardBorder;
	int downBoardBorder;
	int leftBoardBorder;
	int rightBoardBorder;
	int squareWidth;
	int squareHeight;
	
	public GamePanel() {
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				System.out.print(x + " " + y);
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(board[i][j] == ' '
								&& x > leftBorder(j) && x < rightBorder(j)
								&& y < downBorder(i) && y < upBorder(i)) {
							if(xOnTurn) {
								board[i][j] = 'x';
							} else {
								board[i][j] = 'o';
							}
							xOnTurn = !xOnTurn;
							repaint();
						}
					}
				}
			}

			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBoard(g);
	}
	
	private void drawBoard(Graphics g) {
		upBoardBorder = (int)(boardMarginRatio * getHeight());
		downBoardBorder = (int)(getHeight() - boardMarginRatio * getHeight());
		leftBoardBorder = (int)(boardMarginRatio * getWidth());
		rightBoardBorder = (int)(getWidth() - boardMarginRatio *getWidth());
		squareWidth = (int)((getWidth() - 2 * boardMarginRatio * getWidth())/3);
		squareHeight = (int)((getHeight() - 2 * boardMarginRatio * getHeight())/3);
		
		//empty board
		for(int k = 1; k < 3; k++) {
//			horizontal lines
			g.drawLine(leftBoardBorder, upBorder(k), rightBoardBorder, upBorder(k));
//			vertical lines
			g.drawLine(leftBorder(k), upBoardBorder, leftBorder(k), downBoardBorder);
		}
		
//		x and o
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == 'x') {
					
//					left inclined diagonal
				g.drawLine((int) (leftBorder(j) + elementMarginRatio *squareWidth),
						(int) (upBorder(i) + elementMarginRatio *squareHeight),
						(int) (rightBorder(j) - elementMarginRatio *squareWidth),
						(int) (downBorder(i) - elementMarginRatio *squareHeight));
				
//				right inclined diagonal
				g.drawLine((int) (rightBorder(j) - elementMarginRatio *squareWidth),
						(int) (upBorder(i) + elementMarginRatio *squareHeight),
						(int) (leftBorder(j) + elementMarginRatio *squareWidth),
						(int) (downBorder(i) - elementMarginRatio *squareHeight));
				} else if(board[i][j] == 'o') {
					g.drawOval((int) (leftBorder(j) + elementMarginRatio *squareWidth),
							(int) (upBorder(i) + elementMarginRatio *squareHeight), 
							(int) (squareWidth- 2*elementMarginRatio *squareWidth), 
							(int) (squareHeight - 2*elementMarginRatio *squareHeight));
				}
			}
		}
	}
	
	private int leftBorder(int j) {
		return j * squareWidth + leftBoardBorder;
	}
	
	private int rightBorder(int j) {
		return (j + 1) * squareWidth + leftBoardBorder;
	}
	
	private int upBorder(int i) {
		return i * squareHeight + upBoardBorder;
	}
	
	private int downBorder(int i) {
		return (i + 1) * squareHeight + upBoardBorder;
	}
	
	
}
