// Problem: Generate Binary Strings Without Adjacent Zeros
// Language: python

class Solution(object):
    def validStrings(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ls=[]
        x=2**n

        for i in range(n-1,x):
            e=str(str(bin(i)).split("b")[1])
            if len(e)<n:
                e="0"+e
            if "00" not in e:
                if len(e)==n:
                    ls.append(e)
        return ls