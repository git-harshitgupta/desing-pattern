package org.harshit.structural.bridge;

public interface FifoCollection<T> {

    void offer(T element);
    T poll();

}
