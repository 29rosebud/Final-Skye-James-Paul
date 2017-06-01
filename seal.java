
import java.awt.*;
import java.util.Random;

public class seal
{
 Image sad,happy,current;
 int x,y;
 boolean circ;
 Random r=new Random();
 int circle1;

 public seal(Image happy,Image sad,int x,int y )
 {
  this.happy=happy;
  this.sad=sad;
  this.x=x;
  this.y=y;
  current=happy;
 }

 public void draw(Graphics g,int x1,int y1)
 {
  g.drawImage(current,x1,y1,null);
 }
 public void swap()
 {
  if(current==happy)
  {
   current=sad;
  }
  else if(current==sad)
  {
   current=happy;
  }
 }
 public boolean sealCheck()
  {
   circ=false;
   circle1=r.nextInt(100);
   if(circle1 >= 90)
   {
    circ=true;
   }
   return circ;
  }


}
