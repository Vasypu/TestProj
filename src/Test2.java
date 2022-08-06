import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        List <Character> list = new ArrayList<>();
        String str = "sfsdf";
        char c2 = 0;
        char[] c = str.toCharArray();
        for (char c1 : c) {
            c2 += c1;
            list.add(c1);
        }
        list.forEach(character -> {});

        System.out.println("c2 " + c2);

        String oct = "003";
        int dec = Integer.parseInt(oct, 8);
        char m = (char) dec;
        System.out.println("В десятичной с.с. будет " + dec);
        System.out.println("Знак ASCII будет " + (char) dec);
        if(m < ' ') {
            System.out.println(m);
        }
    }
}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        if (c.get(Calendar.DAY_OF_MONTH) == 9 && c.get(Calendar.MONTH) + 1 == 7)
//            System.out.println("С Днем Рождения!" + (c.get(Calendar.YEAR) - 1987) + "!");
//    }
//}
