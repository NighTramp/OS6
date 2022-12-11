package os6.data;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Figure {
    protected static final AtomicInteger GUID = new AtomicInteger(0);
    protected Integer ID;
    public abstract Double area();
    public abstract Integer getID();
}
