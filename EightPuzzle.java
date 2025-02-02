import java.util.*;

class PuzzleNode {
    int[][] state;
    int x, y; // Position of the empty tile (0)
    int cost; // Cost to reach this state
    int level; // Depth of the node
    PuzzleNode parent; // Parent node

    public PuzzleNode(int[][] state, int x, int y, int newX, int newY, int level, PuzzleNode parent) {
        this.state = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.state[i][j] = state[i][j];
            }
        }
        // Swap the empty tile with the new position
        this.state[x][y] = this.state[newX][newY];
        this.state[newX][newY] = 0;
        this.x = newX;
        this.y = newY;
        this.level = level;
        this.parent = parent;
        this.cost = Integer.MAX_VALUE;
    }
}

public class EightPuzzle {
    static final int[][] GOAL_STATE = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

    // Calculate the Manhattan Distance heuristic
    static int calculateCost(int[][] initialState, int[][] goalState) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (initialState[i][j] != 0 && initialState[i][j] != goalState[i][j]) {
                    int value = initialState[i][j];
                    int targetX = (value - 1) / 3;
                    int targetY = (value - 1) % 3;
                    cost += Math.abs(i - targetX) + Math.abs(j - targetY);
                }
            }
        }
        return cost;
    }

    // Check if the current state is the goal state
    static boolean isGoalState(int[][] state) {
        return Arrays.deepEquals(state, GOAL_STATE);
    }

    // Print the puzzle state
    static void printPuzzle(int[][] state) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(state[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Solve the 8-puzzle using A* algorithm
    static void solvePuzzle(int[][] initialState, int x, int y) {
        PriorityQueue<PuzzleNode> openList = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        Set<String> closedList = new HashSet<>();

        PuzzleNode root = new PuzzleNode(initialState, x, y, x, y, 0, null);
        root.cost = calculateCost(initialState, GOAL_STATE);
        openList.add(root);

        while (!openList.isEmpty()) {
            PuzzleNode current = openList.poll();

            if (isGoalState(current.state)) {
                System.out.println("Solution found!");
                printPuzzle(current.state);
                return;
            }

            closedList.add(Arrays.deepToString(current.state));

            // Generate all possible moves
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
                    PuzzleNode child = new PuzzleNode(current.state, current.x, current.y, newX, newY, current.level + 1, current);
                    child.cost = calculateCost(child.state, GOAL_STATE) + child.level;

                    if (!closedList.contains(Arrays.deepToString(child.state))) {
                        openList.add(child);
                    }
                }
            }
        }

        System.out.println("No solution found.");
    }

    public static void main(String[] args) {
        int[][] initialState = {
            {1, 2, 3},
            {5, 6, 0},
            {7, 8, 4}
        };

        int x = 1, y = 2; // Position of the empty tile (0)
        solvePuzzle(initialState, x, y);
    }
}