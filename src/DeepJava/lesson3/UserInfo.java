package DeepJava.lesson3;

import java.util.ArrayList;

public class UserInfo {

    private int id;
    private String name;
    private ArrayList<Long> numbers;


    public UserInfo(int id, String name) {
        this.id = id;
        this.name = name;
        numbers = new ArrayList<>();
    }

    public void addNumber(long numb) {
        numbers.add(numb);
    }

    public ArrayList<Long> getNumbers() {
        return numbers;
    }

    public long getId(int id) {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}
