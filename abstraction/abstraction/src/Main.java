import com.digit.MyLinkedList;
import com.digit.Node;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String s : data) {
            
            // create new item with value set to the string
            list.addItem(new Node(s));

        }

        list.traverse(list.getRoot());
    }
    
}
