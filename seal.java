
import java.awt.*;
import java.util.Random;

public class seal
{
	Image sad,happy,current;
	int x,y;


	public seal(Image happy,Image sad,int x,int y )
	{
		this.happy=happy;
		this.sad=sad;
		this.x=x;
		this.y=y;
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
		}
		else if(current==sad)
		{
			current=happy;
		}
	}

}