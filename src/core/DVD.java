package core;

import org.newdawn.slick.Graphics;

public class DVD {
    float x;
    float y;
    float height;
    float width;
    float xSpeed;
    float ySpeed;
    boolean collided;

    public DVD()
    {
        this.width = 300f;
        this.height = 200f;
        this.x = (float)(Math.random()*(Main.getScreenWidth()-this.width));
        this.y = (float)(Math.random()*(Main.getScreenHeight()-this.height));
        this.xSpeed = 5;
        this.ySpeed = 5;
        collided = false;
    }
    public void update()
    {
        if(this.x + this.width > Main.getScreenWidth() || this.x < 0)
        {
            this.xSpeed*=-1;
        }
        else if(this.y + this.height > Main.getScreenHeight() || this.y < 0)
        {
            this.ySpeed*=-1;
        }
        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
    }
    public void render(Graphics g)
    {
        g.fillOval(100, 100, this.width, this.height);
    }
}
