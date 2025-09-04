

# CrossSectionalResponseObjectItems

## oneOf schemas
* [CrossSectionalResultObjectNonflattened](CrossSectionalResultObjectNonflattened.md)
* [UnifiedResultObjectFlattened](UnifiedResultObjectFlattened.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.CrossSectionalResponseObjectItems;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattened;
import com.factset.sdk.Formula.models.UnifiedResultObjectFlattened;

public class Example {
    public static void main(String[] args) {
        CrossSectionalResponseObjectItems exampleCrossSectionalResponseObjectItems = new CrossSectionalResponseObjectItems();

        // create a new CrossSectionalResultObjectNonflattened
        CrossSectionalResultObjectNonflattened exampleCrossSectionalResultObjectNonflattened = new CrossSectionalResultObjectNonflattened();
        // set CrossSectionalResponseObjectItems to CrossSectionalResultObjectNonflattened
        exampleCrossSectionalResponseObjectItems.setActualInstance(exampleCrossSectionalResultObjectNonflattened);
        // to get back the CrossSectionalResultObjectNonflattened set earlier
        CrossSectionalResultObjectNonflattened testCrossSectionalResultObjectNonflattened = (CrossSectionalResultObjectNonflattened) exampleCrossSectionalResponseObjectItems.getActualInstance();

        // create a new UnifiedResultObjectFlattened
        UnifiedResultObjectFlattened exampleUnifiedResultObjectFlattened = new UnifiedResultObjectFlattened();
        // set CrossSectionalResponseObjectItems to UnifiedResultObjectFlattened
        exampleCrossSectionalResponseObjectItems.setActualInstance(exampleUnifiedResultObjectFlattened);
        // to get back the UnifiedResultObjectFlattened set earlier
        UnifiedResultObjectFlattened testUnifiedResultObjectFlattened = (UnifiedResultObjectFlattened) exampleCrossSectionalResponseObjectItems.getActualInstance();
    }
}
```


