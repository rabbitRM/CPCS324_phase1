package GraphFramework;
 ;

import java.util.LinkedList;

public class Vertex {
    
    public char label ;
    public int id ;
    public boolean isVisited ;
    public Vertex parent ;
    int key ;
    
    public LinkedList<Edge> adjLists = new LinkedList<>();
    
    public Vertex(char label ){
        this.label = label ;
        isVisited = false ;
        
    }
    public Vertex(){
        
    }
    
     public char getLabel() {
        return label;
    }
    
    public LinkedList<Edge> getEdges() {
        return adjLists;
    }
    
    public char displayInfo (){
        return label ;
    }
    
    public String toString() {
        return "Vertex{" + "label=" + label + '}';
    }
}
