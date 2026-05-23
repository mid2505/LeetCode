// Problem: Coupon Code Validator
// Language: java

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> l = new ArrayList<>();
        l.add("electronics");
        l.add("grocery");
        l.add("pharmacy");
        l.add("resturant");
        String c = "_qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        List<String> ans = new ArrayList<>();

        for(int i=0;i<code.length;i++){
            if(code[i].length()==0) isActive[i]=false;
            for(char ch : code[i].toCharArray()){
                if(c.indexOf(ch)==-1){
                    isActive[i]=false;
                    break;
                }
            }
        }
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        List<String> l4 = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(businessLine[i].equals("electronics") && isActive[i]) l1.add(code[i]);
        }
        for(int i=0;i<code.length;i++){
            if(businessLine[i].equals("grocery") && isActive[i]) l2.add(code[i]);
        }
        for(int i=0;i<code.length;i++){
            if(businessLine[i].equals("pharmacy") && isActive[i]) l3.add(code[i]);
        }
        for(int i=0;i<code.length;i++){
            if(businessLine[i].equals("restaurant") && isActive[i]) l4.add(code[i]);
        }
        l1.sort(null);
        l2.sort(null);
        l3.sort(null);
        l4.sort(null);
        
        ans.addAll(l1);
        ans.addAll(l2);
        ans.addAll(l3);
        ans.addAll(l4);

        return ans;
    }
}