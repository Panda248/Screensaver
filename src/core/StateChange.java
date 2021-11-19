package core;

import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class StateChange {
    public static void changeState(int key, StateBasedGame sbg)
    {
        switch(key)
        {
            case Input.KEY_1:
                sbg.enterState(Main.BUBBLEFIELD_ID);
                break;
            case Input.KEY_2:
                sbg.enterState(Main.STARFIELD_ID);
                break;
            case Input.KEY_3:
                sbg.enterState(Main.LINEFIELD_ID);
                break;
            case Input.KEY_4:
                sbg.enterState(Main.DVDFIELD_ID);
                break;
            case Input.KEY_ESCAPE:
                sbg.enterState(Main.TITLE_ID);
                break;
        }
    }
}
