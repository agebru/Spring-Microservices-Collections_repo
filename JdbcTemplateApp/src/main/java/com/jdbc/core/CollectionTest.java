package com.jdbc.core;

import java.util.List;

public class CollectionTest {
    private int id;
    private List<?> collectionTypes;

    public CollectionTest(int id, List<?> collectionTypes) {
        this.id = id;
        this.collectionTypes = collectionTypes;
    }

    public int getId() {
        return id;
    }

    public List<?> getCollectionTypes() {
        return collectionTypes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCollectionTypes(List<?> collectionTypes) {
        this.collectionTypes = collectionTypes;
    }

    @Override
    public String toString() {
        return "CollectionTest{" +
                "id=" + id +
                ", collectionTypes=" + collectionTypes +
                '}';
    }
}
