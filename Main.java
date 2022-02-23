import java.text.CollationElementIterator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //int[] arr = new int[10];
        //arr[0]=0;
        //arr[1]=1;
        //arr[2]=2;
        //arr[3]=3;
        //arr[4]=4;
        //arr[5]=5;
//
        //System.out.print('[');
        //for(int i = 0 ; i<arr.length;i++){
        //    System.out.print(arr[i]);
        //    if (i<9) {
        //        System.out.print(", ");
        //    }
//
        //}
        //System.out.println(']');
//
        //System.out.println("====================");
        //System.out.println(Arrays.toString());
//
        //List list = new ArrayList<Integer>();
        //Integer [] a= new Integer[10] ;
        //list.toArray(a);
        //list.add(19);
        //list.add(55);
        //list.add(-13);
        //var compartor= new EmailComparator();
        //var user1 = new User("a","e3");
        //var user2 = new User("c","e2");
        //var user3 = new User("b","e1");
        //var users= new ArrayList<User>();
        //users.add(user1);
        //users.add(user2);
        //users.add(user3);
        //System.out.println(users);
//
        //Collections.sort(list);
        //Collections.sort(users, User.emailComparator());
//
        //System.out.println(users);
//
        //Collections.addAll(list,12,50,19,-99,100);
        //System.out.println(list);
        //Collections.sort(list);
        //System.out.println(list);

        //var items = new ArrayList<Item>();
        //items.add(new Item(19.90,"milk","dairy",100,28 ));
        //items.add(new Item(12.2,"cola","Soft",1002,28 ));
        //items.add(new Item(78,"meat","meat & fish",103,38 ));
        //items.add(new Item(55,"fish","meat & fish",509,19 ));
        //System.out.println(items);
        //Collections.sort(items);
        //System.out.println("//////////////////////////////////////////////////////////");
        //System.out.println(items);
//
        //Collections.sort(items,Item.priceComp());
        //Collections.sort(items,Item.nameComp());
        //Collections.sort(items,Item.idComp());
        //Collections.sort(items,Item.qComp());
//


        //EditorState es1= new EditorState("hodi");
//
        //Editor e1 = new Editor("hodi");
        //System.out.println(e1);
        //e1.setContent("Asaaf");
        //System.out.println(e1);
        //e1.setContent("Naama");
        //System.out.println(e1);

        //Editor editor= new Editor();
        //History history = new History();
//
        //editor.setContent("a");
        //history.push(editor.createState());// inserted to the list
//
        ////a
//
        //editor.setContent("b");
        //history.push(editor.createState());
//
        ////b
        //editor.setContent("c");
        //history.push(editor.createState());
//
        //editor.restore(history.pop());
//
//
        //System.out.println(editor);
//

        Arr a = new Arr();

        a.add(12);
        a.add(50);
        a.add(-20);
        a.add(-480);

        while(a.iterator().hasNext()){
            System.out.println(a.iterator().next());
        }


    }

}
