

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Track seen numbers for 9 rows, 9 columns, and 9 sub-boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') continue;

                int boxIndex = (r / 3) * 3 + (c / 3);

                // If character already exists in the row, col, or box set
                if (!rows[r].add(val) || !cols[c].add(val) || !boxes[boxIndex].add(val)) {
                    return false;
                }
            }
        }

        return true;
    }
}