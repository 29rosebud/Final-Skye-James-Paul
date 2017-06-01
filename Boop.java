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

public class Boop extends JApplet implements ActionListener, KeyListener, MouseListener, MouseMotionListener
{
	int XMove,YMove,X,Y;
	Image i,ii,b;
	//mouse
  Timer time;
  Finalclass hog;
  JLabel points;
  int point=0;

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
     x1=(135+38);
     y1=(600+25);
    }
    else if(circ==1)
    {
     System.out.println("1");
     x1=(135+38);
     y1=(410+25);

    }
    else if(circ==2)
    {
     System.out.println("2");
     x1=(135+38);
     y1=(190+25);
    }
    else if(circ==3)
    {
     System.out.println("3");
     x1=(488+38);
     y1=(190+25);
    }
    else if(circ==4)
    {
     System.out.println("4");
     x1=(488+38);
     y1=(410+25);
    }
    else if(circ==5)
    {
     System.out.println("5");
     x1=(490+38);
     y1=(460+25);
    }
    else if(circ==6)
    {
     System.out.println("6");
      x1=(790+38);
      y1=(600+25);
    }
    else if(circ==7)
    {
     System.out.println("7");
      x1=(790+38);
      y1=(410+25);
    }
    else if(circ==8)
    {
     System.out.println("8");
      x1=(780+38);
      y1=(190+25);
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
   x2=(135+38);
   y2=(600+25);
  }
  if(cir==1)
  {
   x2=(135+38);
   y2=(410+25);

  }
  if(cir==2)
  {
   x2=(135+38);
   y2=(190+25);
  }
  if(cir==3)
  {
   x2=(488+38);
   y2=(190+25);
  }
  if(cir==4)
  {
   x2=(488+38);
   y2=(410+25);
  }
  if(cir==5)
  {
   x2=(490+38);
   y2=(460+25);
  }
  if(cir==6)
  {
   x2=(790+38);
   y2=(600+25);
  }
  if(cir==7)
  {
    x2=(790+38);
    y2=(410+25);
  }
  if(cir==8)
  {
    x2=(780+38);
    y2=(190+25);
  }

   }
   }
   if(check3==false)
   {
   if(seal3.sealCheck()==true)
   {
	   check3=true;
 if(cir==0)
  {
   x3=(135+38);
   y3=(600+25);
  }
  if(cir==1)
  {
   x3=(135+38);
   y3=(410+25);

  }
  if(cir==2)
  {
   x3=(135+38);
   y3=(190+25);
  }
  if(cir==3)
  {
   x3=(488+38);
   y3=(190+25);
  }
  if(cir==4)
  {
   x3=(488+38);
   y3=(410+25);
  }
  if(cir==5)
  {
   x3=(490+38);
   y3=(460+25);
  }
  if(cir==6)
  {
   x3=(790+38);
   y3=(600+25);
  }
  if(cir==7)
  {
    x3=(790+38);
    y3=(410+25);
  }
  if(cir==8)
  {
    x3=(780+38);
    y3=(190+25);
  }
   }
   repaint();
  }
  }
  repaint();
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
   public void mouseDragged(MouseEvent e)
   {
	int DistX=e.getX();
		int DistY=e.getY();

		X=DistX-XMove;
		Y=DistY-YMove;
		repaint();

   }
   public void mouseMoved(MouseEvent e)
   {
		int DistX=e.getX();
		int DistY=e.getY();

		X=DistX-XMove;
		Y=DistY-YMove;
		repaint();
   }

  public void init()
  {
    setFocusable(true);
    setContentPane(new drawingPanel());
    Container c=getContentPane();
    c.setLayout(new FlowLayout());
   addKeyListener(this);
   addMouseListener(this);
   addMouseMotionListener(this);
   time=new Timer(100,this);
   time.start();

   hog=new Finalclass();
  sadseal=getImage(getDocumentBase(),"sadseal.png");
  happyseal=getImage(getDocumentBase(),"seal.png");

  points=new JLabel(point+"");
  c.add(points);
  points.setForeground(Color.BLUE);
   seal1=new seal(happyseal,sadseal,x1,y1);
   seal2=new seal(happyseal,sadseal,x2,y2);
   seal3=new seal(happyseal,sadseal,x3,y3);

  //setSize(1200,1000);

  //i=getImage(getDocumentBase(),"clubbedseal.jpg");
  b=getImage(getDocumentBase(),"Background image 2 edit.png");
  i=getImage(getDocumentBase(),"hammer1 done.png");
  ii=getImage(getDocumentBase(),"hammer3 done.png");



  }
  public class drawingPanel extends JPanel
   {
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);
     g.drawImage(b,0,0,this);
     hog.draw(g);

    // g.drawImage(ii,100,100,this);
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
     //g.drawImage(i,50,50,this);
     //g.drawImage(happyseal,50,50,this);
         g.drawImage(i,X,Y,this);
    }

   }






}
