class Solution {
  // Method to find the least number of dice rolls required to reach the square n^2
  public int snakesAndLadders(int[][] board) {
    int length = board.length;
    int target = length * length; // Correct target: n^2 (source had length << 1 = 2*n, which is wrong)

    HashSet<Integer> visit = new HashSet<>();
    Queue<int[]> queue = new LinkedList<>();

    // Start at square 1 with 0 moves
    queue.add(new int[] { 1, 0 });

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int square = current[0], moves = current[1];

      for (int i = 1; i <= 6; i++) {
        int nextSquare = square + i;

        if (nextSquare > target) {
          break;
        }

        // Convert square number to board coordinates
        int[] pos = intToPos(nextSquare, length);
        int r = pos[0], c = pos[1];

        // Apply snake or ladder if present
        if (board[r][c] != -1) {
          nextSquare = board[r][c];
        }

        // Reached the final square
        if (nextSquare == target) {
          return moves + 1;
        }

        // Enqueue unvisited squares
        if (!visit.contains(nextSquare)) {
          visit.add(nextSquare);
          queue.offer(new int[] { nextSquare, moves + 1 });
        }
      }
    }

    return -1;
  }

  // Convert 1-indexed square number to (row, col) in Boustrophedon order
  private int[] intToPos(int square, int n) {
    int r = (square - 1) / n; // 0-indexed row from bottom
    int c = (square - 1) % n; // 0-indexed column (left-to-right for even rows)

    // Odd rows go right-to-left: mirror the column
    if (r % 2 == 1) {
      c = n - 1 - c;
    }

    // Flip row from bottom-origin to top-origin
    r = n - 1 - r;

    return new int[] { r, c };
  }
}
