public class Robot {
    // assume that these are set/nonnull
    private Drivebase drivebase;
    private NavigationalState navigationalState;

    public void moveTo(float x, float y, float heading) {
        moveTo(new Vector2F(x, y), heading);
    }
    //to find the vector sub yours and target
    // TODO: implement this
    public void moveTo(Vector2F targetPosition, float targetHeading) {
        // move to the given position and heading
        // you should only have to use things that are within these files
        rotate(normalizeRadians(targetPosition) - getHeading());
        forwardDrive(subtract(targetPosition).getMagnitude());
    }
}
