package linkedList;

import domain.Node;
import domain.SingleLinkedListNode;
import org.junit.Test;

/**
 * @Author: aaron
 * @Date: 3/21/21 11:02 PM
 */
public class SingleLinkedList {

    public static SingleLinkedListNode reverse(SingleLinkedListNode head) {
        if (head == null) return head;

        SingleLinkedListNode pre = null;
        SingleLinkedListNode next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        SingleLinkedListNode node = new SingleLinkedListNode(1);
        SingleLinkedListNode node2 = new SingleLinkedListNode(2);
        SingleLinkedListNode node3 = new SingleLinkedListNode(3);

        node2.setNext(node3);
        node.setNext(node2);

        System.out.println(node);
        node = reverse(node);
        System.out.println(node);
    }

    public static void printSingleLinkedList(SingleLinkedListNode node) {
        if (node == null) return;

        System.out.print(node.getValue());
        while (node.getNext() != null) {
            System.out.print(" -> ");
            node = node.getNext();
            System.out.print(node.getValue());
        }
        System.out.println();
    }

    public static SingleLinkedListNode removeNumber(SingleLinkedListNode head, int number) {
        while (head != null) {
            if (head.getValue() != number) {
                break;
            } else {
                head = head.getNext();
            }
        }

        SingleLinkedListNode pre = head;
        SingleLinkedListNode current = head;

        while (current != null) {
            if (current.getValue() == number) {
                pre.setNext(current.getNext());
            } else {
                pre = current;
            }
            current = current.getNext();
        }

        return head;
    }

    @Test
    public void testRemoveNumber() {
        SingleLinkedListNode node1 = new SingleLinkedListNode(1);
        SingleLinkedListNode node2 = new SingleLinkedListNode(2);
        SingleLinkedListNode node3 = new SingleLinkedListNode(3);
        SingleLinkedListNode node4 = new SingleLinkedListNode(2);
        SingleLinkedListNode node5 = new SingleLinkedListNode(5);
        SingleLinkedListNode node6 = new SingleLinkedListNode(1);

        node5.setNext(node6);
        node4.setNext(node5);
        node3.setNext(node4);
        node2.setNext(node3);
        node1.setNext(node2);

        printSingleLinkedList(node1);
        SingleLinkedListNode node = removeNumber(node1, 2);
        printSingleLinkedList(node);
        SingleLinkedListNode nodee = removeNumber(node1, 1);
        printSingleLinkedList(nodee);

    }
}
