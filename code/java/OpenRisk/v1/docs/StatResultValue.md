

# StatResultValue

Floating point double(s) in a dimension corresponding to the calculation-level. Data is guaranteed to be present and non-empty if the HTTP status code is 200 Success

## oneOf schemas
* [Double](Double.md)
* [StatResultValueSparseMatrix](StatResultValueSparseMatrix.md)
* [java.util.List<Double>](java.util.List<Double>.md)
* [java.util.List<java.util.List<Double>>](java.util.List<java.util.List<Double>>.md)

## Example
```java
// Import classes:
import com.factset.sdk.OpenRisk.models.StatResultValue;
import com.factset.sdk.OpenRisk.models.Double;
import com.factset.sdk.OpenRisk.models.StatResultValueSparseMatrix;
import com.factset.sdk.OpenRisk.models.java.util.List<Double>;
import com.factset.sdk.OpenRisk.models.java.util.List<java.util.List<Double>>;

public class Example {
    public static void main(String[] args) {
        StatResultValue exampleStatResultValue = new StatResultValue();

        // create a new Double
        Double exampleDouble = new Double();
        // set StatResultValue to Double
        exampleStatResultValue.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleStatResultValue.getActualInstance();

        // create a new StatResultValueSparseMatrix
        StatResultValueSparseMatrix exampleStatResultValueSparseMatrix = new StatResultValueSparseMatrix();
        // set StatResultValue to StatResultValueSparseMatrix
        exampleStatResultValue.setActualInstance(exampleStatResultValueSparseMatrix);
        // to get back the StatResultValueSparseMatrix set earlier
        StatResultValueSparseMatrix testStatResultValueSparseMatrix = (StatResultValueSparseMatrix) exampleStatResultValue.getActualInstance();

        // create a new java.util.List<Double>
        java.util.List<Double> examplejava.util.List<Double> = new java.util.List<Double>();
        // set StatResultValue to java.util.List<Double>
        exampleStatResultValue.setActualInstance(examplejava.util.List<Double>);
        // to get back the java.util.List<Double> set earlier
        java.util.List<Double> testjava.util.List<Double> = (java.util.List<Double>) exampleStatResultValue.getActualInstance();

        // create a new java.util.List<java.util.List<Double>>
        java.util.List<java.util.List<Double>> examplejava.util.List<java.util.List<Double>> = new java.util.List<java.util.List<Double>>();
        // set StatResultValue to java.util.List<java.util.List<Double>>
        exampleStatResultValue.setActualInstance(examplejava.util.List<java.util.List<Double>>);
        // to get back the java.util.List<java.util.List<Double>> set earlier
        java.util.List<java.util.List<Double>> testjava.util.List<java.util.List<Double>> = (java.util.List<java.util.List<Double>>) exampleStatResultValue.getActualInstance();
    }
}
```


