public class Obstacle {

    Vector2 pos;
    double radius;
    int r, g, b;

    public Obstacle(double x, double y, double r) {
        this.pos = new Vector2(x, y);
        this.radius = r;
        this.r = 0;
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
    }

    public void draw() {
//        PennDraw.setPenColor(200, 20, 150);
        PennDraw.setPenColor(r, g, b);
        PennDraw.filledCircle(pos.x, pos.y, radius);
    }
}
