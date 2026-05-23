// Problem: Number of Steps to Reduce a Number in Binary Representation to One
// Language: java

import java.math.BigInteger;
class Solution {
    int count=0;
    BigInteger one = new BigInteger("1");
    BigInteger two = new BigInteger("2");
   public int numSteps(String s) {
        int x = s.length()-1;
        BigInteger num = new BigInteger("0");
        for(int i=0;i<s.length();i++){
            num = num.add(power(2,x--).multiply(BigInteger.valueOf(Integer.parseInt(""+s.charAt(i)))));
        }
        System.out.println(num);
        return isOne(num).intValue();
    }
    public BigInteger isOne(BigInteger n){
        if(n.equals(one)) return BigInteger.valueOf(count);
        BigInteger b = new BigInteger("0");
        if(n.mod(two).equals(b)){
            count++;
            return isOne(n.divide(two));
        }
        else{
            count++;
            return isOne(n.add(one));
        }
    }
    public BigInteger power(int base, int power){
        BigInteger p = new BigInteger(power+"");
        BigInteger ans = new BigInteger("1");
        for(int i=0;i<power;i++) ans = ans.multiply(BigInteger.valueOf(base));
        return ans;
    }
}