public class LinkedListOlaf<T> {
    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;

    public int getSize() {
        int counter = 0;

        LinkedListNode current = head;

        while (current != null) {
            counter++;
            current = current.getNext();
        }

        return counter;
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Exception: RemoveFirst from empty list!!!");
        }
        else {
            if (head == tail) {
                head = null;
                tail = null;
            }
            else {
                head = head.getNext();
            }
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Exception: RemoveLast from empty list!!!");
        }
        else {
            if (head == tail) {
                head = null;
                tail = null;
            }
            else {
                LinkedListNode<T> previous = head;
                LinkedListNode<T> current = head.getNext();

                while(current.getNext() != null) {
                    previous = current;
                    current = current.getNext();
                }

                previous.setNext(null);
                tail = previous;
            }
        }
    }

    public void addFirst(T value) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            LinkedListNode<T> oldHead = head;
            head = newNode;
            head.setNext(oldHead);
        }
    }

    public void addLast(T value) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
 
        sb.append("[");

        LinkedListNode current = head;

        if (current != null) {
            sb.append(current);
            current = current.getNext();

            while (current != null) {
                sb.append(", " + current);
                current = current.getNext();
            }
        }

        sb.append("]");

        return sb.toString();
    }
}