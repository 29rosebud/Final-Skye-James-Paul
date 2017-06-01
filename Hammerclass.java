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

	public void draw(Graphics g,int x1,int y1)
	{
		g.drawImage(current,x1,y1,null);
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
}