package DataStructure.LinkedList;

class CircularLinkedList {
    CNode head, tail;

    // Insert at end
    void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    // Display elements
    void display() {
        if (head == null) return;
        CNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to head)");
    }
}

// Main function to test CLL
public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.display();
        cll.deleteFromBeginning();
        cll.display();
    }
}

