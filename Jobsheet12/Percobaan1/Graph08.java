package Percobaan1;
public class Graph08 {
    int vertex;
    DoubleLinkedList list[];

    public Graph08(int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree (int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int l = 0; l < list[i].size(); l++) {
                if (list[i].get(l) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        if (asal < 0 || asal >= vertex || tujuan < 0 || tujuan >= vertex) {
            throw new Exception("Invalid vertex index");
        }
        
        DoubleLinkedList adjList = list[asal];
        for (int i = 0; i < adjList.size(); i++) {
            if (adjList.get(i) == tujuan) {
                adjList.remove(i);
                break;
            }
        }
    }

    public String checkEdge(int asal, int tujuan) throws Exception {
        if (list[asal].contains(tujuan)) {
            return "Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " Bertetangga";
        } else {
            return "Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " Tidak Bertetangga";
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("System berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                    System.out.println("");
                }
            }   
        }
        System.out.println("");
    }
}