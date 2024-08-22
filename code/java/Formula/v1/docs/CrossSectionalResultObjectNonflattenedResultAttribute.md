

# CrossSectionalResultObjectNonflattenedResultAttribute

An array containing the values for the data item

## oneOf schemas
* [Double](Double.md)
* [Integer](Integer.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattenedResultAttribute;
import com.factset.sdk.Formula.models.Double;
import com.factset.sdk.Formula.models.Integer;
import com.factset.sdk.Formula.models.String;

public class Example {
    public static void main(String[] args) {
        CrossSectionalResultObjectNonflattenedResultAttribute exampleCrossSectionalResultObjectNonflattenedResultAttribute = new CrossSectionalResultObjectNonflattenedResultAttribute();

        // create a new Double
        Double exampleDouble = new Double();
        // set CrossSectionalResultObjectNonflattenedResultAttribute to Double
        exampleCrossSectionalResultObjectNonflattenedResultAttribute.setActualInstance(exampleDouble);
        // to get back the Double set earlier
        Double testDouble = (Double) exampleCrossSectionalResultObjectNonflattenedResultAttribute.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set CrossSectionalResultObjectNonflattenedResultAttribute to Integer
        exampleCrossSectionalResultObjectNonflattenedResultAttribute.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleCrossSectionalResultObjectNonflattenedResultAttribute.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set CrossSectionalResultObjectNonflattenedResultAttribute to String
        exampleCrossSectionalResultObjectNonflattenedResultAttribute.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCrossSectionalResultObjectNonflattenedResultAttribute.getActualInstance();
    }
}
```


