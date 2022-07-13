public class HoldAt20DiePlayer implements IDiePlayer{
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if(myScore == 1 || turnTotal >= 20 || (turnTotal + myScore ) >= DieGame.GOAL_SCORE)
            return false;
        else
            return true;
    }
}
