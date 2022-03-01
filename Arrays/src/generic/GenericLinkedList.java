package generic;

public class GenericLinkedList<T> {
    Node<T> head;

    public GenericLinkedList<T> add(Node<T> value){
        Node<T> newNode = value;
        if(head == null) {
            head = newNode;
        } else {
            Node<T> x = head;
            while(x.next != null) {
                x = x.next;
            }
            x.next = newNode;
        }
        return this;
    }

    public GenericLinkedList<T> addAtIndex(Integer position,Node<T> value){
        Node<T> newNode = value;
        if(position == 0) {
            Node<T> temp = head;
            head = newNode;
            head.next = temp;
        } else {
            int index = 0;
            Node<T> x = head;
            while(x.next != null) {
                if(index == position){
                    Node<T> temp = x;
                    x = value;
                    x.next = temp;
                    break;
                }
            }

        }
        return this;
    }

    public static void main(String[] args) {
        GenericLinkedList<Integer> genericLinkedList = new GenericLinkedList<>();
        Node<Integer> node = new Node<>(3);
        Node<Integer> node2 = new Node<>(4);
        Node<Integer> node3 = new Node<>(5);
        genericLinkedList.add(node);
        genericLinkedList.add(node2);
        genericLinkedList.add(node3);
        System.out.println(genericLinkedList);
    }

    public String toString()
    {

        String S = "";
        Node<T> X = head;

        while (X.next != null) {
            S += String.valueOf(X.value) + " -> ";
            X = X.next;
        }
        S += String.valueOf(X.value);
        return S ;
    }
}
