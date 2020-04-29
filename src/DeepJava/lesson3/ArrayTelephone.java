package DeepJava.lesson3;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ArrayTelephone {

    public static HashMap<Integer, UserInfo> map = new HashMap<>();
    public static void addUser(int id, String sName) {
        map.put(id, new UserInfo(id, sName));
    }

    public static void addUserNumber(int id, long tel) {
        map.get(id).addNumber(tel);
    }

    public static void getUser(int id) {
        if (map.containsKey(id)) {
            System.out.println(map.get(id));
        } else {
            System.out.println("User not found");
        }
    }

    public static void main(String[] args) {
        addUser(1, "Sergeev");
        addUser(15, "Andreev");
        addUser(2, "Solka");
        addUserNumber(1, 89023211212L);
        addUserNumber(1, 89023211213L);
        addUserNumber(1, 89023211214L);
        addUserNumber(15, 89023211215L);
        getUser(1);
    }
}
