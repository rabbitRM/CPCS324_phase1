package GraphFramework;
 ;

import java.util.LinkedList;

public class Vertex {
    
    public char label ;
    public boolean isVisited ;
    public LinkedList<Edge> adjLists = new LinkedList<>();
    
    public Vertex(char label ){
        this.label = label ;
        isVisited = false ;
        
    }
    public Vertex(){
        
    }
    
    public LinkedList<Edge> getEdges() {
        return adjLists;
    }
    
    public char displayInfo (){
        return label ;
    }
    
}
