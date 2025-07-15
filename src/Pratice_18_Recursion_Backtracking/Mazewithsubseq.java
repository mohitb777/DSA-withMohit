package Pratice_18_Recursion_Backtracking;

import java.util.ArrayList;

public class Mazewithsubseq {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
      //  path("",3,3);
       // System.out.println(pathRETdigonal("",3,3));
     boolean[][] board ={
             {true,true,true},
             {true,false,true},
             {true,true,true},
     };
     pathRES("",board,0,0);
    }
    static int count (int r , int c){
        if (r == 1 || c== 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;

    }
    static void path(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            path(p + 'D',r-1,c);
        }
        if (c>1){
            path(p+ 'R',r,c-1);
        }
    }

    static ArrayList<String> pathRETdigonal(String p, int r, int c){
        if (r==1 && c==1){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(  pathRETdigonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1){
         list.addAll(   pathRETdigonal(p + 'v',r-1,c));
        }
        if (c>1){
            list.addAll(pathRETdigonal(p+ 'H',r,c-1));
        }
        return list;
    }
    static void pathRES(String p, boolean [][] maze,int r, int c){
     if (r== maze.length-1 && c== maze[0].length -1){
       // if (r == 3 && c == 3){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length-1){
            pathRES(p + 'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            pathRES(p+ 'R', maze,r,c+1);
        }
    }

}





