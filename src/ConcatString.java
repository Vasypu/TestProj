import java.util.ArrayList;
import java.util.List;

public class ConcatString {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "{\"_entityName\":\"jsonb_Config\",\"id\":\"\",\"text\":\"{\\r\\n    \\\"async\\\": false,\\r\\n    \\\"useStock\\\": false,\\r\\n    \\\"orderConfirm\\\": true\\r\\n}\"}";
        String str2 = "{\n" +
                "    \"id\": \"\",\n" +
                "    \"text\": \"{\\r\\n    \\\"async\\\": false,\\r\\n    \\\"useStock\\\": false,\\r\\n    \\\"apiConfig\\\": {\\r\\n        \\\"user\\\": \\\"\\\",\\r\\n        \\\"accessToken\\\": \\\"C1526B6FA7B4D1E31B7251A6CA967\\\"\\r\\n    },\\r\\n    \\\"orderConfirm\\\": true,\\r\\n    \\\"defaultLocation\\\": \\\"MOW\\\",\\r\\n    \\\"platform\\\": \\\"ps3\\\",\\r\\n    \\\"mixedBags\\\": true,\\r\\n    \\\"idCollectConfig\\\": {\\r\\n        \\\"url\\\": \\\"http://test.tmconsulting.ru/sber-stub\\\",\\r\\n        \\\"user\\\": \\\"\\\",\\r\\n        \\\"token\\\": \\\"C1526B6FA7B4D1E31B7251A6CA967\\\"\\r\\n    }\\r\\n}\",\n" +
                "    \"_entityName\": \"jsonb_Config\"\n" +
                "}";
        System.out.println(str2);
        String[] words = str2.split("n");
        for(String word : words){
//            System.out.println(word);
        }
        String str3 = str2.replaceAll("[r,n]", "");
//        System.out.println(str3);
        sb.append(str2);
        sb.indexOf(",");
//        System.out.println(sb);
        allIndex(str2);

    }

    static void allIndex(String str) {
        List<Integer> list = new ArrayList<>();
        list.forEach(integer -> {

        });

        int firstIndex = str.indexOf(",");
        if (firstIndex != -1) {
            System.out.println(firstIndex);
            String str2 = str.substring(firstIndex, firstIndex + 10);
//            System.out.println(str2);
        }
//        System.out.println(str);
        char [] s = str.toCharArray();
        for (char i : s){

            System.out.print(i);
        }
    }

}
