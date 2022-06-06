public class C
{
    int mx;
    int my;
    int mr;
    
    C(int x, int y, int r) {
        mx=x;
        my=y;
        mr=r;
    }
    void dump() {
        System.out.println(String.format("  X %d X %d R %d", mx, my, mr));
    }
}
