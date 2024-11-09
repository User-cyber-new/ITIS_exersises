public class MyLinkedList {
    MyLinkedList previous;
    Object data;
    MyLinkedList next;

    private static int size;

    MyLinkedList(Object data){
        this.data = data;
    }

    MyLinkedList(){}

    public void add(MyLinkedList tail, Object data){
        //MyLinkedList tail;

        MyLinkedList element = new MyLinkedList();
        element.data = data;

        MyLinkedList tail2 = tail;
        MyLinkedList tailLast = null;

        while (tail2 != null){
            tailLast = tail2;
            tail2 = tail2.next;
        }

        if (tailLast == null) tailLast = element;

        else {
            tailLast.next = element;
            element.previous = tailLast;
            element.next = null;
        }


    }

    public int toSize(MyLinkedList list){
        int k = 0;
        while (list!=null){
            k++;
            list = list.next;
        }
        return  k;
    }

    public void remove(MyLinkedList list, int n){
        int k = 0;

        MyLinkedList tail2 = list;

        if (n == 0){

            tail2.next.previous = null;
        }

        else{
            while (true) {
                if (k == n) {
                    tail2.previous.next = tail2.next;
                    tail2.next.previous = tail2.previous;
                    break;
                }

                tail2 = tail2.next;
                k++;
            }
        }
    }


    public static void print(MyLinkedList list){
        while (list!=null){
            System.out.print(list.data);
            System.out.print(" ");
            list = list.next;
        }
        System.out.println();
    }

}




