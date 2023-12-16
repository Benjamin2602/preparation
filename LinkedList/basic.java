    import java.util.*;


    public class basic {
        public static void main(String[] args) {
            LL list = new LL();
            list.insertFirst(4);
            list.insertFirst(49);
            list.insertLast(76);
            list.insertFirst (2);
            list.insertLast(7);
            list.insertFirst(33);
            list.insert(99, 3);

            list.display();
        }
    }

    class LL {

        private Node head;
        private Node tail;
         int size;

        public LL() {
            this.size = 0;
        }


        // inserting the node at the end of the linked list
        public void insertFirst(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        //insert at last
        public void insertLast(int value){
            if(tail == null){
                insertFirst(value);
                return;
            }
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        //insert
        public void insert(int value , int index){
            if(index == 0){
                insertFirst(value);
                return;
            }
            if(index == size){
                insertLast(value);
                return;
            }
            Node newNode = new Node(value);
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;


        }

        // displaying the linked list
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
        }

        public static class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
    }