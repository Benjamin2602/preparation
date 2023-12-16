public class insert {

    public static void main(String[] args) {
        insertion list = new insertion();
        list.insertElement(4, 6);
        list.insertElement(49, 5);
        list.insertElement(76, 2);
        list.insertElement(2, 1);
        list.insertElement(7, 4);
        list.insertElement(33, 0);
        list.insertElement(99, 3);

        list.display();
        
    }
}

     class insertion{

        private Node head;
        private Node tail;
        int size;

        public insertion(){
            this.size = 0;
        }

        public void insertElement(int value , int index){
            Node newNode = new Node(value);

            if(index == 0){
                // insert at first
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }
                else{

                    newNode.next = head;
                    head = newNode;
                }
                }
            else if(index == size){
                //insert at last
                if(tail == null){
                    insertElement(value, 0);
                    return;
                }
                else{

                    tail.next = newNode;
                    tail = newNode;
                }
            }
            else{
                //insert at middle
                Node temp =  head;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;

            }
            size++;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + "-> ");
                temp = temp.next;
            }   
        }

        
            public static class Node {
                int value;
                Node next;
        
                public Node(int value){
                    this.value = value;
                    this.next = null;
                }
                public Node(int value , Node next){
                    this.value = value;
                    this.next = next;
                }
            }
    }
    

