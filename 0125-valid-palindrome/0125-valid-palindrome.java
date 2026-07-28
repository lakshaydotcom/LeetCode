class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String n = "";
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                n += ch;
            }
        }
        StringBuilder dup = new StringBuilder(n);
        int i = 0;
        int j = dup.length()-1;
        while(i<j){
            char temp = dup.charAt(i);
            dup.setCharAt(i,dup.charAt(j));
            dup.setCharAt(j,temp);
            i++;
            j--;
        }
        if (dup.toString().equals(n)){
            return true;
        }
        else{
            return false;
        }
    }
}