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
		 Finalclass hog;
		  JLabel points;
		  int point=0;
 		 Image i;
  		Image happyseal,sadseal;
 		 seal seal3;
 		 seal seal2;
 		 seal seal1;
  		Random r=new Random();
  		int circ;
  		int x2,x3,y2,y3;
 		 boolean check1,check2,check3;
 		 int x1=135;
  		int y1=600;
  		int cir;
		

  public void actionPerformed(ActionEvent e)
  {
if(e.getSource()==time)
  {
   if(check1==false)
  {
   if(seal1.sealCheck()==true)
   {
    System.out.println("draw");
    check1=true;
    circ=r.nextInt(9);
    System.out.println(circ);

    if(circ==0)
    {
     System.out.println("0");
     x1=135;
     y1=600;
    }
    else if(circ==1)
    {
     System.out.println("1");
     x1=135;
     y1=410;

    }
    else if(circ==2)
    {
     System.out.println("2");
     x1=135;
     y1=190;
    }
    else if(circ==3)
    {
     System.out.println("3");
     x1=488;
     y1=190;
    }
    else if(circ==4)
    {
     System.out.println("4");
     x1=488;
     y1=410;
    }
    else if(circ==5)
    {
     System.out.println("5");
     x1=490;
     y1=460;
    }
    else if(circ==6)
    {
     System.out.println("6");
      x1=790;
      y1=600;
    }
    else if(circ==7)
    {
     System.out.println("7");
      x1=790;
      y1=410;
    }
    else if(circ==8)
    {
     System.out.println("8");
      x1=780;
      y1=190;
    }

   }
  }
   if(check2==false)
   {
  if(seal2.sealCheck()==true)
   {
    check2=true;
    cir=r.nextInt(9);
    check2=true;
  if(cir==0)
  {
   x2=135;
   y2=600;
  }
  if(cir==1)
  {
   x2=135;
   y2=410;

  }
  if(cir==2)
  {
   x2=135;
   y2=190;
  }
  if(cir==3)
  {
   x2=488;
   y2=190;
  }
  if(cir==4)
  {
   x2=488;
   y2=410;
  }
  if(cir==5)
  {
   x2=490;
   y2=460;
  }
  if(cir==6)
  {
   x2=790;
   y2=600;
  }
  if(cir==7)
  {
    x2=790;
    y2=410;
  }
  if(cir==8)
  {
    x2=780;
    y2=190;
  }

   }
   }
   if(check3==false)
   {
   if(seal3.sealCheck()==true)
   {
 if(cir==0)
  {
   x3=135;
   y3=600;
  }
  if(cir==1)
  {
   x3=135;
   y3=410;

  }
  if(cir==2)
  {
   x3=135;
   y3=190;
  }
  if(cir==3)
  {
   x3=488;
   y3=190;
  }
  if(cir==4)
  {
   x3=488;
   y3=410;
  }
  if(cir==5)
  {
   x3=490;
   y3=460;
  }
  if(cir==6)
  {
   x3=790;
   y3=600;
  }
  if(cir==7)
  {
    x3=790;
    y3=410;
  }
  if(cir==8)
  {
    x3=780;
    y3=190;
  }
   } 
   repaint();
  }
  }

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
			addMouseListener(this);
				hog=new Finalclass();
				r= new Random();
				c.setBackground(Color.BLACK);
				time=new Timer(100,this);
				time.start();
				sadseal=getImage(getDocumentBase(),"sadseal.png");
				happyseal=getImage(getDocumentBase()"seal.png");
				points=new JLabel(point+"");
				c.add(points);
				points.setForeground(Color.WHITE);
				seal1=new seal(happyseal,sadseal,x1,y1);
				seal2=new seal(happyseal,sadseal,x2,y2);
				seal3=new seal(happyseal,sadseal,x3,y3);
				
			// TEST IMAGE i = getImage(getDocumentBase( ),"birb.jpg");

		}
		public class drawingPanel extends JPanel
			{
				public void paintComponent(Graphics g)
				
				{
					super.paintComponent(g);
				//TEST	g.drawImage(i,50, 50, this);
					hog.draw(g);
					if(check1==true)
					{
					seal1.draw(g,x1,y1);
					}
					if(check2==true)
					{
					seal2.draw(g,x2,y2);
					}
					if(check3==true)
					{
					seal3.draw(g,x3,y3);
					}
				}

			}






}
