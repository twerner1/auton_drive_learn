public class Vector2F {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2F(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // for all of these functions, you are allowed to use java Math builtins only.
    // TODO: implement this
    public Vector2F subtract(Vector2F subtrahend) {
        int nx = getX() - subtrahend.getX();
				int ny = getY() - subtrahend.getY();
				return Vector2F(nx,ny);
    }

    // TODO: implement this
    public float getAngle() {
        // get the angle CCW from the +x axis
		//arctan(frac)
		return Math.atan(getY()/getX());
    }

    // TODO: implement this
    public float getMagnitude() {
        // get the magnitude of the vector
        return sqrt(sqr(getX())+sqr(getY()));
    }
}
