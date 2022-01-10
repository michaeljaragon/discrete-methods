package DifferentiableFunctions;

public abstract class DifferentiableFunction {
    // Using like an interface
    public double baseFunction(double x){
        return 0;
    }
    public double derivativeFunction(double x){
        return 0;
    }
    public void setRange(double initial, double step, double finalValue){
        this.initialValue = initial;
        this.stepSize = step;
        this.finalValue = finalValue; 
    }

    public double initialValue;
    public double stepSize;
    public double finalValue;
}

