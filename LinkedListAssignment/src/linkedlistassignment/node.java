package linkedlistassignment;

/**
 *
 * @author chiko
 */
public class node {
    node nextNode;      int data;

    public node() {
    }

    public node(int value) {
        this.data = value;
    }

    public node(int value, node nextValue) {
        this.nextNode = nextValue;
        this.data = value;
    }

    public node getNextNode() {
        return nextNode;
    }

    public void setNextNode(node nextValue) {
        this.nextNode = nextValue;
    }

    public int getData() {
        return data;
    }

    public void setData(int value) {
        this.data = value;
    }
}
