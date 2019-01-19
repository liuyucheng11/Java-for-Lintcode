public class Nqueen {
    /*
     * @param n: The number of queens
     * @return: All distinct solutions
     */
    public List<List<String>> solveNQueens(int n) {
        int[][] map = new int[n][n];
        List<List<String>> result = new ArrayList<>();
        //book标记map[i][j]处是否存放
        int[] book = new int[n+1];
        place(map, 0, n, book, result);
        return result;

    }

    void place(int map[][], int k, int n, int book[], List<List<String>> result) {
        if (k > n-1) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuffer rowResult = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1)
                        rowResult.append("Q");
                    else rowResult.append(".");
                }
                String a = new String(rowResult);
                //一行的遍历
                temp.add(a);
            }
            //重置棋盘
            result.add(temp);

            return;
        }
        for (int i = 0; i < n; i++) {
            book[k] = i;
            if (check(k, book)) {
                map[k][i] = 1;
                place(map, k + 1, n, book, result);
                map[k][i] = 0;

                //递归结束重置这个点下次循环
            }


        }
    }

    boolean check(int row, int book[]) {
        for (int i = 0; i < row; i++) {
            if (book[i] == book[row] || Math.abs(row - i) == Math.abs(book[row]-book[i])) {
                return false;
            }
        }
        return true;
    }

}