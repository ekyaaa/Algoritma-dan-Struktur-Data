package Percobaan2;

public class GraphMatrix08 {
    int vertex;
    int [][] matrix;

    public GraphMatrix08(int v) {
        vertex = v;
        matrix = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matrix[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matrix[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matrix[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    public int getIndegree(int asal) {
        int totalIndegree = 0;
        for (int i = 0; i < vertex; i++) {
            if(matrix[i][asal] != -1){
                totalIndegree += matrix[i][asal];
            }
        }
        return totalIndegree;
    }

    public int getOutdegree(int asal) {
        int totalOutdegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[asal][i] != -1) {
                totalOutdegree += matrix[asal][i];
            }
            }
        return totalOutdegree;
    }

    public String hitungDegree(int asal) {
        String hasil =  "Total Degree dari Gedung " + (char) ('A' + asal) + ": " + (getIndegree(asal) + getOutdegree(asal)) + "\n";
        return hasil;
    }
}