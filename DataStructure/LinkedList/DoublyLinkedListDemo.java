package DataStructure.LinkedList;

class DoublyLinkedList {
    DNode head, tail;

    // Insert at the end
    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at the beginning
    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete from the beginning
    void deleteFromBeginning() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from the end
    void deleteFromEnd() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Display forward
    void displayForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main function to test DLL
public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);
        dll.displayForward();
        dll.deleteFromEnd();
        dll.displayForward();
    }
}

