package base;

/**
 *
 * @author Andre Cristhian Barreto Donayre
 */
public class Primitivetypes {
    
    int number1,number2;
    float floatNumber;
    
    public int sum(){
        return number1+number2;
    }
    
    public float multFloat(){
        return floatNumber*2;
    } 
    
    public void readedString(){    
        System.out.println(" Write Something... ");
        System.out.println(" you wrote ... " + IO.lineIn());
    }
    
    
}
