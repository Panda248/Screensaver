package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class DVDState extends BasicGameState
{
    private StateBasedGame sbg;
    private int id;
    private DVD dvd;
    public DVDState(int id)
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
        this.sbg = sbg;
        dvd = new DVD();

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
    {
        // This is updates your game's logic every frame.  NO DRAWING.
        dvd.update();
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
    {
        // This code renders shapes and images every frame.
        g.setBackground(Color.black);
        dvd.render(g);
        g.setColor(Color.white);
    }

    public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException
    {
        // This code happens when you enter a gameState.
        dvd = new DVD();
    }

    public void leave(GameContainer gc, StateBasedGame sbg)
    {
        // This code happens when you leave a gameState.
    }

    public void keyPressed(int key, char c)
    {
        StateChange.changeState(key, sbg);
        // This code happens every time the user presses a key
    }

    public void mousePressed(int button, int x, int y)
    {
        // This code happens every time the user presses the mouse
    }




}
