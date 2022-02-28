public class Buffer {
    private final int BUFFER_SIZE = 10;
    private int[] buffer_array = new int[10];
    private int head;
    private int count;

    public Buffer() {
        count = BUFFER_SIZE;
        head = 0;
    }

    public boolean checkIfFull() {
        System.out.println(buffer_array.length);
        return false;
    }

    public int[] getArray() {
        return buffer_array;
    }

    public int get() throws CustomException {
        if (count == 10) {
            throw new CustomException("BUFFER IS EMPTY");
        } else {
            int value = buffer_array[head];
            buffer_array[head] = 0;
            count++;
            head = ((head + 1) + 10) % 10;
            return value;
        }
    }

    public void put(int val) throws CustomException {
        if (count > 0) {
            int placeAt = ((head - count) + 10) % 10;
            buffer_array[placeAt] = val;
            count--;
        } else {
            throw new CustomException("BUFFER IS FULL");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int entry : buffer_array) {
            sb.append(entry + " ");
        }
        return sb.toString();

    }
}
