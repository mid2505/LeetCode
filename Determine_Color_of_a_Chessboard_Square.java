// Problem: Determine Color of a Chessboard Square
// Language: java

class Solution {
    public boolean squareIsWhite(String coordinates) {
        if((((int)coordinates.charAt(0))%2==0 && ((int)coordinates.charAt(1))%2==0) || (((int)coordinates.charAt(0))%2!=0 && ((int)coordinates.charAt(1))%2!=0)) return false;
        else return true;
    }
}