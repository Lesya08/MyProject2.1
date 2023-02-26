public class Main {
    public static void main(String[] args) {
        int ticket = 6330;          // стоимость билета
        int rublesOneMile = 20;     // кол-во рублей для одной бонусной мили
        int bonusMile = ticket / rublesOneMile;  // кол-во бонусных миль за покупку билета
        System.out.println("При покупке билета Вам будет начислено " + bonusMile + " бонусных миль.");
    }
}