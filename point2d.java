
public class point2d {

    public int x;
    public int y;
    public point2d(int valuex, int valuey) {
        x=valuex;
        y=valuey;
    }
    public String getInfo() {
        return String.format("x:, h:"); }
    @Override
public String toString() {
    return getInfo();
 
    }
}
