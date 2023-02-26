public class Main {
    public static void main(String[] args) {
        int ticket = 6330;
        int rublesOneMile = 20;
        int bonusMile = ticket / rublesOneMile;
        System.out.println("При покупке билета Вам будет начислено " + bonusMile + " бесплатных миль.");
    }
}