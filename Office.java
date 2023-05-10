
package PhoneNetworkApp;
import GraphFramework.Vertex;


public class Office extends Vertex{
    
    
    public Office (char lable ){
       super( lable );
    }
    
    //********
    public static Office createVertex(char lable ){
        return new Office(lable);
    }
    
    
    //*********
    public String setLabel (int num ){
        return "O"+num ;
    }
    
    public char displayInfo(){
        return label ;
    }
    
    
}
