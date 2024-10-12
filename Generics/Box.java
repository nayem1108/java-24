package Generics;

public class Box<N> {
    private N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }

}
