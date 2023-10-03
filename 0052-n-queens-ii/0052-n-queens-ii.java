class Solution {
        public boolean isValid(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q') return false;
        }
        //vertical
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]=='Q') return false;
        }
        //upperleft
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q') return false;
        }
        // upper right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q') return false;
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q') return false;
        }
        //lower right
        r=row;
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q') return false;
        }
        return true;
    }
    public void add(char[][] board,List<List<String>> ans){
        String row="";
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q') row+='Q';
                else row+='.';
            }
            res.add(row);
        }
        ans.add(res);
    }
    public void helper(char[][] board,List<List<String>> ans,int col){
        if(col==board.length){
            add(board,ans);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isValid(row,col,board)){
                board[row][col]='Q';
                helper(board,ans,col+1);
                board[row][col]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
          char[][] board=new char[n][n];
          helper(board,ans,0);
          return ans.size();
    }
}