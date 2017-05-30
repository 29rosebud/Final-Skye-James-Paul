//Skylar, James, and Maybe Paul
//Final bop
// 5/18/17


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;


public class Driver extends JApplet implements ActionListener, KeyListener,MouseListener,MouseMotionListener
{
		Timer time;
		int XClick;
		int YClick;
		int X;
		int Y;
		//TEST Image i;
		Finalclass hog;
		Random r;

  public void actionPerformed(ActionEvent e)
  {

  }

   public void keyTyped(KeyEvent e)
    {

    }
    public void keyReleased(KeyEvent e)
    {

    }
    public void keyPressed(KeyEvent e)
    {


    }
    public void mouseClicked(MouseEvent e)
			{


			}
		public void mousePressed(MouseEvent e)
			{

			}

		public void mouseReleased(MouseEvent e)
			{

			}

		public void mouseEntered(MouseEvent e)
			{

			}

		public void mouseExited(MouseEvent e)
			{

			}
		public void mouseMoved(MouseEvent e)
			{
			//	XClick= e.getX()-X; for hammer?
			//	YClick= e.getY()-Y;

			}
	public void mouseDragged(MouseEvent e)
		{
		}
		public void init()
		{
				setFocusable(true);
				setContentPane(new drawingPanel());
				Container c=getContentPane();
				c.setLayout(new FlowLayout());
			addKeyListener(this);
				hog=new Finalclass();
				r= new Random();
				c.setBackground(Color.BLACK);
			// TEST IMAGE i = getImage(getDocumentBase( ),"birb.jpg");

		}
		public class drawingPanel extends JPanel
			{
				public void paintComponent(Graphics g)
				{
					super.paintComponent(g);
				//TEST	g.drawImage(i,50, 50, this);
					hog.draw(g);
				}

			}






}
