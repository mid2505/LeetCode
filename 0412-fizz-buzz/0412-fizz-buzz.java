class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        // int three=0;
        // int five=0;
        // int both=0;
        // for(int i=1;i<=n;i++){
        //     if(both==14){
        //         l.add("FizzBuzz");
        //         both=0;
        //         three=0;
        //         five=0;
        //     }
        //     else if(three==2){
        //         l.add("Fizz");
        //         three=0;
        //         five++;
        //         both++;
        //     }
        //     else if(five==4){
        //         l.add("Buzz");
        //         five=0;
        //         three++;
        //         both++;
        //     }
        //     else{
        //         l.add(i+"");
        //         five++;
        //         three++;
        //         both++;
        //     }
        // }
        // return l;
        String[] arr = {"","","Fizz","","Buzz","Fizz","","","Fizz","Buzz","","Fizz","","","FizzBuzz"}; 
        int x = 0;
        for(int i=1;i<=n;i++){
            if(arr[x].equals("")) l.add(i+"");
            else l.add(arr[x]);
            x++;
            if(x==15) x=0;
        }
        return l;
    }
}