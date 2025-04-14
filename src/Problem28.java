public class Problem28 {
     public int strStr(String haystack, String needle) {
         char[] haystack_array = haystack.toCharArray();
         char[] needle_array = needle.toCharArray();
         int k = 0;
         try {
             for (int i = 0; i < haystack.length(); i++) {
                 if (haystack_array[i] == needle_array[0]) {
                     k++;
                     for(int j = 1; j < needle_array.length; j++) {
                         if (haystack_array[i + j] != needle_array[j]) {
                             k = 0;
                             break;
                         }
                         k++;
                     }
                 }
                 if(k == needle_array.length){
                     return i;
                 }
             }
         } catch(Exception e){
             return -1;
         }
         return -1;
    }
}
