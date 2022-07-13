public class RaceToGoalDiePlayer implements IDiePlayer{
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if(myScore >= 71 || maxScore >= 71){
            while(myScore + turnTotal < DieGame.GOAL_SCORE)
                return true;
        }
        else {
            if(turnTotal >= (21 + Math.round((maxScore - turnTotal)/8)) || maxScore + turnTotal >= DieGame.GOAL_SCORE)
                return true;
            else
                return false;
        }
        return false;
    }

}
