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

 int gameTime=0;
 boolean check=false;
 boolean pcheck=false;
 int gametimeSeal1,gametimeSeal2,gametimeSeal3;
 AudioClip cry;
 AudioClip background;
 AudioClip lose;
 Image bear;
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
  int lives=3;
  public void actionPerformed(ActionEvent e)
  {
  if(e.getSource()==time)
  {
   gameTime++;
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
 seal1.timeCheck(gameTime);

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
 seal2.timeCheck(gameTime);



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
 seal3.timeCheck(gameTime);
   }


  }
  if(gameTime-seal1.getTime() >= 100)
   {


     check1=false;
       repaint();



   }
      if(gameTime-seal2.getTime() >= 100)
      {

        check2=false;
          repaint();


    }
      if(gameTime-seal3.getTime() >= 100)
      {

        check3=false;
          repaint();

    }
     if(gameTime-gametimeSeal1 <= 3)
      {
       seal1.happy();
       check1=false;


      }
      if(gameTime-gametimeSeal2 <= 3)
      {
       seal2.happy();
       check2=false;
      }
      if(gameTime-gametimeSeal3 <= 3)
      {
       seal3.happy();
       check3=false;
  }
    repaint();
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
  //seal1.swap();
  //seal2.swap();
  //seal3.swap();
  //Smash.clickSwap();



 // repaint();
 }
 public void mousePressed(MouseEvent e)
 {
int DistX=e.getX();
  int DistY=e.getY();
 //if
  X=DistX-XMove;
  Y=DistY-YMove;
 // repaint();
  Smash.clickSwap();
  if(seal1.coordCheck(e.getX(),e.getY())==true)
    {
     gametimeSeal1=gameTime;
     seal1.sad();
     System.out.println("Seal 1 collide");
     //check1=false;
     //seal1.happy();
     if(pcheck==false)
     {
     point++;

     points.setText(point+"");
	 }
     cry.play();
    }
    else if(seal2.coordCheck(e.getX(),e.getY())==true)
    {
     gametimeSeal2=gameTime;
     seal2.sad();
     System.out.println("Seal 2 collide");

      //check2=false;
      //seal2.happy();

	if(pcheck==false)
	{
     point++;
     points.setText(point+"");
 	}
     cry.play();
    }
    else if(seal3.coordCheck(e.getX(),e.getY())==true)
    {
     gametimeSeal3=gameTime;
     seal3.sad();
     System.out.println("seal 3 collide");
     //check3=false;
     //seal3.happy();
     if(pcheck==false)
     {
     point++;
     points.setText(point+"");
 	}
     cry.play();
    }
    else if(seal1.coordCheck(e.getX(),e.getY())==false && seal2.coordCheck(e.getX(),e.getY())==false && seal3.coordCheck(e.getX(),e.getY())==false)
    {
     System.out.println("YOU SUCK");
     lives--;
     if(lives==0)
     {
     System.out.println("You lose.");

     check=true;
     check1=false;
     check2=false;
     check3=false;
     pcheck=true;

          time.stop();
          repaint();
     }
  }



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

  Smash.move(DistX-XMove,DistY-YMove);

    if(Smash.getX()>=600)
    {
     Smash.rightSwap();
    }
      else if(Smash.getX()<=600)
    {
     Smash.leftSwap();
  }
  	Smash.move(DistX-25,DistY-25);

  repaint();

   }
   public void mouseMoved(MouseEvent e)
   {
  int DistX=e.getX();
  int DistY=e.getY();
  //if() {
	  Smash.move(DistX-25,DistY-25);


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
   lose=getAudioClip(getDocumentBase(),"madlad.wav");
   bear=getImage(getDocumentBase(),"polarbear.png");
   background=getAudioClip(getDocumentBase(),"Chubbycat.wav");
	 background.loop();


  }
  public class drawingPanel extends JPanel
   {
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);
     g.drawImage(b,0,0,this);
     hog.draw(g);

     if(check1==true)
     {

       seal1.draw(g);
     }
     if(check2==true)
     {
    seal2.draw(g);

     }
     if(check3==true)
     {
    seal3.draw(g);
     }

     Smash.draw(g);

		if(check==true)
		{
			g.drawImage(bear,830,500,this);
		}

    }
	/*	 if(check==true)
		 {
			 g.drawImage(bear,1000,500,this);
		 }
		 */

   }






}
