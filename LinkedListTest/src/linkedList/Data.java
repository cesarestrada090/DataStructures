package linkedList;

public class Data {
    private int value;
    private Data next;

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Data getNext() {
        return next;
    }

    public void setNext(Data next) {
        this.next = next;
    }
}
