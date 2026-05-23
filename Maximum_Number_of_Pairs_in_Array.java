// Problem: Maximum Number of Pairs in Array
// Language: java

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count=0;
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        int[] arr = new int[2];
        arr = find_pair(l);
        while(true){
            if(arr[0]!=-1 && arr[1]!=-1){
                count++;
                l.remove(arr[1]);
                l.remove(arr[0]);
                arr = find_pair(l);
            }
            else{
                arr[0] = count;
                arr[1] = l.size();
                break;
            }
        }
        return arr;
    }
    public int[] find_pair(List<Integer> l){
        int[] arr = new int[2];
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
                if(l.get(i)==l.get(j)){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
}