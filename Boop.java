//Skylar, James, and Maybe Paul
//Final bop
// 5/18/17


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;


public class Boop extends JApplet implements ActionListener, KeyListener
{
		Timer time;

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
		public void init()
		{
				setFocusable(true);
				setContentPane(new drawingPanel());
				Container c=getContentPane();
				c.setLayout(new FlowLayout());
			addKeyListener(this);

		}
		public class drawingPanel extends JPanel
			{
				public void paintComponent(Graphics g)
				{
					super.paintComponent(g);


				}

			}






}