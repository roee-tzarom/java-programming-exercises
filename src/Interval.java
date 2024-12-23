public class Interval {
    private double _left;
    private double _right;

    public Interval(double left, double right) {
        if (left <= right) {
            this._left = left;
            this._right = right;
        }
        else {
            this._left = right;
            this._right = left;
        }
    }

    public boolean contains(double x) {
        return (x >= this._left && x <= this._right);
    }

    public boolean intersects(Interval b) {
        Interval NewInterval = new Interval(this._left, this._right);
        return (NewInterval.contains(b._left) || NewInterval.contains(b._right));
    }

    @Override
    public String toString() {
        String Interval = "(" + this._left + "-" + this._right + ")";
        return Interval;
    }


}
