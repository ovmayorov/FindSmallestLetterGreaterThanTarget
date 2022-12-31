public class Main {
    public static void main(String[] args) {
/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.


 */
        char[] letters = {'e', 'e', 'e', 'k', 'q', 'q', 'q', 'v', 'v', 'y'};
        char target = 'r';
        char result = nextGreatestLetter(letters, target);
        System.out.println("Result = " + result);

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;
        if(target< letters[0] || target>= letters[letters.length-1]){
            return letters[0];
        }

        while(left+1<right){
            int mid = (left+right)/2;
            if(letters[mid] == target && letters[mid+1]>target){
                return letters[mid+1];
            }
            else if(letters[mid]>target){
                right=mid;
            }
            else if(letters[mid]<=target){
                left=mid;
            }

        }
        return letters[right];
        
    }
}