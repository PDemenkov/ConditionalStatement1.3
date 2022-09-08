public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
int age = 18;
        if (age>=2 && age<=6) {
            System.out.println("Если возраст человека равен "+age+" нужно ходить в детский сад");
        } else if (age>6 && age<=18) {
            System.out.println("Если возраст человека равен "+age+" нужно ходить ходить в школу");
                    } else if (age>18 && age<24) {
            System.out.println("Если возраст человека равен "+age+" нужно ходить учиться в университете");
        } else if (age>=24) {
            System.out.println("Если возраст человека равен "+age+" пора на работу");
        }

        System.out.println("Задание 2");
int childAge=4;
        if (childAge<5){
            System.out.println("Кататься на атракционе нельзя");
        } else if (childAge>=5 && childAge<14) {
            System.out.println("Кататься только в сопровождении взрослых");
                    }
        else {
            System.out.println("Кататься можно без сопровождения");
        }

        System.out.println("Задание 3");
        int one = 120;
        int two = 120;
        int three = 120;
        if (one>two){
            if (one>=three){
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two>one) {
            if (two>=three){
                System.out.println("Максимальное число " + two);
            }else {
                System.out.println("Максимальное число " + three);
            }

        } else {
            if (one>three){
                System.out.println("Максимальное число " + one);
            } else if (three>one){
                System.out.println("Максимальное число "  + three);
            } else {
                System.out.println("Все числа равны");
            }
        }

    }
}

