package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class DVD {
    private float x;
    private float y;
    private float height;
    private float width;
    private final float xDefSpeed;
    private final float yDefSpeed;
    private float xSpeed;
    private float ySpeed;
    private Color color;

    public DVD()
    {
        this.width = 150f;
        this.height = 100f;
        this.x = (float)(Math.random()*(Main.getScreenWidth()-this.width));
        this.y = (float)(Math.random()*(Main.getScreenHeight()-this.height));
        this.xDefSpeed = 5;
        this.yDefSpeed = 5 ;
        this.xSpeed = xDefSpeed*((((int)(Math.random()*2)) == 1)?-1:1);
        this.ySpeed = yDefSpeed*((((int)(Math.random()*2)) == 1)?-1:1);
        this.color = generateColor();
    }
    public void update()
    {
        if(this.x + this.width > Main.getScreenWidth())
        {
            this.xSpeed = ((float)(Math.random()*(xDefSpeed)+(xDefSpeed-0.1f)))*-1;
            color = generateColor();
        }
        if(this.x < 0)
        {
            this.xSpeed = (float)(Math.random()*(xDefSpeed)+(xDefSpeed-0.1f));
            color = generateColor();
        }
        if(this.y + this.height > Main.getScreenHeight())
        {
            this.ySpeed = ((float)(Math.random()*(yDefSpeed)+(yDefSpeed-0.1f)))*-1;
            color = generateColor();
        }
        if( this.y < 0)
        {
            this.ySpeed = ((float)(Math.random()*(yDefSpeed)+(yDefSpeed-0.1f)));
            color = generateColor();
        }

        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
    }
    public Color generateColor()
    {
        switch((int)(Math.random()*4))
        {
            case 1:
                return Color.red;
            case 2:
                return Color.blue;
            case 3:
                return Color.white;
            case 0:
                return Color.green;
        }
        return null;
    }
    public void render(Graphics g)
    {
        g.setColor(color);
        g.fillOval(this.x, this.y, this.width, this.height);
    }
}
