

# Sharpe

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [java.util.List<BigDecimal>](java.util.List<BigDecimal>.md)

## Example
```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.models.Sharpe;
import com.factset.sdk.ProposalGenerationEngine.models.BigDecimal;
import com.factset.sdk.ProposalGenerationEngine.models.java.util.List<BigDecimal>;

public class Example {
    public static void main(String[] args) {
        Sharpe exampleSharpe = new Sharpe();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set Sharpe to BigDecimal
        exampleSharpe.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleSharpe.getActualInstance();

        // create a new java.util.List<BigDecimal>
        java.util.List<BigDecimal> examplejava.util.List<BigDecimal> = new java.util.List<BigDecimal>();
        // set Sharpe to java.util.List<BigDecimal>
        exampleSharpe.setActualInstance(examplejava.util.List<BigDecimal>);
        // to get back the java.util.List<BigDecimal> set earlier
        java.util.List<BigDecimal> testjava.util.List<BigDecimal> = (java.util.List<BigDecimal>) exampleSharpe.getActualInstance();
    }
}
```


