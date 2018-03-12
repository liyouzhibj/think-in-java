class Art{
    Art(int i){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(int i){
        super(i);
        System.out.println("Drawing constructor");
    }

    private void say(){
        System.out.println("Hello");
    }
}

class Cartoon extends Drawing{
    Cartoon(int i){
        super(i);
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon(1);
        cartoon.say();
    }
}

