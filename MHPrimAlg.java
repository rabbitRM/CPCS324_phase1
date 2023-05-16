package GraphFramework;

import java.util.*;





public class primj extends MSTAlgorithm{
    
    class ResultSet {

    
    int parent;

  
    int weight;
}

    //---------------------------Prim's Algorithm using Minheap---------------------

    /**
     *Prim's Algorithm using Minheap
     */
   /**
 * print MST
 * @param MST the list of edges of the minimum spanning tree
 */
    

    public void primMinHeap(ArrayList<Vertex> vertices) {
       
        boolean[] Heap = new boolean[vertices.size()];

        
        //keys[] used to check if min heap update is required
        int[] key = new int[vertices.size()];
        //create heapNode for all the vertices
        heapNode[] heapNodes = new heapNode[vertices.size()];
        for (int i = 0; i < vertices.size(); i++) {
            heapNodes[i] = new heapNode();
            heapNodes[i].node = i;
            heapNodes[i].key = Integer.MAX_VALUE;
            Heap[i] = true;
            key[i] = Integer.MAX_VALUE;
        }

        //decrease the key for the first index
        heapNodes[0].key = 0;

        //add all the vertices to the MinHeap
        MinHeap minHeap = new MinHeap(vertices.size());
        //add all the vertices to priority queue
        for (int i = 0; i < vertices.size(); i++) {
            minHeap.insert(heapNodes[i]);
        }

        do {
            //extract the min
            heapNode extractedNode = minHeap.extractMin();

            //extracted vertex
            int extractedVertex = extractedNode.node;
            Heap[extractedVertex] = false;

            //iterate through all the adjacent vertices
            LinkedList<Edge> list = findVertexLabel(vertices, extractedVertex).adjLists;
            for (int i = 0; i < list.size(); i++) {
                Edge edge = list.get(i);

                //only if edge destination is present in heap
                if (Heap[edge.target.label]) {

                    int destination = edge.target.label;
                    int newKey = edge.getWeight();
                    //check if updated key < existing key, if yes, update if
                    if (key[destination] > newKey) {

                        toDecreaseKey(minHeap, newKey, destination);
                        //update the parent node for destination

                        key[destination] = newKey;
                        Edge newMSTEdge = new Edge(findVertexLabel(vertices, extractedVertex), findVertexLabel(vertices, destination), newKey);
                        MSTResultList.add(newMSTEdge);
                    }

                }
            }
        } while (!minHeap.isEmpty());
       
       displayResultingMST(MSTResultList);
//printMST(resultSet, vertices);
    }
    
   
    /**
     * print MST
     * @param resultSet the result set of vertices and edges of the minimum spanning tree
     */
    private void printMST(ResultSet[] resultSet ,ArrayList<Vertex> vertices ) {
        int totalWeight = 0, i = 0;
   
            System.out.println("Minimum Spanning Tree: ");

        while (i < resultSet.length) {
            totalWeight += resultSet[i++].weight;
       
                System.out.println("Edge: " + i + " - " + resultSet[i].parent
                        + " weight: " + resultSet[i].weight);
 }
        System.out.println("Minimum Spanning Tree cost: " + totalWeight);
    }


//------------------------------------------------------------------------------

    /**
     * toDecreaseKey method used by prim's min-heap method 
     * @param mH the min-heap object 
     * @param newKey the new node key 
     * @param vertex vertex of the node
     */
    private void toDecreaseKey(MinHeap mH, int newKey, int vertex) {

        //get the index which key's needs a decrease;
        int index = mH.decreaseKey[vertex];

        //get the node and update its value
        heapNode node = mH.minHeap[index];
        node.key = newKey;
        mH.bubbleUp(index);
    }
    
    public Vertex findVertexLabel(ArrayList<Vertex> vertices , int label){
        for (int i = 0; i < vertices.size(); i++) {
            if (label == vertices.get(i).label)
                return vertices.get(i);
        }
        return null ;
    }

 public void displayResultingMST( ArrayList<Edge> MSTResultList) {
        
        // variable to store the cost of MSTResultList
        int totalCost = 0 ;
        
        System.out.println("The phone network (minimum spanning tree) generated by min-heap based Prim algorithm"
                + "is as follows:\n");

        // loop to go throuh the list that save the resulting edges 
        for (int i = 0; i < MSTResultList.size(); i++) {
            
            System.out.println("Office No." + MSTResultList.get(i).source.displayInfo() + " - Office No. " + MSTResultList.get(i).target.displayInfo()
                    + " : line length: " + MSTResultList.get(i).displayInfo());
            totalCost+=MSTResultList.get(i).displayInfo();
        }
        
        System.out.println("Total cost: " + totalCost + "\n");

    }
}

