package minggu5;

public class sum {
    int elemen;
    double keuntungan[], total;

    sum (int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        } else if (left < right) {
            int mid = (int)((left + right) / 2); 
            double lsum = totalDC(arr, left, mid);
            double rsum = totalDC(arr, mid + 1, right); 
            return lsum + rsum; 
        } 
        return 0;
    }
}
