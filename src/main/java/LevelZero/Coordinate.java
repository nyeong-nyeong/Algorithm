package LevelZero;

public class Coordinate {
    public int[] solution(String[] keyinput, int[] board) {
        int maxWidth = (board[0] - 1) / 2;
        int minWidth = -(board[0] - 1) / 2;

        int maxHeight = (board[1] - 1) / 2;
        int minHeight = -(board[1] - 1) / 2;

        int width = 0;
        int height = 0;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("right")) {
                if (width+1 <= maxWidth) width++;
            } else if (keyinput[i].equals("left")) {
                if (width-1 >= minWidth) width--;
            } else if ((keyinput[i].equals("up"))) {
                if (height+1 <= maxHeight) height++;
            } else if ((keyinput[i].equals("down"))) {
                if (height-1 >= minHeight) height--;
            } else {
                return null;
            }
        }
        int[] answer = {width , height};
        return answer;
    }
}
