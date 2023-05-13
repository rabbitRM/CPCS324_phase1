package GraphFramework;
 ;

import java.util.LinkedList;

public class Vertex {
 
    //--------------------------------------------------------------------------------
    //defining the needed data fields 
    public char label ;
    public boolean isVisited ;
    public LinkedList<Edge> adjLists = new LinkedList<>();
    
    
    //--------------------------------------------------------------------------------
    //defining the constructors
    public Vertex(){
    }
 
    public Vertex(char label ){
        this.label = label ;
        isVisited = false ;
        
    }
    
    //--------------------------------------------------------------------------------
    // defining the setter and getter for data fields
    public LinkedList<Edge> getEdges() {
        return adjLists;
    }
 
    public boolean getVisited() {
        return isVisited ; 
    }
 
    public void setLabel(char label) {
        this.label = label;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public void setAdjLists(LinkedList<Edge> adjLists) {
        this.adjLists = adjLists;
    }
    public Vertex(){
        
    }
    
  // defining the method to display the name of the vertex (which office)
    public char displayInfo (){
        return label ;
    }
    
}
