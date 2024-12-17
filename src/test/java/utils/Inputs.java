package utils;

public class Inputs<T, V> {

    private T x;
    private V y;

    public Inputs(T x, V y) {
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
}
