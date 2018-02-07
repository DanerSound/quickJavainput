package base;

/**
 *
 * @author Andre Cristhian Barreto Donayre
 */
public class Primitivetypes {
    
    int n1,n2;
    float n3;
    
    public int sum(){
        return n1+n2;
    }
    
    public float multFloat(){
        return n3*2;
    } 
    
    public void readedString(){    
        System.out.println("inserisci qualcosa");
        System.out.println(" quello che hai inserito è" + IO.lineIn());
    }
    
    
}
