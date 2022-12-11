package os6;

import os6.Repository.FiguresRepository;
import os6.data.Figure;
import os6.models.Circle;
import os6.models.Square;
import os6.models.Triangle;
import os6.models.Rectangle;


public class Main {
    public static void main(String[] args) {
        FiguresRepository repository = new FiguresRepository();
        repository.add(new Rectangle.RectangleBuilder(5.0, 2.0).check().build());
        repository.add(new Triangle.TriangleBuilder(3.0, 4.0, 5.0).check().build());
        repository.add(new Circle.CircleBuilder(10.0).check().build());
        repository.add(new Square.SquareBuilder(5.0).check().build());
        repository.add(new Square.SquareBuilder(6.0).check().build());

        repository.allAreas();
        repository.allPerimeters();
        repository.allLength();
    }
}