package Algorithm.neolo.cn;

/**
 * Created by Neolo on 2017/5/10.
 */
public class QuickUnionUF {
    private int[] id;
    //快速合并算法 图img/02

    /**
     * 当树很高的时间会花费很多时间
     * @param N
     */
    public QuickUnionUF(int N) {
        id  = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i){
        while (i!= id[i])
            i = id[i];
        return i;
    }


    public boolean connected(int p,int q){
        return root(p)==root(q);
    }
    public void union(int p,int q){
        int i = root(p);
        int j = root(q);
        //连接的时候带权 就可以避免生成比较高的大树
        id[i] = j;
    }
}

