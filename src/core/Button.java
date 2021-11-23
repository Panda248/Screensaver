package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Button {
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private boolean hover;
    public Button(float x, float y, float width, float height, String text)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        this.hover = false;
    }

    public boolean clicked(int x, int y)
    {
        return(this.x < x && this.x + this.width > x) &&(this.y < y && this.y + this.height > y);
    }
    public void hover(float x, float y)
    {
        if((this.x < x && this.x + this.width > x) &&(this.y < y && this.y + this.height > y))
        {
            hover = true;
        }
        else
        {
            hover = false;
        }
    }

    public void render(Graphics g)
    {
        if(hover)
        {
            g.setColor(Color.white);
            g.fillRect(x,y,width,height);
            g.setColor(Color.black);
            g.drawString(text, x + 10, y + height/3);
            g.setColor(Color.white);
        }
        else
        {
            g.drawRect(x, y, width, height);
            g.drawString(text, x + 10, y + height / 3);
        }
    }
}
