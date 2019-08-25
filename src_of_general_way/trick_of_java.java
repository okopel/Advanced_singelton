public class trick_of_java {

    public static singelton_object getInstance() {
        return SingeltonHolder.someInstance;
    }

    /**
     * The out static class will load at the loading time,
     * while the inner calss will load just on demand.
     */
    private static class SingeltonHolder {
        private static final singelton_object someInstance = new singelton_object();
    }
}
