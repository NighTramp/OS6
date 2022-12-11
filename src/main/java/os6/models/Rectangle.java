package os6.models;

import os6.data.Poligon;

public class Rectangle extends Poligon {
    public Rectangle(RectangleBuilder rectangleBuilder) {
        super(rectangleBuilder.sides);
    }
    protected Rectangle(Double... sides) {
        super(sides);
    }
    @Override
    public Double area() {
        return sides[0] * sides[1];
    }
    @Override
    public Double perimeter() {
        return super.perimeter() * 2;
    }

    public static class RectangleBuilder{
        private Double[] sides;
        public RectangleBuilder(Double... sides) {
            this.sides = sides;
        }
        public RectangleBuilder check() {
            if (sides.length != 2)
                throw new RuntimeException();
            for (Double item:sides) {
                if (item <= 0)
                    throw new RuntimeException();
            }
            return this;
        }
        public Rectangle build() {
            return new Rectangle(this);
        }
    }

}
