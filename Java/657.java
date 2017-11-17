class Solution {
    public boolean judgeCircle(String moves) {
        moves += " ";
        // 可以直接使用split函数，切割后的数组长度即为相应的方向的个数，只要左右相等且上下相等即可
        return moves.split("L").length==moves.split("R").length&&moves.split("U").length==moves.split("D").length;
    }
}