import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Integer, String> tell = new HashMap<>();

    public static void main(String[] args) {

        add(23323, "Gusev");
        add(23323, "Horov");
        add(23432432, "Tinkoff");
        add(45435, "Lermontov");
        add(5656546, "Gromov");
        add(321432, "Kuznetczov");
        add(5564564, "Kolosov");
        add(3333333, "Shilov");
        add(2222222, "Shilov");
        add(5555555, "Shilov");
        add(565654699, "Gromov");
        get("Shilov");
    }

    public static HashMap<Integer, String> add(int telephone, String sname) {
        tell.put(telephone, sname);
        return tell;
    }

    public static void get(String sname) {
        for (Map.Entry<Integer, String> spisok : tell.entrySet()) {
        if(spisok.getValue().equals(sname))
                System.out.println(spisok.getKey()+" "+spisok.getValue());

        }


    }
}



