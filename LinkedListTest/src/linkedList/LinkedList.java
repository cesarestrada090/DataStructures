package linkedList;

public class LinkedList {
    private Data head;

    public Data getHead() {
        return head;
    }

    public void setHead(Data head) {
        this.head = head;
    }

    public LinkedList insert(Data data){
        if(head == null) {
            head = data;
        } else {
            Data last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(data);
        }
        return this;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Data data = new Data(1);
        Data data2 = new Data(2);
        linkedList.insert(data);
        linkedList.insert(data2);
        linkedList.deleteByValue(1);
        linkedList.printList();
    }

    public LinkedList deleteByValue(int value) {
        Data currData = this.head;
        Data prev = null;
        if(currData != null && currData.getValue() == value) {
            head = currData.getNext(); ;
            System.out.println("Found and delete at head");
            return this;
        }

        // Save currNode in "prev"
        while(currData != null && currData.getValue() != value){
            prev = currData;
            currData = currData.getNext();
            System.out.println("Found and delete at mid level");
        }

        // if currentData is not null, key was found

        if(currData != null) {
            prev.setNext(currData.getNext());
        }
        return this;

    }

    public void printList()
    {
        Data currNode = this.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.getValue() + " ");

            // Go to next node
            currNode = currNode.getNext();
        }
    }
}




