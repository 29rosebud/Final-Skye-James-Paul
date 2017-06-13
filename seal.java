
import java.awt.*;
import java.util.Random;

public class seal
{
	Image sad,happy,current;
	int x,y;
	boolean circ;
	Random r=new Random();
	int circle1;
	boolean check;
	int activetime;
	public seal(Image happy,Image sad )
	{
		this.happy=happy;
		this.sad=sad;
		//this.x=x;
		//this.y=y;
		current=happy;
	}

	public void draw(Graphics g)
	{
		g.drawImage(current,x,y,null);
	}
	public void swap()
	{
		if(current==happy)
		{
			current=sad;
			System.out.println("sad");
		}
		else
		{
			current=happy;
			System.out.println("happy");
		}
	}
	public void sad()
	{
		current=sad;
	}
	public void happy()
	{
		current=happy;
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
		public boolean coordCheck(int x3, int y3)
		{
					//System.out.println("p x " + x + "y " + y + "x3 " + x3 + "y3 " + y3);
			check=false;
			if(x3 <= x +73 && x3 >= x)
			{
				if(y3 >= y && y3 <= y + 63)
				{
					//if(x3 > x && x3 < (x+73) && y3 >y && y3 < (y+63))
					//{
					check=true;

					//System.out.println("x " + x + "y " + y + "x3 " + x3 + "y3 " + y3);

					//}
				}

			}
			return check;
		}
		public void setX(int xx)
		{
			x=xx;
		}

		public void setY(int yy)
		{
			y=yy;
		}
		public void timeCheck(int potato)
		{
			activetime=potato;
			System.out.println(activetime);

		}
		public int getTime()
		{
			return activetime;
		}


}
