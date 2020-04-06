package Lesson.MyCatIsEating;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void foooood(int n) {
        if (n > food) {
            String imgUrl = "http://cs9.pikabu.ru/post_img/big/2019/12/16/10/1576518264140262766.jpg";
            System.out.println("NATASHA!!! Click this image => " + imgUrl);
        } else {
            food -= n;
            System.out.println("I'am full, Meow");
        }
    }

    public void info() {
        System.out.println("Cat's plate = " + food);
    }

    public void addFood(int n) {food = food + n;}
}


