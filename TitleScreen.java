import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Chinechem Ugochukwu
 * @version Decmeber 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 80);
    Label instruction = new Label("press space to start",40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 200);
        
        // added instructions to titleScreen
        addObject(instruction, 300, 300);
    }
    
    /**
     * The main world loop
     */
    public void act()
    {
        //starts the game if the user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
