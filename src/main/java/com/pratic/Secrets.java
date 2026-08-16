public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    //O problema pedia que onde tivesse um bit 1 em mask, trocasse o bit de value para 0
    public static int clearBits(int value, int mask) {
        return ~mask & value;
    }
}