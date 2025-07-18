package org.example.datastructure;

/**
 * 带有随机指针的节点定义（用于复制带随机指针的链表等问题）
 */
@SuppressWarnings("unused")
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
