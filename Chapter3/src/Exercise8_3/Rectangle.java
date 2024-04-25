package Exercise8_3;

public class Rectangle {
    private int height;
    private int width;
    private int xPos;
    private int yPos;

    public Rectangle(Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.xPos = rectangle.xPos;
        this.yPos = rectangle.yPos;
    }

    public Rectangle() {

    }

    public Rectangle(int height, int width, int xPos, int yPos) {
        this.height = height;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public double getArea() {
        return height * width;
    }

    public double getParametrs() {
        return height(width + height) * 2;
    }

    public void grow(int d) {
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }
}
    public void setHeight(int height){
        this.height=height<0? -height:height;
    }
    public void setWidth(int width){
        this.width=width<0? -width:width;
   }
    public  void  setPosition(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }
}


