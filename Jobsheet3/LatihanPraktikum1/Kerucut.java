public class Kerucut {
    int r;
    int s;

    public Kerucut(int r, int s) {
        this.r = r;
        this.s = s;
    }

    double t = Math.sqrt(Math.pow(s, 2) - Math.pow(r, 2));

    public double hitungLuas() {
        return (3.14 * r * s) + (3.14 * s * s);
    }
    public double hitungVolume() {
        return 1/3 * 3.14 * r * r * t;
    }
}