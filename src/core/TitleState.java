package core;

import org.lwjgl.opengl.XRandR;
import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.awt.*;

public class TitleState extends BasicGameState
{
	private StateBasedGame sbg;
	private int id;

	public TitleState(int id)
	{
		this.id = id;
	}
	private Button about;
	private Button exit;
	
	public int getID() 
	{
		return id;		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a game state for the *first time.*
		gc.setShowFPS(Main.debug);
		this.sbg = sbg;
		about = new Button(Main.getScreenWidth()/2 + 10, Main.getScreenHeight()/2, 300, 50, "About");
		exit = new Button(Main.getScreenWidth()/2 + 10, Main.getScreenHeight()/2 + 60, 150, 50, "Exit");

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{	
		// This is updates your game's logic every frame.  NO DRAWING.
		exit.hover(gc.getInput().getMouseX(), gc.getInput().getMouseY());
		about.hover(gc.getInput().getMouseX(), gc.getInput().getMouseY());

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// This code renders shapes and images every frame.\
		g.setBackground(Color.black);
		about.render(g);
		exit.render(g);
		g.drawLine(Main.getScreenWidth()/2, Main.getScreenHeight()/4, Main.getScreenWidth()/2, Main.getScreenHeight()*.75f);
		g.setFont(new TrueTypeFont(Main.mono, false));
		g.drawString("SCREENSAVER", Main.getScreenWidth()/2 + 10, Main.getScreenHeight()*.4f);

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
		if(exit.clicked(x, y))
		{
			System.exit(0);
		}
		else if(about.clicked(x, y))
		{
			sbg.enterState(Main.ABOUT_ID);
		}
		// This code happens every time the user presses the mouse
	}
	


}
