import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {

    @Test
    public void firstIndexReverse() {
        IndexStorage indexStorage = new IndexStorage(Main.SIZE_4_INDEX_STORAGE);
        int expected = indexStorage.get(indexStorage.size()-1);
        int actual = indexStorage.reverse()[0];
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void lastIndexReverse() {
        IndexStorage indexStorage = new IndexStorage(Main.SIZE_4_INDEX_STORAGE);
        int expected = indexStorage.get(0);
        int actual = indexStorage.reverse()[indexStorage.size()-1];
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void firstArrayIndexReverse() {
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(Main.ARRAY_4_ARRAY_INDEX_STORAGE);
        int expected = arrayIndexStorage.get(arrayIndexStorage.size()-1);
        int actual = arrayIndexStorage.reverse()[0];
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void lastArrayIndexReverse() {
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(Main.ARRAY_4_ARRAY_INDEX_STORAGE);
        int expected = arrayIndexStorage.get(0);
        int actual = arrayIndexStorage.reverse()[arrayIndexStorage.size()-1];
        Assertions.assertEquals(expected,actual);
    }
}
