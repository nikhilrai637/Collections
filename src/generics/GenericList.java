package generics;


import java.util.Iterator;

public class GenericList <T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10]; //Typecasting into array of T's but can't instantiate directly
    private int count;

    public void add(T item){
        items[count++] = item;
    }
    public T get  (int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }

    private class ListIterator<T> implements Iterator<T> {

        private GenericList<T> list = new GenericList<>();
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index< list.count);
        }

        @Override
        public T next() {
              return list.get(index++);
        }
    }
}
