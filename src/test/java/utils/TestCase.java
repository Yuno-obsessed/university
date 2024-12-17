package utils;

public class TestCase<T, V> {

    private T input;
    private V expected;

    public TestCase(T input, V expected) {
        this.input = input;
        this.expected = expected;
    }

    public T getInput() {
        return input;
    }

    public V getExpected() {
        return expected;
    }

}
