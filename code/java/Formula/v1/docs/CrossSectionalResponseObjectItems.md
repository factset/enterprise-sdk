

# CrossSectionalResponseObjectItems

## oneOf schemas
* [CrossSectionalResultObjectFlattened](CrossSectionalResultObjectFlattened.md)
* [CrossSectionalResultObjectNonflattened](CrossSectionalResultObjectNonflattened.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.CrossSectionalResponseObjectItems;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectFlattened;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattened;

public class Example {
    public static void main(String[] args) {
        CrossSectionalResponseObjectItems exampleCrossSectionalResponseObjectItems = new CrossSectionalResponseObjectItems();

        // create a new CrossSectionalResultObjectFlattened
        CrossSectionalResultObjectFlattened exampleCrossSectionalResultObjectFlattened = new CrossSectionalResultObjectFlattened();
        // set CrossSectionalResponseObjectItems to CrossSectionalResultObjectFlattened
        exampleCrossSectionalResponseObjectItems.setActualInstance(exampleCrossSectionalResultObjectFlattened);
        // to get back the CrossSectionalResultObjectFlattened set earlier
        CrossSectionalResultObjectFlattened testCrossSectionalResultObjectFlattened = (CrossSectionalResultObjectFlattened) exampleCrossSectionalResponseObjectItems.getActualInstance();

        // create a new CrossSectionalResultObjectNonflattened
        CrossSectionalResultObjectNonflattened exampleCrossSectionalResultObjectNonflattened = new CrossSectionalResultObjectNonflattened();
        // set CrossSectionalResponseObjectItems to CrossSectionalResultObjectNonflattened
        exampleCrossSectionalResponseObjectItems.setActualInstance(exampleCrossSectionalResultObjectNonflattened);
        // to get back the CrossSectionalResultObjectNonflattened set earlier
        CrossSectionalResultObjectNonflattened testCrossSectionalResultObjectNonflattened = (CrossSectionalResultObjectNonflattened) exampleCrossSectionalResponseObjectItems.getActualInstance();
    }
}
```


