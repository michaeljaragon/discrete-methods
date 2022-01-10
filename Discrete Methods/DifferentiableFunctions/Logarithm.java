package DifferentiableFunctions;
import java.lang.Math;

// Y = a * logBASE(x - h) + k
public class Logarithm extends DifferentiableFunction
{
    @Override
    public double baseFunction(double x) {
        return a * Math.log(b * x - h) / Math.log(base)  + k;
    }

    @Override
    public double derivativeFunction(double x) {
        return a * b / Math.log(base) / (x - h);
    }

    public double a;
    public double b;
    public double h;
    public double k;
    public double base;

    public Logarithm(double a, double b, double h, double k, double base) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.k = k;
        this.base = base;
    }
}

