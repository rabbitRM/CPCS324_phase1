package GraphFramework;

public class Edge implements Comparable<Edge>{
    
    //--------------------------------------------------------------------------------
    //defining the needed data fields 
    public int weight ;
    public Vertex source ;
    public Vertex target ;
   
    //--------------------------------------------------------------------------------
    //defining the constructors
     public Edge(){
    }
    
    public Edge( Vertex source, Vertex target , int weight) {
        this.weight = weight;
        this.source = source;
        this.target = target;
        
    }
    
    //--------------------------------------------------------------------------------
    // defining the setter and getter for data fields
     public Vertex getSource() {
        return source;
    }
    
    public Vertex getTarget() {
        return target;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }
    
      
    // method to 
      public int displayInfo(){
          return weight;
      }
      
      public String toString() {
        return   source + "-->" + target + " weight=" + weight + '}';
    }
       public int compareTo(Edge other) {
        return Integer.compare(weight, other.weight);
    }
}
