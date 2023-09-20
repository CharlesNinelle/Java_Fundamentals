package be.intecbrussel.Les3.Ofeninf2.Ofeninf2;

public class ofening3 {
    public static void main(String[] args) {
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5;

// Vvergelijking aNum и bNum
        boolean aNumEqualsBNum = aNum == bNum; //   Resultaat  : false
        boolean aNumNotEqualsBNum = aNum != bNum; // Resultaat  : true
        boolean aNumLessThanBNum = aNum < bNum; // Resultaat  : false
        boolean aNumGreaterThanBNum = aNum > bNum; //  Resultaat  : true
        boolean aNumLessOrEqualsBNum = aNum <= bNum; //  Resultaat  : false
        boolean aNumGreaterOrEqualsBNum = aNum >= bNum; //  Resultaat  : true

// Vergelijking bNum и cNum
        boolean bNumEqualsCNum = bNum == cNum; //  Resultaat  : true
        boolean bNumNotEqualsCNum = bNum != cNum; //  Resultaat  : false
        boolean bNumLessThanCNum = bNum < cNum; // Resultaat  : false
        boolean bNumGreaterThanCNum = bNum > cNum; //  Resultaat  : false
        boolean bNumLessOrEqualsCNum = bNum <= cNum; //  Resultaat  : true
        boolean bNumGreaterOrEqualsCNum = bNum >= cNum; // Resultaat  : true
    }
}
