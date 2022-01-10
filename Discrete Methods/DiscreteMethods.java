import java.util.*;
import DifferentiableFunctions.*;

public class DiscreteMethods
{
    public static List<Double> EulersMethod(DifferentiableFunction f, double initialSolution){
        int counter = 0;
        List<Double> approximation = new ArrayList<Double>();

        approximation.add(0, initialSolution);

        for (double i = f.initialValue + f.stepSize; i <= f.finalValue; i += f.stepSize){
            approximation.add(counter + 1, approximation.get(counter) + f.stepSize * f.derivativeFunction(i));
            counter++;
        }
        
        return approximation;
    }   
}


