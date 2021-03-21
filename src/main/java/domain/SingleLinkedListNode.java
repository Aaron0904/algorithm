package domain;

/**
 * @Author: aaron
 * @Date: 3/20/21 11:57 PM
 */
public class SingleLinkedListNode extends Node{

    private SingleLinkedListNode next;

    public SingleLinkedListNode(int value) {
        super(value);
    }

    public SingleLinkedListNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleLinkedListNode{" +
                "value=" + getValue() +
                ", next=" + next +
                '}';
    }
}
