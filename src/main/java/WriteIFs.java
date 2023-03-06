package src.java;

/**
 * Write a description of class src.main.java.WriteIFs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteIFs
{
 
    public void playerDied(boolean player1) {

        if (!isAlive(player1)) {
            displayGameOver(player1);
        }
        // Write an IF statement that checks “player1.isAlive()”
        // and if that’s false, calls “displayGameOver(player1)”

    }
    
    public String thermoSTAT(int room) {
        if (tempurature(room)<70) {
            heatOn();
        }
        else {
            coolOn();
        }
        // Write an IF statement that checks the 
        // “temperature(room)” and if that check is less than 70, 
        // calls “heatOn()” else calls “coolOn()”


        
        return this.ss;
    }

    public void fireplaceControl(Object fireplace1) {
        if ((outsideTemp()<50) && (insideTemp()<62)) {
            startAFire(fireplace1);
        }
        // Write an IF statement that checks 
        // “outsideTemp()” is less than 50 
        // AND 
        // “insideTemp()” is less than 62, 
        // calls “startAFire(fireplace1)”

    }

    public void checkFuel(double fuelLevel) {
        if (fuelLevel<0.08) {
            refuel();
        }
        // Write an IF statement that checks “fuelLevel” 
        // and if that check is less than 0.08, calls “refuel()”

    }


    
    /**
     *  Pay no attention to the code below this point.
     *
     * 
     * instance variables
     */
    public int x;
    public int tt_t;
    public int tt_s;
    public int oo1, oo2;
    public String ss;


  /**
   * Constructor for objects of class src.main.java.WriteIFs
   */
  public WriteIFs()
  {
      // initialise instance variables
      x = 0;
      tt_t = 0;
      tt_s = 1;
      ss = "";
      oo1 = 61;
      oo2 = 49;
  }

    // associated routines
    public boolean isAlive(boolean p) {
        return !p;
    }
    private int tempurature(int t) {
        return t+2;
    }
    private void heatOn() {
        this.ss = "heating";
    }
    private void coolOn() {
        this.ss = "cooling";
    }
 
    private int insideTemp() {
        return oo1;
    }
    private int outsideTemp() {
        return oo2;
    }
    private void startAFire(Object o) {
        this.tt_s = 213;
    }
    private void refuel() {
        this.x = 99;
    }
    private void displayGameOver(boolean b) {
        this.ss = "Game Over!";
    }
}
