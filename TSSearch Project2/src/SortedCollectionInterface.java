public interface SortedCollectionInterface<T extends Comparable<T>>{

    public boolean insert(T data) throws NullPointerException, IllegalArgumentException;

    public boolean removeNode(T data) throws NullPointerException, IllegalArgumentException;

    public boolean contains(T data);

    public int size();

    public boolean isEmpty();

}
