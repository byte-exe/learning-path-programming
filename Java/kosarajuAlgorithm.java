import java.util.*;
import java.util.LinkedList;



        class Graph {
            private int V;
            private LinkedList<Integer> adj[];

            //Membuat a Graph
            Graph(int s){
                V = s;
                adj = new LinkedList[s];
                for (int i = 0; i<s; ++i)
                adj[i] = new LinkedList();
            }

            //menambahkan edge
            void addEdge(int s, int d) {
                adj[s].add(d);
            }

            //DFS
            void DSFSutil(int s, boolean visitedVerices[]){
                visitedVerices[s] = true;
                System.out.println(s + " ");
                int n;

                Iterator<Integer> i = adj[s].iterator();
                while(i.hasNext()){
                    n = i.next();
                    if (!visitedVerices[n])
                    DSFSutil(n, visitedVerices);
                }
            }

            //Transpose Grafik
            Graph Transpose(){
                Graph g = new Graph(V);
                for (int s = 0; s < V; s++){
                    Iterator<Integer> i = adj[s].listIterator();
                    while (i.hasNext())
                    g.adj[i.next()].add(s);
                }
                return g;
            }

             void fillOrder(int s, boolean visitedVerices[], Stack stack){
                 visitedVerices[s] = true;

                 Iterator<Integer> i = adj[s].iterator();
                 while(i.hasNext()){
                     int n = i.next();
                     if (!visitedVerices[n])
                     fillOrder(n, visitedVerices, stack);
                 }
             }
            
             //menampilkan strongly connected component
             void printSCC(){
                 Stack stack = new Stack();
                 
                 boolean visitedVerices[] = new boolean[V];
                 for (int i = 0; i < V; i++)
                 visitedVerices[i] = false;

                 for(int i = 0; i < V; i++)
                 if(visitedVerices[i] == false)
                 fillOrder(i, visitedVerices, stack);

                 Graph gr = Transpose();

                 for (int i = 0; i < V; i++)
                 visitedVerices[i] = false;

                 while(stack.empty() == false){
                     int s = (int) stack.pop();

                     if(visitedVerices[s] == false){
                         gr.DSFSutil(s, visitedVerices);
                         System.out.println();
                     }
                 }

             }

             public static void main(String[] args) {
                Graph g = new Graph(8);
                g.addEdge(0, 1);
                g.addEdge(1, 2);
                g.addEdge(2, 3);
                g.addEdge(2, 4);
                g.addEdge(3, 0);
                g.addEdge(4, 5);
                g.addEdge(5, 6);
                g.addEdge(6, 4);
                g.addEdge(6, 7);
        
                System.out.println("Jalur yang kuat untuk Menghubungkan :");
                g.printSCC();
             }

        }

    