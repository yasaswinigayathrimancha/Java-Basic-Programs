package task4.task4;
import java.util.*;
public class PuzzleSolving{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char move = ' ';
        char[][] puzzle=new char[5][5];
        System.out.println("Enter alphabetic matrix (upto x) with '_'as one of its element:\n");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                   char letter=sc.next().charAt(0);
                   puzzle[i][j]=letter;
            }
        }
        char[][] standard1= { { 'a', 'b', 'c', 'd', 'e' }, { 'f', 'g', 'h', 'i', 'j' }, { 'k', 'l', 'm', 'n', 'o' }, { 'p', 'q', 'r', 's', 't' }, { 'u', 'v', 'w', 'x', '_' } };
        char[][] standard2={{'_','a', 'b', 'c', 'd'},{'e','f', 'g', 'h', 'i'},{'j','k', 'l', 'm', 'n'},{'o','p', 'q', 'r', 's'},{'t','u', 'v', 'w', 'x'}};
        char[][] out;
        while (move != 'E') {
            System.out.println("Enter your move(L,R,A,B or E(Exit)) :");
            move = sc.next().charAt(0);
            out = movementOfCursor(puzzle, move);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(out[i][j] + " ");
                }
                System.out.println();
            }
            puzzle = out;
            if(Arrays.deepEquals(out,standard1)) {
                move ='E';
            }
            if(Arrays.deepEquals(out,standard2)){
                move='E';
            }
            if (move == 'E') {
                System.out.println("Game Over");
            }
        }
    }
    public static int[] positionOfCursor(char[][] mat) {
        int[] arr = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] == '_') {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
    public static char[][] movementOfCursor(char[][] mat, char move) {
        int[] pos = positionOfCursor(mat);
        char flag;
        if (move == 'L') {
            flag = mat[pos[0]][pos[1]];
            mat[pos[0]][pos[1]] = mat[pos[0]][pos[1] - 1];
            mat[pos[0]][pos[1] - 1] = flag;
        }
        if (move == 'R') {
            flag = mat[pos[0]][pos[1]];
            mat[pos[0]][pos[1]] = mat[pos[0]][pos[1] + 1];
            mat[pos[0]][pos[1] + 1] = flag;
        }
        if (move == 'A') {
            flag = mat[pos[0]][pos[1]];
            mat[pos[0]][pos[1]] = mat[pos[0] - 1][pos[1]];
            mat[pos[0] - 1][pos[1]] = flag;
        }
        if (move == 'B') {
            flag = mat[pos[0]][pos[1]];
            mat[pos[0]][pos[1]] = mat[pos[0] + 1][pos[1]];
            mat[pos[0] + 1][pos[1]] = flag;
        }
        return mat;
    }
}