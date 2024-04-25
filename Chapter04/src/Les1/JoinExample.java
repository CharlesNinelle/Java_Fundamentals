package Les1;

public class JoinExample {
    public static void main(String[] args) {
        String[]strArrayToString =
                {"Intec","Brussels","is","best"};
        String itIsNowAString = String.join(" ",strArrayToString);
        String itIsNowAStringWithHyphen=String.join("-",strArrayToString);
        System.out.println(itIsNowAString);
        System.out.println(itIsNowAStringWithHyphen);
    }
}
