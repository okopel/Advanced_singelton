/**
 * In this project we want a singlton object, which has thread-safe maker.
 * We want to avoid from synchroze for years just because one constructor.
 */

public class singelton_maker {
    //Volatile which avoid opptimize of disorder creation.
    private volatile singelton_object instanceOfSingeltonObject;

    public singelton_object getInstance() {
        // local var in order to avoid RAM touch (as volatile do)
        singelton_object local_sing = instanceOfSingeltonObject;

        if (local_sing == null) {
            synchronized (this) {
                local_sing = instanceOfSingeltonObject;
                //Double check
                if (local_sing == null) {
                    instanceOfSingeltonObject = local_sing = new singelton_object();
                }
            }
        }
        return local_sing;
    }
}
