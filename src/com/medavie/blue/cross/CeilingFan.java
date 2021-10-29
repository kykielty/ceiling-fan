package com.medavie.blue.cross;

/**
 * A ceiling fan where the user can control speed and direction.
 * Author: Kyla Kieltyka
 * Date: October 24th, 2021
 */
public class CeilingFan {


    public static final boolean DIRECTION_CLOCKWISE = true;
    public static final boolean DIRECTION_COUNTERCLOCKWISE = false;
    public static final String DIRECTION_CLOCKWISE_TEXT = "Clockwise";
    public static final String DIRECTION_COUNTERCLOCKWISE_TEXT = "Counterclockwise";
    public static final int STARTING_SPEED = 0;
    public static final boolean STARTING_DIRECTION = DIRECTION_CLOCKWISE;
    private int speed;
    private boolean isDirectionClockwise;

    /**
     * Initializes the speed and direction for the fan.
     */
    public CeilingFan(){
        this.speed = this.STARTING_SPEED;
        this.isDirectionClockwise = this.STARTING_DIRECTION;
    }

    /**
     * Increases the speed. If the current speed is 3, then it returns to 0 or "off".
     */
    public void pullSpeedCord(){
        if(this.speed == 3)
            this.speed = 0;
        else
            this.speed++;
    }

    /**
     * Changes the direction of the fan.
     * If the fan is clockwise then it will change to counterclockwise.
     * If the fan is counterclockwise, then it will change to clockwise.
     */
    public void pullDirectionCord(){
        this.isDirectionClockwise = !isDirectionClockwise;
    }

    /**
     * Gets the current speed of the fan.
     * @return int speed: the current speed.
     */
    public int getSpeed(){
        return this.speed;
    }

    /**
     * Gets the current direction of the fan.
     * Returns true if clockwise and false if counterclockwise.
     * @return boolean isDirectionClockwise: the current direction.
     */
    public boolean isDirectionClockwise(){
        return this.isDirectionClockwise;
    }

    /**
     * Gets the appropriate text for the direction the fan is turning.
     * @return String Clockwise or Counterclockwise
     */
    public String getDirectionText(){
        if(this.isDirectionClockwise == DIRECTION_CLOCKWISE)
            return DIRECTION_CLOCKWISE_TEXT;
        else {
            return DIRECTION_COUNTERCLOCKWISE_TEXT;
        }
    }
}
