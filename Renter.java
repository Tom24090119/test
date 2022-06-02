public class Renter extends customer{

    private int startSpan;
    private int endSpan;

    public Renter(String NameComparator, String carColour, Location coordinate, int startSpan, int endSpan)
    {
        super.NameComparator = NameComparator;
        super.carColour = carColour;
        super.coordinate = coordinate;
        this.startSpan = startSpan;
        this.endSpan = endSpan;
    }

    public Location getCoordinate()
    {
        return super.coordinate;
    }

}
