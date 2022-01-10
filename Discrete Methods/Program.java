import java.util.*;
import DifferentiableFunctions.*;

public class Program {
    public static void main(String[] args)
    {
        DifferentiableFunction f = new Logarithm(1, 1, 0, 0, 10);
        f.setRange(1, 1, 10);

        List<Double> approx = DiscreteMethods.EulersMethod(f, 0);

        int counter = 0;
        System.out.println("Input-Euler-Real");
        for (double i = f.initialValue; i <= f.finalValue; i += f.stepSize){
            System.out.print(i);
            System.out.print(" ");
            System.out.print(approx.get(counter));
            System.out.print(" ");
            System.out.println(f.baseFunction(i));
            counter++;
        }
    }
}
