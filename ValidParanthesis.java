class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm= new HashMap<Character, Character>();
        hm.put('{','}');
        hm.put('(',')');
        hm.put('[',']');
        if(s.length()==2){
            if(hm.get(s.charAt(0))==s.charAt(1)){ 
                return true;
            }
            else
            return false;
        }
        if(s.length()%2==0 && s.length()>3){
            for(int i=0;i<s.length()-1;i++){ 
                char c = s.charAt(i);               
                if(hm.get(c)==s.charAt(i+1)){ 
                    i++;
                }
                if((i==s.length()-1) && (hm.get(c)==s.charAt(i+1))){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}