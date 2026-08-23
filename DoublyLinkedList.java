public class DoublyLinkedList {
    Node begin;
    Node end;
    int size;

    public DoublyLinkedList() {
        this.begin = null;
        this.end = null;
        this.size = 0;
    }


    public void insertValue(int value) {
        Node newNode = new Node(value);

        if (begin == null) {

            begin = newNode;
            end = newNode;
        } else {

            end.next = newNode;
            newNode.previous = end;
            end = newNode;
        }
        size++;
    }


    public boolean deleteValue(int value) {
        if (begin == null) {
            return false;
        }

        Node currentNode = begin;

        while (currentNode != null) {
            if (currentNode.value == value) {


                if (currentNode == begin && currentNode == end) {
                    begin = null;
                    end = null;
                }

                else if (currentNode == begin) {
                    begin = currentNode.next;
                    begin.previous = null;
                }

                else if (currentNode == end) {
                    end = currentNode.previous;
                    end.next = null;
                }

                else {
                    currentNode.previous.next = currentNode.next;
                    currentNode.next.previous = currentNode.previous;
                }

                size--;
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    public void printList() {
        Node currentNode = begin;

        if (currentNode == null) {
            System.out.println("Lista vazia");
            return;
        }

        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) {
                System.out.print(" <~> ");
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    public int getSize() {
        return this.size;
    }
}
