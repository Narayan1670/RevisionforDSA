package patterns;

public class MergeSortAlgo {

    public static void main(String[] args) {

    }
    public static void  MergeSortRec(int l ,int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            MergeSortRec(l ,mid);
            MergeSortRec(mid + 1, h);
            Merge(l, mid, h);
        }
    }

    private static void Merge(int l, int mid, int h) {

    }
}
