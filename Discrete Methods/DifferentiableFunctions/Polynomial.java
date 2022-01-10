package DifferentiableFunctions;
import java.lang.Math;

// Y = a * (X - h) ^ exp + k
public class Polynomial extends DifferentiableFunction
{
    @Override
    public double baseFunction(double x) {
        return a * Math.pow(b * x - h, exp) + k;
    }

    @Override
    public double derivativeFunction(double x) {
        return a * b * exp * Math.pow(b * x - h, exp - 1);
    }

    public double a;
    public double b;
    public double h;
    public double k;
    public double exp;

    public Polynomial(double a,  double b, double h, double k, double exp) {
        this.a = a;
        this.h = h;
        this.k = k;
        this.exp = exp;
    }
}

