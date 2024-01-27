import java.util.Arrays;

public class DynamicArray<E> extends AbstractListADT<E>
        implements ListADT<E> {

    private E[] array;
    private int capacity;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        array = (E[]) new Object[10];
        capacity = 10;
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int initialCapacity) {
        array = (E[]) new Object[initialCapacity];
        capacity = initialCapacity;
        size = 0;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }
    }

    /**
     * Appends the specified element to the end of this list
     *
     * @param data
     * @return boolean
     */
    @Override
    public boolean add(E data) {
        //ensureCapacity();
        if (size < capacity) {
            array[size++] = data;
            return true;
        }
        return false;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements by adding one to their indices.
     *
     * @param index - index at which the specified element is to be inserted
     * @param data - element to be inserted
     * @return boolean
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index
     * > size())
     */
    @Override
    public boolean add(int index, E data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = data;
        size++;
        return true;
    }

    /**
     * Removes all of the elements from this list
     */
    @Override
    public void clear() {
        size = 0;
    }

    /**
     * Returns true if this list contains the specified element
     *
     * @param data
     * @return boolean
     */
    @Override
    public boolean contains(E data) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the element at the specified position in this list
     *
     * @param index
     * @return E
     */
    @Override
    public E get(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            return array[index];
        }
    }

    /**
     * Returns the index of the first occurrence of the specified element in
     * this list Return, or -1 if this list does not contain the element
     *
     * @param data
     * @return int
     */
    @Override
    public int indexOf(E data) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Returns the index of the last matching of the element in this list Return
     * -1 if no match
     *
     * @param data
     * @return int
     */
    @Override
    public int lastIndexOf(E data) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Returns true if this list contains no elements
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Removes the element at the specified position in this list. Shifts any
     * subsequent elements by subtracting one from their indices.
     *
     * @param index - index of the element to be removed
     * @return E - the element that was removed from the list
     * IndexOutOfBoundsException - if the index is out of range (index < 0 || index
     * >= size())
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        E removed = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removed;
    }

    /**
     * Trims the capacity of this ArrayList instance to be the list's current
     * size. An application can use this operation to minimize the storage of an
     * ArrayList instance.
     */
    @Override
    public void trimToSize() {
        capacity = size;
    }

    /**
     * Returns the number of elements in this list
     *
     * @return int
     */
    @Override
    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getIdentificationString() {
        return "Program 6, FullNameHere";
    }

    public String toString() {
        String s = "";
        s += "[";
        int i = 0;
        for (i = 0; i < size() - 1; i++) {
            s += array[i] + ", ";
        }
        s += array[i] + "]";
        return s;
    }
}
