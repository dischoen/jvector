import java.util.Vector;

public class X
{
	static int N = 20;
    Vector<C> cs;
	public static void main(String[] args) {
        X x = new X();
    }
    
    X() {
        // Circles erzeugen
		cs = make_Cs(N);

        dump("Alle Cs");
        // jeden zweiten wegschmeissen
        for(int i=N-1; i>=0; i-=2) {
            cs.remove(i);
        }
        // schauen, was übrig ist
        dump("Jeder 2. C");
	}
    
	public Vector<C> make_Cs(int n) {
		Vector<C> v = new Vector<>();
        for(int i=0; i<n; i++) {
            C c = new C(i,i*2,i*3);
            v.add(c);
        }
		return v;
	}
    public void dump(String header) {
        System.out.println(header);
        for(int i=0; i<cs.size(); i++) {
            cs.get(i).dump();
        }
    }

}
