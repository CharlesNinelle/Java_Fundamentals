package Les2.Oefening1_10_10.Oefening3_11_10;

public class Oefening2 {
    public static void main(String[] args) {
        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};
        //Check lengths of Arrays
        if (firstArray.length==secondArray.length){
        for (int i = 0; i< firstArray.length; i++){
            firstArray[i]=secondArray[i];
        }
        for (String str: firstArray) {
            System.out.println(str + " ");
        }
        }else{
            System.out.println("Verschillende arraylengtes kunen niet worden vervangen");
        }
    }
}