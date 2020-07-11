 package linkedlistassignment;

/**
 *
 * @author chiko
 */
public class linkedlist {
    node root;          int size;

    public linkedlist() {
        this.root = new node();
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        this.size = s;
    }
    
    public void add(int data){
        //adding a new node into the linked list bbbbby passing in the data and using the root node as the next pointer
        node newNode = new node(data);
        
        //newNode = new node(data);
        //then we set the root to the new node
        node current = root;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }   
        current.setNextNode(newNode);
        //increasing the size of the list
        this.size++;
    }
    
    @Override
    public String toString() {
        node currentNode = root.getNextNode();              String output = "";
        while (currentNode != null) {
            output += "[" + currentNode.getData() + "]";
            currentNode = currentNode.getNextNode();
        }
        return output;
    }
    
    
}
