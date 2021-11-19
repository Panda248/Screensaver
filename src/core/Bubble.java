package core;

import org.newdawn.slick.Graphics;

public class Bubble {
    private float x;
    private float y;
    private float size;
    private float maxRightShift;
    private float maxLeftShift;
    private int direction;
    private float speed;

    public Bubble()
    {
        this.y = (float)(Math.random()*Main.getScreenHeight());
        this.x = (float)(Math.random()*Main.getScreenWidth());
        this.size = (float)(Math.random()*100);
        this.maxRightShift = this.x + (float)(Math.random()*100);
        this.maxLeftShift = this.x - (float)(Math.random()*100);
        this.direction = (int)(Math.random());
        this.speed = (float)(Math.random()*3+1);
    }
    public void update()
    {
        if(this.y < 0 - this.size)
        {
            this.y = Main.getScreenHeight();
            this.x = (float)(Math.random()*Main.getScreenWidth());
            this.size = (float)(Math.random()*100);
            this.maxRightShift = this.x + (float)(Math.random()*100);
            this.maxLeftShift = this.x - (float)(Math.random()*100);
            this.direction = (int)(Math.random());
            this.speed = (float)(Math.random()*3+1);
        }
        this.y-=speed;
        if(this.x > this.maxRightShift)
        {
            this.direction = 0;
        }
        else if(this.x < this.maxLeftShift)
        {
            this.direction = 1;
        }
        switch (direction)
        {
            case 1:
                x+=speed;
                break;
            case 0:
                x-=speed;
                break;
        }
    }
    public void render(Graphics gc)
    {
        gc.fillOval(this.x,this.y, this.size, this.size);
    }

}
