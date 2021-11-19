package core;

import org.newdawn.slick.Graphics;

public class Bubble {
    private float x;
    private float y;
    private float size;

    public Bubble()
    {
        this.y = Main.getScreenHeight();
        this.x = (float)(Math.random()*Main.getScreenWidth());
        this.size = (float)(Math.random()*100);
    }
    public void update()
    {

    }
    public void render(Graphics gc)
    {

    }

}
