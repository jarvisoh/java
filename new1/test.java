import java.util.HashSet;
import java.util.Set;

public class EquationSolver {
    public static void main(String[] args) {
        int n = 3;
        solveEquation(n);
    }

    public static void solveEquation(int n) {
        Set<Integer> used = new HashSet<>();
        solveEquationHelper(0, 0, n, used);
    }

    public static void solveEquationHelper(int x, int y, int n, Set<Integer> used) {
        int z = n - x - y;

        if (x + y + z == n && x != y && y != z && x != z) {
            System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        }

        if (x < n && !used.contains(x + 1)) {
            used.add(x);
            solveEquationHelper(x + 1, y, n, used);
            used.remove(x);
        }

        if (y < n && !used.contains(y + 1)) {
            used.add(y);
            solveEquationHelper(x, y + 1, n, used);
            used.remove(y);
        }
    }
}
