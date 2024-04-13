package attendance;

public class Attendance {
    private boolean isPresent;

    public Attendance(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public String toString() {
        return "Attendance: " + (isPresent ? "Present" : "Absent");
    }
}
