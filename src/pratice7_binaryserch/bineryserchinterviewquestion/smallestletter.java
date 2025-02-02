package pratice7_binaryserch.bineryserchinterviewquestion;

public class smallestletter {

        public static void main(String[] args) {
            char[]a = {'a','d','f','g','h','i','j','k'};
            char t ='d';
          //  char ans = letters(a,t);
            System.out.println(letters(a,t));

        }
        static char letters(char[]letter, char target){
            if (target >letter[letter.length-1]){
                return ('n');
            }
            int start =0;
            int end = letter.length-1;
            while (start <= end){
                int mid = start + (end - start) / 2 ;
                if(target < letter[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return letter[start % letter.length] ;

        }
    }

