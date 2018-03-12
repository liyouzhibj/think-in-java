public class DotThis {
    void f() {
        System.out.println("DotThis().f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        // DotThis dotThis = new DotThis();
        // Inner dti = dotThis.inner();
        // dti.outer().f();
        
        // wrong!!!
        // Inner inner = new Inner();
        
        Inner in = new DotThis().new Inner();
        in.outer().f();

        Inner inner = new DotThis().inner();
        inner.outer().f();
    }
}