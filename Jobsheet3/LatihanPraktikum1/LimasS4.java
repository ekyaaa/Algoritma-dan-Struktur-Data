public class LimasS4 {
    int s;
    int t;

    public LimasS4(int s, int t) {
        this.s = s;
        this.t = t;
    }

    public double hitungLuas() {
        return s * s + 4 * (0.5 * s * t);
    }
    public double hitungVolume() {
        return 1/3 * s * s * t;
    }
}