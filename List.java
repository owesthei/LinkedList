public interface List<T> {
    public void addFirst(T value);
    public void addLast(T value);
    public void remove(T data);
    public void removeFirst();
    public void removeLast();
    public void traverse();
    public int size();
    public boolean isEmpty();
}