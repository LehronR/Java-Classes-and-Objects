public class Holiday {
//    VARIABLES
    private String name = null;
    private int day = 0;
    private int month = 0;
    private String song = null;
//    CONSTRUCTORS
    public Holiday() {}
    public Holiday(int day, int month) {
        setDay(day);
        setMonth(month);
    }
    public Holiday(String name, int day, int month, String song) {
        setName(name);
        setDay(day);
        setMonth(month);
        setSong(song);
    }
//    SET METHODS
    public void setName(String name) {
        this.name = name;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setSong(String song) {
        this.song = song;
    }
//    GET METHODS
    public String getName() {
        return name;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public String getSong() {
        return song;
    }
//    ACTION METHODS
    public static boolean isSameMonth(Holiday h1, Holiday h2) {
        return h1 == h2;
    }
    public String funFact() {
        return name + " is on day " + day + " of month " + month + ". A popular song to celebrate this holiday is " + song;
    }

    public static void main(String[] args) {
        Holiday halloween = new Holiday("halloween", 31, 10, "Thriller");
        System.out.println(halloween.getName());
        System.out.println(halloween.getDay());
        System.out.println(halloween.getMonth());
        System.out.println(halloween.getSong());
        System.out.println(halloween.funFact());
        Holiday christmas = new Holiday();
        christmas.setName("Christmas");
        christmas.setDay(25);
        christmas.setMonth(12);
        christmas.setSong("Santa Clause is Coming to Town");
        System.out.println(christmas.getName());
        System.out.println(christmas.getDay());
        System.out.println(christmas.getMonth());
        System.out.println(christmas.getSong());
        System.out.println(christmas.funFact());
        System.out.println(Holiday.isSameMonth(christmas, halloween));
    }
}
