public class StackKonversi08 {
    int size;
    int [] tumpukanBiner;
    int top;

    public StackKonversi08() {
        this.size = 32;
        this.tumpukanBiner = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Tumpukan penuh");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Tumpukan kosong");
            return 0;
        }
    }
}
