package Les1;

public class SplitExample {
    public static void main(String[] args) {
        String myStr = "Java is the best";
        String[] strArray =myStr.split("");
        System.out.println("String: "+myStr);
        for ( int index = 0; index<strArray.length;index++){
            System.out.println("Index:"+index+"value of element:"+strArray[index]);

        }
    }

}
