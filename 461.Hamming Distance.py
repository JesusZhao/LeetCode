class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        # ^ 按位异或运算，相同为0，不同为1；内置函数count()方法用于统计字符串里某个字符出现的次数
        return bin(x ^ y).count('1')
