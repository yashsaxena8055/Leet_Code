class Solution {
    public boolean isValidSudoku(char[][] board) {
    
         HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                if(set.contains(board[i][j]))
                {
              
                   return false;
                }
                else
                    set.add(board[i][j]);
            }
            set.removeAll(set);
        }
         set.removeAll(set);
         for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[j][i]=='.')
                    continue;
                if(set.contains(board[j][i]))
                {
                   return false;
                }
                else
                    set.add(board[j][i]);
            }
              set.removeAll(set);
        }
         set.removeAll(set);
        
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                for(int k=0;k<3;k++)
                {
                    for(int l=0;l<3;l++)
                    {
                        if(board[k+i][l+j]=='.')
                            continue;
                        if(set.contains(board[k+i][l+j]))
                        {
                            return false;
                        }
                        else{
                            set.add(board[k+i][l+j]);
                        }
                        
                    }
                }
                 set.removeAll(set);
            }
        }
        return true;
    }
}
