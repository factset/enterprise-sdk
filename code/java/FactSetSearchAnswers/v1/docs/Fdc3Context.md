

# Fdc3Context

## oneOf schemas
* [Fdc3Country](Fdc3Country.md)
* [Fdc3Instrument](Fdc3Instrument.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Context;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Country;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Instrument;

public class Example {
    public static void main(String[] args) {
        Fdc3Context exampleFdc3Context = new Fdc3Context();

        // create a new Fdc3Country
        Fdc3Country exampleFdc3Country = new Fdc3Country();
        // set Fdc3Context to Fdc3Country
        exampleFdc3Context.setActualInstance(exampleFdc3Country);
        // to get back the Fdc3Country set earlier
        Fdc3Country testFdc3Country = (Fdc3Country) exampleFdc3Context.getActualInstance();

        // create a new Fdc3Instrument
        Fdc3Instrument exampleFdc3Instrument = new Fdc3Instrument();
        // set Fdc3Context to Fdc3Instrument
        exampleFdc3Context.setActualInstance(exampleFdc3Instrument);
        // to get back the Fdc3Instrument set earlier
        Fdc3Instrument testFdc3Instrument = (Fdc3Instrument) exampleFdc3Context.getActualInstance();
    }
}
```


