
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MinimumSpanningTree {

	public static void main(String args[]) throws FileNotFoundException {

		Graph testGraph = new Graph();
//    	File inputFile = new File("E:\\softwares\\softwares_installation\\eclipse\\workSpace\\TreesAndGraphs\\src\\input.txt");
    	File inputFile = new File(args[0]);
        long startTime = System.currentTimeMillis();
    	Scanner sc = new Scanner(inputFile);
    	
        String[] firstLine = sc.nextLine().split("\\s");
    	String isDirected = firstLine[2];
        if(isDirected.equals("D")) {
    		System.out.println("For directed graph, cannpt find MST for directed graph.");
    		System.exit(0);
    	}
        
    	while(sc.hasNextLine()) {
    		String[] eachLine = sc.nextLine().split("\\s");
    		if(eachLine.length == 3)
    			testGraph.addEdge(eachLine[0], eachLine[1], Integer.parseInt(eachLine[2]));
    	}

    	// Print MSTEdges, the list that has all the edges and lastly, total // cost of minimum spanning tree
    	for (Edge edge: testGraph.kruskalMST()) {
    	    System.out.println(edge.src + " to " + edge.dest + " -> " + edge.cost);
    	}
    	System.out.println(testGraph.getTotalCost());
        System.out.println("Program execution time : "+(System.currentTimeMillis()-startTime)+" milliseconds");
    }
    
}