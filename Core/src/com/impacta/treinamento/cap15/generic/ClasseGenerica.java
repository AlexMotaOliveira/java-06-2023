package com.impacta.treinamento.cap15.generic;

public class ClasseGenerica<K, V> {

    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K valor) {
        this.key = valor;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ClasseGenerica{" +
                "valor=" + key +
                '}';
    }
}
