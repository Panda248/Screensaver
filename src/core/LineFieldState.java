package core;

import org.lwjgl.opengl.XRandR;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.awt.*;

public class LineFieldState extends BasicGameState
{
    private StateBasedGame sbg;
    private int id;
    private Line[] line;
    private int curLine;
    private int tempCurLine;
    public LineFieldState(int id)
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
        line  = new Line[1000];
        for(int i = 0; i < line.length; i++)
        {
            line[i] = new Line();
        }
        this.sbg = sbg;
        gc.setShowFPS(true);
        curLine = 0;
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
    {
        // This is updates your game's logic every frame.  NO DRAWING.
        curLine++;
        if(curLine > line.length - 1)
        {
            for(Line i: line)
            {
                i.remake();
            }
            curLine = 0;
        }
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
    {
        // This code renders shapes and images every frame.
        g.setBackground(Color.black);
        for(int i = 0; i < curLine; i++)
        {
            line[i].render(g);
        }



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
        StateChange.changeState(key, sbg);
        // This code happens every time the user presses a key
    }

    public void mousePressed(int button, int x, int y)
    {
        // This code happens every time the user presses the mouse
    }




}
