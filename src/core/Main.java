package core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame 
{
	public final static int FRAMES_PER_SECOND = 60;
	private static AppGameContainer appgc;
	
    public static final int TITLE_ID  = 0;
	public static final int BUBBLE_ID = 1;
	public static final int STARFIELD_ID = 2;
    private BasicGameState title;
	private BasicGameState bubble;
	private BasicGameState starField;
    private BasicGameState game;  
    
	public Main(String name) 
	{
		super(name);
		title = new TitleState(TITLE_ID);
		bubble = new BubbleState(BUBBLE_ID);
		starField = new StarfieldState(STARFIELD_ID);
		game = new StarfieldState(STARFIELD_ID);
	}

	public static int getScreenWidth()
	{
		return appgc.getScreenWidth();
	}
	
	public static int getScreenHeight()
	{
		return appgc.getScreenHeight();
	}
	

	public void initStatesList(GameContainer gc) throws SlickException 
	{
		addState(bubble);
		addState(starField);
		addState(game);
	}

	public static void main(String[] args) 
	{
		try 
		{
			appgc = new AppGameContainer(new Main("ScreenSaver"));
			System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");
		
			appgc.setDisplayMode(appgc.getScreenWidth(), appgc.getScreenHeight(), false);
			appgc.setTargetFrameRate(FRAMES_PER_SECOND);
			appgc.start();
			appgc.setVSync(true);

		} 
		catch (SlickException e) 
		{
			e.printStackTrace();
		}

	}
}