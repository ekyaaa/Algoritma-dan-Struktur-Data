package Tugas;

/**
 * Queue
 */
public class Queue {
    Pembeli []  data;
    int 
        front,
        rear,
        size,
        max;

    public Queue(int max) {
        this.max = max;
        data = new Pembeli[max];
        this.size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + data[front].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + data[rear].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        boolean cek = false;
        for (int i = 0; i < data.length; i++) {
            if (nama.equalsIgnoreCase(data[i].nama)) {
                cek = true;
            }
        }
        int i = front;
        if (cek == true) {
            System.out.print("Terdapat pada antrian : ");
        }
        while (i != rear) {
            i = (i + 1) % max;
            if (nama.equalsIgnoreCase(data[i].nama)) {
                System.out.print(i + "  ");
            }
        }
    }

    public void print () {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHp);
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void clear () {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void Enqueue (Pembeli dt) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Pembeli Dequeue () {
        Pembeli dt = new Pembeli(null, 0);
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            dt = data[front];
            size --;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}