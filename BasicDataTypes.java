

/**
 * Write a description of class BasicDataTypes here.
 *
 * @author Peter
 * @version 14/02/23
 * Happy Valentines <3
 */
public class BasicDataTypes
{
    // instance variables - replace the example below with your own
    private int Int = 5;
    private short Short = 32322;
    private long Long = 3258842154l;
    private byte Byte = 4;
    private float Float = 4.765f;
    private double Double = 5;
    private char Character = 'o';
    private boolean Boolean = true;
    /**
     * Constructor for objects of class BasicDataTypes
     */
    public BasicDataTypes()
    {
       System.out.println(Int+" int");
       System.out.println(Short+" short");
       System.out.println(Long+" Long");
       System.out.println(Byte+" Byte");
       System.out.println(Float+" Float");
       System.out.println(Double+" Double");
       System.out.println(Character+" Character");
       System.out.println(Boolean+" Boolean");
       // initialise instance variables
       Int = Int + 5;
       //Short = Short + 5;
       //Incompatible tyes: possible lossy convention from int to short
       Long = Long + 5;
       //Byte = Byte + 100;
       //Incompatible tyes: possible lossy convention from int to byte
       //Float = Float +0.32;
       //Incompatible tyes: possible lossy convention from float to double
       //Character = Character + 5;
       //Incompatible tyes: possible lossy convention from int to char
       Long ++;
       Int ++;
       Short ++;
       Byte ++;
       Float ++;
       Double ++;
       Int *= 3;
       Double = Double + 0.3;
       //doubles can add decimals
       //Float = Float + 0.3;
       //Floats have an error when adding decimals, java maybe prefers doubles 
       //when using decimals
       Boolean = false;
       System.out.println(Int+" int");
       System.out.println(Short+" short");
       System.out.println(Long+" Long");
       System.out.println(Byte+" Byte");
       System.out.println(Float+" Float");
       System.out.println(Double+" Double");
       System.out.println(Character+" Character");
       System.out.println(Boolean+" Boolean");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
