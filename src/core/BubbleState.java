package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.Arrays;

public class BubbleState extends BasicGameState
{

	private int id;
	private StateBasedGame sbg;
	private Bubble[] bubble;
	public BubbleState(int id)
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
		gc.setShowFPS(Main.debug);
		bubble = new Bubble[100];
		for(int i = 0; i < bubble.length; i++)
		{
			bubble[i] = new Bubble();
		}


	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		// This is updates your game's logic every frame.  NO DRAWING.
		for(Bubble i: bubble)
		{
			i.update();
		}

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		g.setBackground(Color.blue);
		// This code renders shapes and images every frame.
		for(Bubble i: bubble)
		{
			i.render(g);
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
		// This code happens every time the user presses a key
		StateChange.changeState(key, sbg);
	}
	
	public void mousePressed(int button, int x, int y)
	{
		// This code happens every time the user presses the mouse
	}
	
	


}
