package creational.prototype.codePrototypeTask;

class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    private Line(Line other) {
        start = new Point(other.start);
        end = new Point(other.end);
    }

    public Line deepCopy() {
        return new Line(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
