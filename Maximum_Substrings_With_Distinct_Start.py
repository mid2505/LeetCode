// Problem: Maximum Substrings With Distinct Start
// Language: python

class Solution(object):
    def maxDistinct(self, s):
        """
        :type s: str
        :rtype: int
        """
        return len(set(s))