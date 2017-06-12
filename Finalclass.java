//Skylar James paul
//final
//5/22/17
import java.awt.*;
import java.util.Random;

public class Finalclass
{
		int x,y;
/*	public Finalclass(int x,int y)
	{
		this.x=x;
		this.y=y;
	} */

Random r=new Random();
int circle1;
boolean circ;

	public void draw(Graphics g)
	{	g.setColor(Color.WHITE);
		g.fillOval(200,200,150,100);
		g.setColor(Color.RED);
		g.fillOval(200,400,150,100);
		g.setColor(Color.MAGENTA);
		g.fillOval(200,600,150,100);
		g.setColor(Color.CYAN);
		g.fillOval(400,200,150,100);
		g.setColor(Color.BLUE);
		g.fillOval(400,400,150,100);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(400,600,150,100);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(600,200,150,100);
		g.setColor(Color.GREEN);
		g.fillOval(600,400,150,100);
		g.setColor(Color.YELLOW);
		g.fillOval(600,600,150,100);
	}
/// 177,639   160,421,    135,196    462,190
//488, 407         490,603      842,606     787,353     790,181
		public boolean sealCheck()
		{
			circ=false;
			circle1=r.nextInt(100);
			if(circle1 >= 50)
			{
				circ=true;
			}
			return circ;
		}


}
