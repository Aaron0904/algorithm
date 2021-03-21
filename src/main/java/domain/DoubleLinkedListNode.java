package domain;

/**
 * @Author: aaron
 * @Date: 3/20/21 11:57 PM
 */
public class DoubleLinkedListNode extends Node{

    private DoubleLinkedListNode pre;

    private DoubleLinkedListNode next;

    public DoubleLinkedListNode(int value) {
        super(value);
    }

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

    public DoubleLinkedListNode getPre() {
        return pre;
    }

    public void setPre(DoubleLinkedListNode pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "DoubleLinkedListNode{" +
                "value=" + getValue() +
                ", next=" + next +
                '}';
    }
}
