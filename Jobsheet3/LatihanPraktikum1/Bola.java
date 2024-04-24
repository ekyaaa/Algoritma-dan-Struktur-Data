public class Bola {
    int r;
    int t;

    public Bola(int r) {
        this.r = r;
    }

    public double hitungLuas() {
        return 4 * 3.14 * r * r;
    }
    public double hitungVolume() {
        return (4/3) * 3.14 * r * r * r;
    }
}
