import java.awt.*;
import java.util.Random;

public class Hammerclass
{
	Image lhammer,rhammer,current,lhammerdown,rhammerdown;
	int x,y;
	boolean circ;
	Random r=new Random();
	int circle1;

	public Hammerclass(Image lhammer,Image rhammer, Image lhammerdown, Image rhammerdown, int x,int y )
	{
		this.lhammer=lhammer;
		this.rhammer=rhammer;
		this.lhammerdown=lhammerdown;
		this.rhammerdown=rhammerdown;
		this.x=x;
		this.y=y;
		current=rhammer;
	}

	public void draw(Graphics g)
	{
		g.drawImage(current,x,y,null);
	}
	public void coordSwap()
	{
		if(current==rhammer)
		{
			current=lhammer;
		}
		else if(current==lhammer)
		{
			current=rhammer;
		}
	}
	public void clickSwap()
	{
		if(current==lhammer)
		{
			current=lhammerdown;
		}
		else if(current==lhammerdown)
		{
			current=lhammer;
		}
		else if(current==rhammer)
		{
			current=rhammerdown;
		}
		else if(current==rhammerdown)
		{
			current=rhammer;
		}


	}
		public void leftSwap()
			{
				if(current==lhammer)
				{
					current=rhammer;
				}
			}
			public void rightSwap()
			{
				if(current==rhammer)
				{
					current=lhammer;
				}
			}

	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void move(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
