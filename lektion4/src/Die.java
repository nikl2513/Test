public class Die
{
    private final int MAX = 6;  //maximum face vaulue er 6
    private int faceValue;      //laver en variabel der hedder faceValue
    //------------------------------------------------------------------
    //constructor: sets the inital face value.
    //------------------------------------------------------------------
    public Die()
    {
        faceValue = 1;
    }
    //------------------------------------------------------------------
    //Rolls the die and returns the result.
    //------------------------------------------------------------------
    public int roll()
    {
        faceValue = (int) (Math.random() * MAX) + 1;

        return faceValue;
    }
    //------------------------------------------------------------------
    //Face value mutator.
    //------------------------------------------------------------------
    public int getFaceValue()
    {
        return faceValue;
    }
    //------------------------------------------------------------------
    //Returns a string representation of this die.
    //------------------------------------------------------------------
    public String toString()
    {
        String result = Integer.toString(faceValue);

        return result;
    }
}
