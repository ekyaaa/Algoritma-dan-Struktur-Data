public class SingleLinkedList {
    Node head, tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
        size++;
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    void insertAfter(int prev, int input) {
        Node tmp = head;
        while (tmp != null && tmp.data != prev) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            Node ndInput = new Node(input, tmp.next);
            tmp.next = ndInput;
            if (tmp == tail) {
                tail = ndInput;
            }
            size++;
        } else {
            System.out.println("Node with value " + prev + " not found.");
        }
    }

    void insertAt(int index, int input) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            addFirst(input);
        } else {
            Node tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            Node ndInput = new Node(input, tmp.next);
            tmp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
            size++;
        }
    }

    int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == key) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
        size--;
    }

    public void remove(int value) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == value) {
                    break;
                }
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Data tidak ditemukan");
            } else if (temp == head) {
                removeFirst();
            } else if (temp == tail) {
                removeLast();
            } else {
                Node current = head;
                while (current.next != temp) {
                    current = current.next;
                }
                current.next = temp.next;
                size--;
            }
        }
    }

    void removeAt(int Key) {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong");
        } else if (Key < 0 || Key >= size) {
            System.out.println("Index out of bounds");
        } else if (Key == 0) {
            removeFirst();
        } else if (Key == size - 1) {
            removeLast();
        } else {
            Node tmp = head;
            for (int i = 0; i < Key - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            size--;
        }
    }
}