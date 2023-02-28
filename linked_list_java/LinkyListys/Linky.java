package LinkyListys;

import java.util.LinkedList;

public class Linky {

    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<String>();

        linky.add("Michel");
        linky.add("Alex");
        linky.add("Jose");

        System.out.println(linky);
        System.out.println(linky.getFirst());

        linky.clear();
        System.out.println(linky);
        

    } 
    
}
