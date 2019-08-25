/**
 * In this project we want a singlton object, which has thread-safe maker.
 * We want to avoid from synchroze for years just because one constructor.
 */

public class singelton_maker {
    //Volatile which avoid optimize of disorder creation.
    private volatile singelton_object someInstance;

    public singelton_object getInstance() {
        // local var in order to avoid RAM touch (as volatile do)
        singelton_object localInstance = someInstance;

        if (localInstance == null) {
            synchronized (this) {
                localInstance = someInstance;
                //Double check
                if (localInstance == null) {
                    someInstance = localInstance = new singelton_object();
                }
            }
        }
        return localInstance;
    }
}
