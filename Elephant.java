import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Chinechem Ugochukwu 
 * @version December 2022
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/idle0.png");
    
    /**
     * Constructor - The code that gets run the first time this object is create
     */
    public Elephant()
    {
        setImage(idle);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        // remove apple if elephant "eats it"
        eat(); 
    }
    
    /** 
     * Eat the apple and spawn new apple if an apple is eaten.
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
