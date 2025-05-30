class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                list.add(matrix[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }

            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    list.add(matrix[endRow][j]);
                }
            }

            if (startCol < endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    list.add(matrix[i][startCol]);
                }
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        return list;
    }
}