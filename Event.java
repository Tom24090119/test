public class Event extends customer {
    private int eventMonth;
    private int carCount;

    public Event(String NameComparator, String carColour, Location coordinate, int eventDay, int carCount)
    {
        super.NameComparator = NameComparator;
        super.carColour = carColour;
        super.coordinate = coordinate;
        this.eventMonth = eventDay;
        this.carCount = carCount;
    }
}
