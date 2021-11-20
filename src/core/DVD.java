package core;

import org.newdawn.slick.Graphics;

public class DVD {
    private float x;
    private float y;
    private float height;
    private float width;
    private float xSpeed;
    private float ySpeed;

    public DVD()
    {
        this.width = 150f;
        this.height = 100f;
        this.x = (float)(Math.random()*(Main.getScreenWidth()-this.width));
        this.y = (float)(Math.random()*(Main.getScreenHeight()-this.height));
        this.xSpeed = 10*((((int)(Math.random()*2)) == 1)?-1:1);
        this.ySpeed = 10*((((int)(Math.random()*2)) == 1)?-1:1);
    }
    public void update()
    {
        if(this.x + this.width > Main.getScreenWidth() || this.x < 0)
        {
            this.xSpeed*=-1;

        }
        if(this.y + this.height > Main.getScreenHeight() || this.y < 0)
        {
            this.ySpeed*=-1;
        }

        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
    }
    public void render(Graphics g)
    {
        g.fillOval(this.x, this.y, this.width, this.height);
    }
}
