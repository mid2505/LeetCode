// Problem: Kth Distinct String in an Array
// Language: java

class Solution {
    public String kthDistinct(String[] arr, int k) {
        boolean flag;
        List<String> l = new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            flag = true;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j]) && i!=j){
                    flag = false;
                    break;
                }
            }
            if(flag) l.add(arr[i]);
        }
        for(int j=0;j<l.size();j++){
            System.out.println(l.get(j));
        }
        if(k>l.size()) return "";
        return l.get(k-1);
    }
}