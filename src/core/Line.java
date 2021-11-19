package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Line {
    float x1;
    float x2;
    float y1;
    float y2;
    Color color1;
    Color color2;
    public Line()
    {
        this.x1 = (float) (Math.random() * Main.getScreenWidth());
        this.y1 = (float) (Math.random() * Main.getScreenHeight());
        this.x2 = (float) (Math.random() * Main.getScreenWidth());
        this.y2 = (float) (Math.random() * Main.getScreenHeight());
        this.color1 = new Color((float)(Math.random()),(float)(Math.random()),(float)(Math.random()));
        this.color2 = new Color((float)(Math.random()),(float)(Math.random()),(float)(Math.random()));
    }
    public void render(Graphics g)
    {
        g.drawGradientLine(this.x1, this.y1, this.color1, this.x2, this.y2, this.color2);
    }
    public void remake()
    {
        this.x1 = (float) (Math.random() * Main.getScreenWidth());
        this.y1 = (float) (Math.random() * Main.getScreenHeight());
        this.x2 = (float) (Math.random() * Main.getScreenWidth());
        this.y2 = (float) (Math.random() * Main.getScreenHeight());
        this.color1 = new Color((float)(Math.random()),(float)(Math.random()),(float)(Math.random()));
        this.color2 = new Color((float)(Math.random()),(float)(Math.random()),(float)(Math.random()));
    }

}
