package leetcode;

/**
 * Created by p.chen on 2016/4/6.
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you
 * take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * <p>
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game
 * given the number of stones in the heap.
 * <p>
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove,
 * the last stone will always be removed by your friend.
 */
public class NimGame {
    /**
     * 数学归纳法，如果是4必输，假设4k必输，那4(k+1)=4k+4也是必输
     * @param n
     * @return
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
