class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len1= s1.length();
        int len2 = s2.length();

        if(len1!=len2){
            return false;
        }
        int diffNum=0;
        int[] id = new int[2];
        for (int i=0; i<len1;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(diffNum>=2){
                    return false;
                }
                id[diffNum++]=i;

            }
        }
        if(diffNum==0){
            return true;

        }
        if(diffNum==2){
            if(s1.charAt(id[0])==s2.charAt(id[1])&& s1.charAt(id[1])==s2.charAt(id[0])){
                return true;
            }
        }
        return false;
    }
}