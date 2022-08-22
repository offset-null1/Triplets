import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet{
    int a;
    int b;
    int c;

    public PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPythagorean(){
        return this.a * this.a + this.b * this.b == this.c * this.c;
    }

    public long calculateProduct(){
        return this.a * this.b * this.c;
    }

    public int calculateSum(){
        return this.a + this.b + this.c;
    }
}

class PythagoreanTripletBuilder{
    private int N;

    public PythagoreanTripletBuilder(int N){
        this.N = N;
    }

    public List<PythagoreanTriplet> build(){
        ArrayList results = new ArrayList<PythagoreanTriplet>();

        int a, b, c = 0;
        int m = 2;

        while(c < N){
            for(int n=1; n < m; n++){
                a = m * m - n * n;
                b = 2 * m * m;
                c = m * m + n * n;
            
                if (c > N)
                    break;
                PythagoreanTriplet isValidTriplet = new PythagoreanTriplet(a,b,c);
                results.add(isValidTriplet);
            }
            m++;
        }
    
    return results;
            
    }

    
}
