package minggu5;

public class faktorial {
    public int nilai;
    int faktorialBF(int n) {
        int fakto = 1;

        int i = 1;
        while (i<=n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }
        // return fakto;
    int faktorialDC(int n) {
        int fakto = 0;
        if (n==0) {
            return 1;
        } else {
            fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}