package Com.CodeGym.DSA_DanhSach.BaiTap.ss1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 5;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements =  new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
}
    public void ensureCapaciyy(int minCapacity) {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
public void add(int index, E element) {
        if(index <0 || index > size) {
            throw new IndexOutOfBoundsException("error");
        } else if(size == elements.length) {
            ensureCapaciyy(5);
        } else {
            for (int i = index; i < size;i++) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
}
public E remove(int index) {
        if(index > size) {
            throw new IndexOutOfBoundsException("Error");
        } else {
            E element = (E) elements;
            for (int i = index; i < size -1;i++){
                elements[i] = elements[i+1];
            }
            elements[size -1] = null;
            return element;
        }
}
public int indexOf(E element) {
    int index = -1;
    for (int i =0; i < size;i++) {
        if (elements[i].equals(element)) {
            return index = 1;
        }
    } return index;
}
public E get(int index) {
        return (E) elements[index];
}
public int size() {
        return this.size;
}
}
