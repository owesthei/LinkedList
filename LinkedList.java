public class LinkedList<T extends Comparable<T>> implements List<T> {
    private Node<T> head;
    private Node<T> tail;

    @Override
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    @Override
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);

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

    @Override
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
                Node<T> previous = head;
                Node<T> current = head.getNext();

                while(current.getNext() != null) {
                    previous = current;
                    current = current.getNext();
                }

                previous.setNext(null);
                tail = previous;
            }
        }
    }

    @Override
    public void remove(T data) {
        if (head == null) {
            System.out.println("Exception: Remove from empty list!!!");
        }
        else {
            if (head == tail) {
                if (head.getData().compareTo(data) == 0) {
                    head = null;
                    tail = null;
                }
            }
            else {
                if (head.getData().compareTo(data) == 0) {
                    head = head.getNext();
                }
                else {
                    Node<T> previous = head;
                    Node<T> current = head.getNext();
        
                    while (current != null && current.getData().compareTo(data) != 0) {
                        previous = current;
                        current = current.getNext();
                    }

                    if (current != null) {
                        if (current == tail) {
                            tail = previous;
                        }

                        previous.setNext(current.getNext());
                    }
                }
            }
        }
    }

    @Override
    public void traverse() {
        System.out.println(this);
    }

    @Override
    public int size() {
        int counter = 0;

        Node current = head;

        while (current != null) {
            counter++;
            current = current.getNext();
        }

        return counter;
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;

        if (current != null) {
            sb.append(current);
            current = current.getNext();

            while (current != null) {
                sb.append(String.format(", %s", current));
                current = current.getNext();
            }
        }

        sb.append("]");

        return sb.toString();
    }
}