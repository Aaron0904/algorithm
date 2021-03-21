package domain;

/**
 * @Author: aaron
 * @Date: 3/22/21 12:26 AM
 */
public class Node {

    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
