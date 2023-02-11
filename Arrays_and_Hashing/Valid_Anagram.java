
package Arrays_and_Hashing;

import java.util.HashMap;


public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
        
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        
        for(char c:sArray){
            if(h1.containsKey(c)){
                h1.put(c, h1.get(c) + 1);
            }
            else{
                h1.put(c, 1);
            }
        }
        
        for(char c:tArray){
            if(h2.containsKey(c)){
                h2.put(c, h2.get(c) + 1);
            }
            else{
                h2.put(c, 1);
            }
        }
        
        if(h1.equals(h2)){
            return true;
        }
        else{
            return false;
        }
    }
}
