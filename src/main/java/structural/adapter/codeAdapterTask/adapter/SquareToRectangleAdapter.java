package structural.adapter.codeAdapterTask.adapter;

import structural.adapter.codeAdapterTask.model.Rectangle;
import structural.adapter.codeAdapterTask.model.Square;

public class SquareToRectangleAdapter implements Rectangle {
    private static Square square;

    public SquareToRectangleAdapter(Square square) {
        SquareToRectangleAdapter.square = square;
    }

    @Override
    public int getWidth() {
        return square.side;
    }

    @Override
    public int getHeight() {
        return square.side;
    }

    @Override
    public int getArea() {
        return square.side * square.side;
    }
}
