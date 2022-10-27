import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ItemRegistry {
    ArrayList<Item> items;

    public ItemRegistry(ArrayList<Item> items) {
        this.items = items;
    }

    public void trimToSize() {
        items.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
        items.ensureCapacity(minCapacity);
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean contains(Object o) {
        return items.contains(o);
    }

    public int indexOf(Object o) {
        return items.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return items.lastIndexOf(o);
    }

    public Object[] toArray() {
        return items.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return items.toArray(a);
    }

    public Item get(int index) {
        return items.get(index);
    }

    public Item set(int index, Item element) {
        return items.set(index, element);
    }

    public boolean add(Item item) {
        return items.add(item);
    }

    public void add(int index, Item element) {
        items.add(index, element);
    }

    public Item remove(int index) {
        return items.remove(index);
    }

    public boolean remove(Object o) {
        return items.remove(o);
    }

    public void clear() {
        items.clear();
    }

    public boolean addAll(Collection<? extends Item> c) {
        return items.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends Item> c) {
        return items.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return items.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return items.retainAll(c);
    }

    public ListIterator<Item> listIterator(int index) {
        return items.listIterator(index);
    }

    public ListIterator<Item> listIterator() {
        return items.listIterator();
    }

    public Iterator<Item> iterator() {
        return items.iterator();
    }

    public List<Item> subList(int fromIndex, int toIndex) {
        return items.subList(fromIndex, toIndex);
    }

    public void forEach(Consumer<? super Item> action) {
        items.forEach(action);
    }

    public Spliterator<Item> spliterator() {
        return items.spliterator();
    }

    public boolean removeIf(Predicate<? super Item> filter) {
        return items.removeIf(filter);
    }

    public void replaceAll(UnaryOperator<Item> operator) {
        items.replaceAll(operator);
    }

    public void sort(Comparator<? super Item> c) {
        items.sort(c);
    }

    public boolean containsAll(Collection<?> c) {
        return items.containsAll(c);
    }

    public <T> T[] toArray(IntFunction<T[]> generator) {
        return items.toArray(generator);
    }

    public Stream<Item> stream() {
        return items.stream();
    }

    public ItemRegistry() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Stream<Item> parallelStream() {
        return items.parallelStream();
    }
}
