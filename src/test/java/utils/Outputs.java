package utils;

import java.util.Arrays;
import java.util.Objects;

public class Outputs<T,V> {

    private T x;
    private V y;

    public Outputs(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x = %s, y = %s", x.toString(), y.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Outputs<?, ?> outputs = (Outputs<?, ?>) o;
        boolean isX = Objects.equals(x, outputs.x);
        boolean isY = Objects.equals(y, outputs.y);
        if (y instanceof int[]) {
            isY = Arrays.equals((int[]) y, (int[]) outputs.y);
        }
        return isX && isY;
    }

}
