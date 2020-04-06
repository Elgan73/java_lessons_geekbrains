package Lesson.Workers;


public class Worker {

    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person(1, "Ivan", "Bolutskiy", 35, "CEO", 60000, "89123254525", "ceo_foub@gmail.com");
        personArray[1] = new Person(2, "Sergei", "Simkov", 52, "Cleaner", 20000,"89124563212", "not_found");
        personArray[2] = new Person(3, "Alex", "Grow", 41, "Engineer", 35000, "89127895421", "grow_foub@gmail.com");
        personArray[3] = new Person(4, "Alexa", "Samitskaya", 21, "co-director", 52000, "89376542525", "samitskaya_foub@gmail.com");
        personArray[4] = new Person(5, "Sima", "Bolt", 37, "Programmer", 45000, "89112002023", "bolt_foub@gmail.com");


        //Вывод списка сотрудников
        for (Person person : personArray){
            System.out.println(person);
        }

        // Просто пробел
        System.out.println();

        //Вывод списка сотрудников старше 40
        for (Person person : personArray) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }

        //Очень хочется сделать и понять как сделать вывод строки массива по id, никак не докумекаю
        // и еще вопрос, метод по выводу объекта в классе Person - про что это? toString? или надо какой-то свой?






    }
}
