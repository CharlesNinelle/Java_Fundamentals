package be.intecbrussel.Les4.Ofeninf2_2;

public class Ofening1_3 {
    public static void main(String[] args) {
        byte aNum = 10;
        int bNum = 5;
        long cNum =5L;
        //gebruik van relationele operaroren
        boolean result1 = aNum == bNum; // vergelijking voor gelijkheid
        boolean result2 = bNum != aNum; // vergelijking voor vergelijking
        boolean result3 = aNum > bNum; // vergelijking voor meer
        boolean result4 = bNum < aNum; // vergelijking voor minder
        boolean result5 = aNum >= bNum; // vergelijking van groter dan of gelijk aan
        boolean result6 = bNum <= aNum; // vergelijking van kleiner dan of gelijk aan

        //Resultaat
        System.out.println("aNum == bNum"+result1);
        System.out.println("bNum != aNum"+result2);
        System.out.println("aNum > bNum"+result3);
        System.out.println("bNum < aNum"+result4);
        System.out.println("aNum >= bNum"+result5);
        System.out.println("bNum <= aNum"+result6);

    }
}
