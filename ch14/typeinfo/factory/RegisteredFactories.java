class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
    static {
        partFactories.add();
    }

}

class Filter extends Part {
}

class FullFilter extends Filter {
    public static class Factory implements Factory<FullFilter>{
        public FullFilter create(){
            return new FullFilter();
        }
    }
}
