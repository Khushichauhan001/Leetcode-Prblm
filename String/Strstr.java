// leetcode 28 


class Solution {
    public int strStr(String haystack, String needle) {
       int n1 = haystack.length();
       int n2 = needle.length();

       if( n2 == 0 ){
        return 0;
       }


       if(n2 > n1){
        return -1;
       }
       int i = 0  , j=0 , start = 0 ;  // start = index value 

       while(i< n1 && j< n2 ){
       if(haystack.charAt(i) == needle.charAt(j)){
         if(i-start+1 == n2){
            return start;
         }
            i++;
            j++;

       }
       else {
        j=0 ;
        start++;
       i = start ; 

       }
       }
        return -1 ;
    }
}