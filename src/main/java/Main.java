import java.util.Arrays;

public class Main {

    public static final int SIZE_4_INDEX_STORAGE = 10;
    public static final int[] ARRAY_4_ARRAY_INDEX_STORAGE = new int[] {21, 22, 23, 24, 25};

    public static void main(String[] args) {
        IndexStorage indexStorage = new IndexStorage(SIZE_4_INDEX_STORAGE);
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(ARRAY_4_ARRAY_INDEX_STORAGE);
        System.out.println(Arrays.toString(indexStorage.reverse()));
        System.out.println(Arrays.toString(arrayIndexStorage.reverse()));
    }
}
