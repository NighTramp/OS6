package os6.data;

public class Poligon extends Figure implements IPerimeterable{
    protected Double[] sides;
    protected Poligon(Double... sides) {
        this.sides = sides;
        this.ID = GUID.incrementAndGet();
    }
    @Override
    public Double area() {
        return null;
    }
    @Override
    public Double perimeter() {
        Double x = 0.0;
        for (Double i: sides) {
            x += i;
        }
        return x;
    }
    public Integer getID() { return ID; }
}
