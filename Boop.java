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
	AudioClip cry;
	int XMove,YMove,X,Y;
	Image i,ii,iii,iiii,b;
  Timer time;
  Finalclass hog;
  Hammerclass Smash;
  JLabel points;
  int point=0;
   int disp1,disp2,disp3;
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
  int sealiox1,sealiox2,sealiox3,sealioy1,sealioy2,sealioy3;
  public void actionPerformed(ActionEvent e)
  {
  if(e.getSource()==time)
  {
   if(check1==false)
  {
   if(seal1.sealCheck()==true)
   {
	   disp1=0;
	   check1=true;
	   sealiox1=r.nextInt(3);
	   	sealioy1=r.nextInt(3);
	   	sealioy1++;
	   	sealiox1++;
	   	System.out.println("x1 " + sealiox1);
	   	System.out.println("y1 " + sealioy1);
	   	seal1.setX(((sealiox1*200)+38));
	seal1.setY(((sealioy1*200)+25));

   }

  }
   if(check2==false)
   {
  if(seal2.sealCheck()==true)
   {
	   disp2=0;
	check2=true;
	sealiox2=r.nextInt(3);
		sealioy2=r.nextInt(3);
		sealioy2++;
		sealiox2++;
		System.out.println("x2 " + sealiox2);
		System.out.println("y2 " + sealioy2);
		seal2.setX(((sealiox2*200)+38));
	seal2.setY(((sealioy2*200)+25));


   }
   }
   if(check3==false)
   {
   if(seal3.sealCheck()==true)
   {
	   disp3=0;
	check3=true;
	sealiox3=r.nextInt(3);
		sealioy3=r.nextInt(3);
		sealioy3++;
		sealiox3++;
		System.out.println("x3 " + sealiox3);
		System.out.println("y3 " + sealioy3);
		seal3.setX(((sealiox3*200)+38));
	seal3.setY(((sealioy3*200)+25));
   }
   if(check1==true)
   {
	   disp1++;
	   if(disp1==15)
	   {
		   check1=false;
		   System.out.println(disp1);
	   }
   }
      if(check2==true)
      {
   	   disp2++;
   	   if(disp2== 15)
   	   {
   		   check2=false;
   	   }
   }
      if(check3==true)
      {
   	   disp3++;
   	   if(disp3==15)
   	   {
   		   check3=false;
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
		//seal1.swap();
		//seal2.swap();
		//seal3.swap();
		//Smash.clickSwap();

		if(seal1.coordCheck(e.getX(),e.getY())==true)
		{
			seal1.sad();
			System.out.println("Seal 1 collide");
			check1=false;
			seal1.happy();
			point++;
			points.setText(point+"");
			cry.play();
		}
		else if(seal2.coordCheck(e.getX(),e.getY())==true)
		{
			seal2.sad();
			System.out.println("Seal 2 collide");
			check2=false;
			seal2.happy();
			point++;
			points.setText(point+"");
			cry.play();
		}
		else if(seal3.coordCheck(e.getX(),e.getY())==true)
		{
			seal3.sad();
			System.out.println("seal 3 collide");
			check3=false;
			seal3.happy();
			point++;
			points.setText(point+"");
			cry.play();
		}
		else if(seal1.coordCheck(e.getX(),e.getY())==false && seal2.coordCheck(e.getX(),e.getY())==false && seal3.coordCheck(e.getX(),e.getY())==false)
		{
			System.out.println("YOU SUCK");
		}

		repaint();
 }
 public void mousePressed(MouseEvent e)
 {
int DistX=e.getX();
		int DistY=e.getY();
	//if
		X=DistX-XMove;
		Y=DistY-YMove;
		repaint();
		Smash.clickSwap();


 }

    public void mouseReleased(MouseEvent e)
    {
Smash.clickSwap();
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
	//if
		X=DistX-XMove;
		Y=DistY-YMove;
		Smash.move(DistX-XMove,DistY-YMove);

				if(Smash.getX()>=600)
				{
					Smash.rightSwap();
				}
					 else if(Smash.getX()<=600)
				{
					Smash.leftSwap();
		}
		repaint();

   }
   public void mouseMoved(MouseEvent e)
   {
		int DistX=e.getX();
		int DistY=e.getY();
		//if() {
		Smash.move(DistX-XMove,DistY-YMove);

		if(Smash.getX()>=600)
		{
			Smash.rightSwap();
		}
			 else if(Smash.getX()<=600)
		{
			Smash.leftSwap();
		}

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
   time=new Timer(60,this);
   time.start();

   hog=new Finalclass();
  sadseal=getImage(getDocumentBase(),"sadseal.png");
  happyseal=getImage(getDocumentBase(),"seal.png");


  points=new JLabel(point+"");
  c.add(points);
  points.setForeground(Color.BLUE);
   seal1=new seal(happyseal,sadseal);
   seal2=new seal(happyseal,sadseal);
   seal3=new seal(happyseal,sadseal);

  //setSize(1200,1000);

  //i=getImage(getDocumentBase(),"clubbedseal.jpg");
  b=getImage(getDocumentBase(),"Background image 2 edit.png");
  i=getImage(getDocumentBase(),"hammer1 done.png");
  ii=getImage(getDocumentBase(),"hammer3 done.png");
  iii=getImage(getDocumentBase(),"hammer2 done.png");
  iiii=getImage(getDocumentBase(),"hammer4 DONE.png");
  Smash=new Hammerclass(i,ii,iii,iiii,0,0);
  	cry=getAudioClip(getDocumentBase(),"baby.wav");


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

       seal1.draw(g);
     }
     if(check2==true)
     {
    seal2.draw(g);
    //issue with blue circle
     }
     if(check3==true)
     {
    seal3.draw(g);
     }
    // g.drawImage(i,50,50,this);
    // g.drawImage(happyseal,50,50,this);
    	Smash.draw(g);
         //g.drawImage(i,X,Y,this);
    }

   }






}
