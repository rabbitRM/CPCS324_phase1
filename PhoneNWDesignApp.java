package PhoneNetworkApp;

import GraphFramework.Graph;
import GraphFramework.KruskalAlg;
import GraphFramework.MHPrimAlg;
import java.io.FileNotFoundException;
import GraphFramework.dd;
import GraphFramework.pmh;

public class PhoneNWDesignApp {

    

    public static void main(String[] args) throws FileNotFoundException {

//        MHPrimAlg f = new MHPrimAlg();
      
        KruskalAlg k = new KruskalAlg();
        BluePrintsGraph PhLNetwork = new BluePrintsGraph();
         pmh f2 = new pmh();
        // long variables to store the strating time and ending time 
        //of processing Kruskal and Prim algorithms
        long startTime, endTime;

        // double variable to store differenece of time 
        //in nanoseconed between startTime and endTime variables
        double result;

       PhLNetwork.readGraphFromFile("input.txt");
       k.kruskal(PhLNetwork.vertices);
//       
       f2.primAlgorithm(PhLNetwork.vertices);       

//        
      PhLNetwork.makeGraph(100, 200);
     
//        // computing the starting time for the algorithm
       startTime =  System.currentTimeMillis() ;
//  
//        // calling prim Algorithm        
       f2.primAlgorithm(PhLNetwork.vertices);
//        // computing the ending time for the algorithm
        endTime = System.currentTimeMillis() ;
//
//        // computing the time it took the algorithm to process
       result = (double) (endTime - startTime) ;
//
//        //print a message
       System.out.println("It took me " + result + " ms\n");

        
        // computing the starting time for the algorithm
        startTime = System.currentTimeMillis() ;
        
        // calling Kruskal Algorithm        
        k.kruskal(PhLNetwork.vertices);
        
        // computing the ending time for the algorithm
        endTime = System.currentTimeMillis() ;

        // computing the time it took the algorithm to process
        result = (double) (endTime - startTime) ;

        //print a message
        System.out.println("It took me " + result + " ms\n");
    }

}
