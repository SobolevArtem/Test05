public class ArrayIndexStorage extends IndexStorage{
    protected int[] intArray;

    public ArrayIndexStorage(int[] intArray) {
        super(intArray.length);
        this.intArray = intArray;
    }

    @Override
    public int get(int index){
        return intArray[index];
    }

}
