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
	public static final int BUBBLEFIELD_ID = 1;
	public static final int STARFIELD_ID = 2;
	public static final int LINEFIELD_ID = 3;
	public static final int DVDFIELD_ID = 4;
    private BasicGameState title;
	private BasicGameState bubbleField;
	private BasicGameState starField;
	private BasicGameState lineField;
    private BasicGameState dvdField;
    
	public Main(String name) 
	{
		super(name);
		title = new TitleState(TITLE_ID);
		bubbleField = new BubbleState(BUBBLEFIELD_ID);
		starField = new StarFieldState(STARFIELD_ID);
		lineField = new LineFieldState(LINEFIELD_ID);
		dvdField = new DVDState(DVDFIELD_ID);

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
		addState(title);
		addState(bubbleField);
		addState(starField);
		addState(lineField);
		addState(dvdField);

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