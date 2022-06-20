// can't solve some tricky boards
class Solution {
    public void solveSudoku(char[][] board) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>(9);  // store numbers that exist in each row
        List<List<Integer>> columns = new ArrayList<List<Integer>>(9); // store numbers that exist in each column
        List<List<Integer>> square = new ArrayList<List<Integer>>(9); // store numbers that exist each square
        int solved = 0;
        for (int i = 0; i < 9; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < 9; j++) {
                 if (board[i][j] != '.') {
                      int value = Character.getNumericValue(board[i][j]);
                      temp.add(value);
                      solved++;
                 }
            }  
            rows.add(i,temp);
        }
        
        for (int i = 0; i < 9; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < 9; j++) {
                 if (board[j][i] != '.') {
                      int value = Character.getNumericValue(board[j][i]);
                      temp.add(value);
                 }
            }  
            columns.add(i,temp);
        }
        
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                List<Integer> temp = new ArrayList<Integer>();
                for (int k = 0; k < 3; k++) {
                    for (int w =0; w < 3; w++) {
                        if (board[w + i*3][k + j*3] != '.') {
                            int value = Character.getNumericValue(board[w + i*3][k + j*3]);
                            temp.add(value);
                        } 
                    }
                }
                square.add(count,temp);
                count++;
            }
        }
        
        List<List<Integer>> sudoku = new ArrayList<List<Integer>>(81); // possible solution for every cell
        for (int i = 0; i < 81; i++) {
            List<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)); // initialize it to 1-9
            sudoku.add(num);
        } 
        while(solved < 81) {
            for (int i = 0; i < 9; i++) {
                 for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        List<Integer> temp1 = new ArrayList<Integer>();
                        List<Integer> temp2 = new ArrayList<Integer>();
                        List<Integer> temp3 = new ArrayList<Integer>();
                        List<Integer> temp4 = new ArrayList<Integer>();
                        temp1 = rows.get(i);
                        temp2 = columns.get(j);
                        temp3 = square.get((j/3) + 3*(i/3));
                        temp4 = sudoku.get(j + i*9);
        // check if number is already in the corresponded row or column or square
                        for (Integer k = 1; k < 10; k++) {  
                            if (temp1.contains(k) || temp2.contains(k) || temp3.contains(k)) {
                                temp4.remove(k);
                            }
                        }
                        printBoard(board, solved);  //for debugging
        // if there is only 1 possible solution, fill in the cell, and update the condition of every row, column, square
                        if (temp4.size() == 1) {  
                                    int answer = temp4.get(0);
                                    board[i][j] = (char)(answer +'0');
                                    solved++;
                                    temp1.add(answer);
                                    temp2.add(answer);
                                    temp3.add(answer);
                                    rows.remove(i);
                                    columns.remove(j);
                                    square.remove((j/3) + 3*(i/3));
                                    rows.add(i, temp1);
                                    columns.add(j, temp2);
                                    square.add((j/3) + 3*(i/3), temp3);
                        }
                        
                    }
                 }  
            }
        }     
    }
    // for debugging
    private void printBoard (char[][] c, int s) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(s);
    }
}
        
