class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int[] arr = new int[26];
        int[] firstOccurence = new int[26];
        Arrays.fill(firstOccurence,-1);
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            int t = (int)ch;
            if(t >= 65 && t <= 90 && arr[ch-'A']==0 && firstOccurence[ch-'A']==-1){
                arr[ch-'A']++;
                firstOccurence[ch-'A']=i;
            }
            else if(t >= 97 && t <= 122 && arr[ch-'a']==1 && firstOccurence[ch-'a']<i){
                arr[ch-'a']=-1;
                //ans++;
            }

        }
        // display(arr);
        // display(firstOccurence);
        int ans = 0;
        // for(int i=0;i<n;i++){
        //     char ch = word.charAt(i);
        //     int t = (int)ch;
        //     if(t >= 97 && t <= 122 && firstOccurence[ch-'a']<i) arr[ch-'a']=-1;
        // }
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            int t = (int)ch;
            if(t >= 97 && t <= 122 && arr[ch-'a']==1 && firstOccurence[ch-'a']>i){
                arr[ch-'a']++;
                ans++;
            }
        }
        return ans;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }
}