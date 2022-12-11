package os6.Repository;

import os6.data.Figure;
import os6.data.ILengthable;
import os6.data.IPerimeterable;
import os6.data.IRepository;

import java.util.ArrayList;
import java.util.Collection;

public class FiguresRepository implements IRepository {
    private final Collection<Figure> figures;

    public FiguresRepository() {
        this.figures = new ArrayList<>();
    }

    @Override
    public void add(Object value) {
        figures.add((Figure) value);
    }

    public void allPerimeters(){
        System.out.printf("Figure perimeters:%n");
        for (Figure item: figures) {
            if (item instanceof IPerimeterable)
                System.out.printf("Figure area of %s/ID %s: %s%n",
                        item.getClass().getSimpleName(),
                        item.getID(),
                        (((IPerimeterable) item).perimeter()));
        }
        System.out.printf("%n");
    }
    public void allAreas(){
        System.out.printf("Figure areas:%n");
        for (Figure item: figures) {
            System.out.printf("Figure area of %s/ID %s: %s%n",
                    item.getClass().getSimpleName(),
                    item.getID(),
                    item.area());
        }
        System.out.printf("%n");
    }
    public void allLength(){
        System.out.printf("Figure lengths:%n");
        for (Figure item: figures) {
            if (item instanceof ILengthable)
                System.out.printf("Figure area of %s/ID %s: %s%n",
                    item.getClass().getSimpleName(),
                    item.getID(),
                    ((ILengthable) item).length());
        }
        System.out.printf("%n");
    }
}
