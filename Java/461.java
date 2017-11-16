class Solution {
    public int hammingDistance(int x, int y) {
        x = x^y;// 求出有多少位不同
        y=0;
        while(x!=0){// 求1的个数
            y++;
            x = (x-1)&x;
        }
        return y;
    }
}