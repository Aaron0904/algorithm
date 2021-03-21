package linkedList;

import domain.DoubleLinkedListNode;
import domain.SingleLinkedListNode;

/**
 * @Author: aaron
 * @Date: 3/21/21 11:02 PM
 */
public class DoubleLinkedList {

    public static DoubleLinkedListNode reverse(DoubleLinkedListNode head) {
        if (head == null) return head;

        DoubleLinkedListNode pre = null;
        DoubleLinkedListNode next = null;

        while (head != null) {
            next = head.getNext();
            pre = head.getPre();
            head.setNext(pre);
            head.setPre(next);
            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        DoubleLinkedListNode node = new DoubleLinkedListNode(1);
        DoubleLinkedListNode node2 = new DoubleLinkedListNode(2);
        DoubleLinkedListNode node3 = new DoubleLinkedListNode(3);

        node3.setPre(node2);
        node2.setPre(node);
        node2.setNext(node3);
        node.setNext(node2);

        printDoubleLinkedList(node);
        System.out.println();
        node = reverse(node);
        printDoubleLinkedList(node);
    }

    public static void printDoubleLinkedList(DoubleLinkedListNode node) {
        if (node == null) return;

        System.out.print(node.getValue());
        while (node.getNext() != null) {
            System.out.print(" <--> ");
            node = node.getNext();
            System.out.print(node.getValue());
        }
        System.out.println();
    }
}
