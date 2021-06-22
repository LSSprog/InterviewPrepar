import java.util.Arrays;

public class MyArrayList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Попытка создания массива вместимостью: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    private boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс " + index + " за пределами Списка");
        }
        return true;
    }

    public int capacity() {
        return list.length;
    }

    private void reCapacity() {
        int newCapacity = size * 2;
        T[] temp = (T[]) new Object[newCapacity];
        temp = Arrays.copyOf(list, newCapacity);
        list = temp;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        if (size >= capacity()) {
            reCapacity();
        }
        list[size] = item;
        size++;
    }

    public void add(int index, T item) {
        if (checkIndex(index)) {
            for (int i = size; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
            size++;
        }
    }

    public T get(int index) {
        if (checkIndex(index)) {
            return list[index];
        } else {
            return null;
        }
    }

    public void set(int index, T item) {
        if (checkIndex(index)) {
            list[index] = item;
        }
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (checkIndex(index)) {
            for (int i = index; i < (size - 1); i++) {
                list[i] = list[i + 1];
            }
            list[size - 1] = null;
            size--;
        }
    }

    public boolean remove(T item) {
        int index = indexOf(item);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]).append(", ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
