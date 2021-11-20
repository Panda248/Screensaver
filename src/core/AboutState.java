package core;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.Locale;

public class AboutState extends BasicGameState {
    private StateBasedGame sbg;
    private int id;
    public AboutState(int id)
    {
        this.id = id;
    }


    public int getID()
    {
        return id;
    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
    {
        // This code happens when you enter a game state for the *first time.*
        gc.setShowFPS(Main.debug);
        this.sbg = sbg;


    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
    {
        // This is updates your game's logic every frame.  NO DRAWING.


    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
    {
        // This code renders shapes and images every frame.
            g.setFont(new TrueTypeFont(Main.mono, false));
            g.scale(.5f,0.5f);
            g.drawString("IN SCREENSAVER, YOU DO BLAH BLAH BLAH...",
                    Main.getScreenWidth(), Main.getScreenHeight()*.33f);
            g.drawString("HIT 1 FOR BUBBLES, 2 FOR STARS,",Main.getScreenWidth(), Main.getScreenHeight()*.66f);
            g.drawString(" 3 FOR LINES, 4 FOR DVD, ", Main.getScreenWidth(), Main.getScreenHeight()*.99f);
            g.drawString("AND ESCAPE TO RETURN TO TITLE.", Main.getScreenWidth(), Main.getScreenHeight()*1.33f);
            g.drawString("HAVE FUN", Main.getScreenWidth(), Main.getScreenHeight()*1.66f);
    }

    public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException
    {
        // This code happens when you enter a gameState.
    }

    public void leave(GameContainer gc, StateBasedGame sbg)
    {
        // This code happens when you leave a gameState.
    }

    public void keyPressed(int key, char c)
    {
        if(key == Input.KEY_A)
        {
            sbg.enterState(Main.TITLE_ID);
        }
        // This code happens every time the user presses a key
    }

    public void mousePressed(int button, int x, int y)
    {
        // This code happens every time the user presses the mouse
    }
}