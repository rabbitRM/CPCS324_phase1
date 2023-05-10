package GraphFramework;

public class Edge implements Comparable<Edge>{
    public int weight ;
    public Vertex source ;
    public Vertex target ;
    public int nodeId;
    
//    public Vertex parent ;
    
    public Edge( Vertex source, Vertex target , int weight) {
        this.weight = weight;
        this.source = source;
        this.target = target;
        
    }
    public Edge(){
        
    }
     public Vertex getSource() {
        return source;
    }
    
    public Vertex getTarget() {
        return target;
    }
    
    public int getWeight() {
        return weight;
    }
    
      
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
