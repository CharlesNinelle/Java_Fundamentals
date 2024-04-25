package Les3;

public enum Color {
    RED(100),
    YELLOW(200),
    BLUE(300);

    //Field
    private int colorCode;

    //Constractor
    private Color(int colorCode){
        this.colorCode=colorCode;
    }
    //Methodes
    int getColorCode(){
        return  colorCode;
    }
    public void colorInfo(){
        System.out.println("Universal Color");
    }

}
