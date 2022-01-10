package DifferentiableFunctions;
import java.lang.Math;

// Y = a * (X - h) ^ exp + k
public class AbsoluteValue extends DifferentiableFunction
{
    @Override
    public double baseFunction(double x) {
        return a * Math.abs(b * x - h);
    }

    @Override
    public double derivativeFunction(double x) {
        return a * b * Math.abs(b * x - h) / x;
    }

    public double a;
    public double b;
    public double h;
    public double k;
    public double exp;

    public AbsoluteValue(double a, double b, double h, double k) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.k = k;
    }
}

