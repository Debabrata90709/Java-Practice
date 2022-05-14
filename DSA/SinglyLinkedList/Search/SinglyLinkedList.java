public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Creation of Linked List
    public Node createSinglyLinkedList(int nodeValue)
    {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method Singly Linked List
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Singly Linked List Traversal
    public void traverseSinglyLinkedList() {
        if(head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for(int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
    }

    //Search for a Node
    boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for (int i = 0; i< size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.print("Find the node at location: " + i +"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found!");
        return false;
        }
    }

