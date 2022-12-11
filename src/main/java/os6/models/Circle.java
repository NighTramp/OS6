package os6.models;

import os6.data.Figure;
import os6.data.ILengthable;

public class Circle extends Figure implements ILengthable {
    private Double radius;

    private Circle(CircleBuilder circleBuilder) {
        this.radius = circleBuilder.radius;
        this.ID = GUID.incrementAndGet();
    }

    @Override
    public Integer getID() { return ID; }
    @Override
    public Double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public Double length() {
        return 2 * Math.PI * radius;
    }

    public static class CircleBuilder{
        private Double radius;

        public CircleBuilder(Double radius) {
            this.radius = radius;
        }
        public CircleBuilder check() {
            if (radius <= 0)
                throw new RuntimeException();
            return this;
        }
        public Circle build() {
            return new Circle(this);
        }
    }
}
