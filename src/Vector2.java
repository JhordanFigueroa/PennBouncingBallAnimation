public class Vector2 {
    double x;
    double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Need to rescale the scale of draw based on math.random
    public Vector2 times(double c) {
        return new Vector2(x * c, y * c);
    }

    public Vector2 minus(Vector2 v2) {
        return new Vector2(this.x - v2.x, this.y - v2.y);
    }

    public Vector2 plus(Vector2 v2) {
        return new Vector2(this.x + v2.x, this.y + v2.y);
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }
    public Vector2 normalized() {
        double len = this.length();
        return new Vector2(this.x / len, this.y / len);
    }

    public double distanceTo(Vector2 v2) {
        Vector2 diff = this.minus(v2);
        return diff.length();
    }

    public double dot(Vector2 v2) {
        return this.x * v2.x + this.y * v2.y;
    }

    public Vector2 reflect(Vector2 normal) {
        // r = d - 2 * dot(d, n) * n
        double dotprod = this.dot(normal);
        Vector2 result = normal.times(dotprod);
        result = result.times(2.0);
        return this.minus(result);
    }
}
