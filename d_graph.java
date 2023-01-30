import java.util.*;  
class Edge   
{        
int s, d;   
Edge(int s, int d)   
{  
this.s = s;  
this.d = d;  
}  
}   
class Graph  
{    
List<List<Integer>> adjlist = new ArrayList<>();  
public Graph(List<Edge> edges)  
{  
int n = 0;    
for (Edge e: edges)   
{      
n = Integer.max(n, Integer.max(e.s, e.d));  
}  
for (int i = 0; i <= n; i++)   
{  
adjlist.add(i, new ArrayList<>());  
}  
for (Edge current: edges)  
{    
adjlist.get(current.s).add(current.d);  
}  
}  
public static void showGraph(Graph graph)  
{  
int s = 0;   
int n = graph.adjlist.size();  
while (s < n)  
{  
for (int d: graph.adjlist.get(s))   
{  
System.out.print("Adjacency List for the graph is:");          
System.out.print("(" + s + " -- > " + d + ")\t");  
}  
System.out.println();   
s++;  
}  
}  
}   
public class d_graph
{  
public static void main (String args[])  
{  
List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2), new Edge(2, 4), new Edge(4, 1),new Edge(3, 2), new Edge(2, 5), new Edge(3, 4), new Edge(5, 4), new Edge(1, 1));  
Graph graph = new Graph(edges);   
Graph.showGraph(graph);  
}  
}  
