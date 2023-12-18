package com.ra;

public class GenericService<T> implements Service<T> {
    @Override
    public boolean add(T item) {
        return false;
    }

    @Override
    public boolean edit(T item) {
        return false;
    }

    @Override
    public boolean remove(T item) {
        return false;
    }
}
