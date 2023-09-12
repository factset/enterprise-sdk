

# OneOfQuantDates

## oneOf schemas
* [QuantDateList](QuantDateList.md)
* [QuantFdsDate](QuantFdsDate.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.factset.sdk.QuantEngine.models.OneOfQuantDates;
import com.factset.sdk.QuantEngine.models.QuantDateList;
import com.factset.sdk.QuantEngine.models.QuantFdsDate;

public class Example {
    public static void main(String[] args) {
        OneOfQuantDates exampleOneOfQuantDates = new OneOfQuantDates();

        // create a new QuantDateList
        QuantDateList exampleQuantDateList = new QuantDateList();
        // set OneOfQuantDates to QuantDateList
        exampleOneOfQuantDates.setActualInstance(exampleQuantDateList);
        // to get back the QuantDateList set earlier
        QuantDateList testQuantDateList = (QuantDateList) exampleOneOfQuantDates.getActualInstance();

        // create a new QuantFdsDate
        QuantFdsDate exampleQuantFdsDate = new QuantFdsDate();
        // set OneOfQuantDates to QuantFdsDate
        exampleOneOfQuantDates.setActualInstance(exampleQuantFdsDate);
        // to get back the QuantFdsDate set earlier
        QuantFdsDate testQuantFdsDate = (QuantFdsDate) exampleOneOfQuantDates.getActualInstance();
    }
}
```


