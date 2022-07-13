import java.util.Scanner;

public class UserDiePlayer implements IDiePlayer{
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        System.out.println("Tur Toplamı" + turnTotal +" . Devam etmek istiyor musunuz? İstemiyorsanız herhangi bir tuşa basınız.");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(myScore + turnTotal >= DieGame.GOAL_SCORE || line.length() > 0)
            return false;
        else
            return true;

    }
}
