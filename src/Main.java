public class Main {
    public static void main(String[] args) {
        //task 1
        int person = 25;
        if (person >= 18) {
            System.out.println("Поздравляем Вы совершеннолетний!");
        } else {
            System.out.println("Ваш возраст для совершенолетия еще не наступил");
        }
        //task 2
        if (person >= 7 && person < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (person >= 18 && person < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (person >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
}