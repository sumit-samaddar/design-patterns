/**
 * @author sumit
 */

package com.design.patterns.behavioral.iterator;

interface Iterator<T> {
    boolean hasNext();

    T next();
}