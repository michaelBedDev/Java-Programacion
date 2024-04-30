package systemoutprintln;

import java.util.function.Function;

public class OrdenadorHijo extends Computer {


    public OrdenadorHijo(int age, String color) {
        super(age, color);
    }

    OrdenadorHijo(Integer age, String color, Integer healty) {
        super(age, color, healty);
    }

   

    @Override
    public Double calculateValue(Double initialValue) {

        Function<Double, Double> function = super::calculateValue;
        final Double pcValue = function.apply(initialValue);
        return pcValue + (initialValue / 10);

    }
}
