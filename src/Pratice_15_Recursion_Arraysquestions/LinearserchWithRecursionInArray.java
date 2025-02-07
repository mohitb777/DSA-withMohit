package Pratice_15_Recursion_Arraysquestions;

import java.util.ArrayList;

public class LinearserchWithRecursionInArray {
    public static void main(String[] args) {
            int[] arr ={5,2,5,3,4,5,5,6,7,8,9};
            //System.out.println(find3(arr,5,arr.length-1));
         //   findallindex(arr,5,0);
       // System.out.println(list);
        System.out.println(findallindexinside2(arr,5,0));

    }
    ///////////////////////////////////////////////////////////////
    static boolean find(int[] arr, int target, int index){
        //Base condition
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target  ||  find(arr,target,index+1);
    }
////////////////////////////////////////////////////////////////////////////////////
    static int find2(int[] arr, int target, int index) {
        // Base condition: If index reaches the end, return -1 (target not found)
        if (index == arr.length) {
            return -1;
        }
        // If the target is found, return its index
        if (arr[index] == target) {
            return index;
        }
        // Recur for the next index
        return find2(arr, target, index + 1);
    }
////////////////////////////////////////////////////////////////////////////////////////////
    static int find3(int[] arr, int target, int index) {
        // Base condition: If index reaches the end, return -1 (target not found)
        if (index == -1) {
            return -1;
        }
        // If the target is found, return its index
        if (arr[index] == target) {
            return index;
        }
        // Recur for the next index
        return find3(arr, target, index - 1);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
static ArrayList<Integer> list = new ArrayList<>();
     static void findallindex(int[] arr, int target, int index) {
        // Base condition: If index reaches the end, return -1 (target not found)
        if (index == arr.length) {
            return ;
        }
        // If the target is found, return its index
        if (arr[index] == target) {
            list.add(index);
        }
        // Recur for the next index
         findallindex(arr, target, index + 1);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static ArrayList<Integer> findallindexinside(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findallindexinside(arr, target, index + 1,list);
    }
////////////////////////////////////////////////////////////////////////////
    static ArrayList<Integer> findallindexinside2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
         if (index == arr.length) {
            return list;
        }
         //this will contain ans for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findallindexinside2(arr,target,index + 1);
          list.addAll(ansfrombelowcalls);
          return list;
     }
}

