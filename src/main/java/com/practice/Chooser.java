package com.practice;

import java.util.List;

public class Chooser<T> {
    public T choose( List<T> list ) {
        return Math.random() < 0.5 ? list.get( 0 ) : list.get( 1 );
    }
}
