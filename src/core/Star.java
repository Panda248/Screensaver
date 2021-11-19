package core;

import org.newdawn.slick.Graphics;

public class Star {
    private float x;
    private float y;
    private int size;

    Star()
    {
        x = (float) (Math.random() * Main.getScreenWidth());
        y = (float) (Math.random() * Main.getScreenHeight());
        size = (int) (Math.random()*3 + 1);

    }
    public void update()
    {

        y+=(float)(Math.random()*2);
        if(y > Main.getScreenHeight())
        {
            x = (float) (Math.random() * Main.getScreenWidth());
            y = 0;
            size = (int) (Math.random()*3 + 1);
        }
    }
    public void render(Graphics g)
    {
        g.drawOval(x,y,size,size);
    }
}
