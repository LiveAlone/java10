import java.util.ArrayList;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        initVarDemo();
    }
    
    private static void initVarDemo(){
        // list
        var list = new ArrayList<>();
        list.add(1);
        list.add("contest");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // map 这样用不好
        var map = new HashMap<>();
        map.put(5, new String("test map"));
        map.put(new String("all"), 123);
        System.out.println(map.get(5));
        System.out.println(map.get("all"));
    }
}
