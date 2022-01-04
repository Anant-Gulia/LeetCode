class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0)
            return false;
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')
                x--;
            else if (moves.charAt(i) == 'R')
                x++;
            else if (moves.charAt(i) == 'U')
                y++;
            else
                y--;
        }
        if (x == y && x == 0)
            return true;
        else
            return false;
    }
}