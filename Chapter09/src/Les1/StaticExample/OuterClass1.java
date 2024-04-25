package Les1.StaticExample;

public class OuterClass1 {
    private int outerX = 10;

    public static class InnerClass {
        private int staticInner = 5;

        public int getStaticInner() {
            return staticInner;
        }

        public void setStaticInner(int staticInner) {
            this.staticInner = staticInner;
        }

        public int getOuterX() {
            return getOuterX();
        }


        public int setOuterX() {
            return setOuterX();
        }


    }
}


