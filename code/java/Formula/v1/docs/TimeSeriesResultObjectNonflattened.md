

# TimeSeriesResultObjectNonflattened

## oneOf schemas
* [TimeSeriesResultObjectNonflattenedArray](TimeSeriesResultObjectNonflattenedArray.md)
* [TimeSeriesResultObjectNonflattenedMatrix](TimeSeriesResultObjectNonflattenedMatrix.md)
* [TimeSeriesResultObjectNonflattenedScalar](TimeSeriesResultObjectNonflattenedScalar.md)
* [TimeSeriesResultObjectNonflattenedTimeseriesObject](TimeSeriesResultObjectNonflattenedTimeseriesObject.md)

## Example
```java
// Import classes:
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattened;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedArray;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedMatrix;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedScalar;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedTimeseriesObject;

public class Example {
    public static void main(String[] args) {
        TimeSeriesResultObjectNonflattened exampleTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened();

        // create a new TimeSeriesResultObjectNonflattenedArray
        TimeSeriesResultObjectNonflattenedArray exampleTimeSeriesResultObjectNonflattenedArray = new TimeSeriesResultObjectNonflattenedArray();
        // set TimeSeriesResultObjectNonflattened to TimeSeriesResultObjectNonflattenedArray
        exampleTimeSeriesResultObjectNonflattened.setActualInstance(exampleTimeSeriesResultObjectNonflattenedArray);
        // to get back the TimeSeriesResultObjectNonflattenedArray set earlier
        TimeSeriesResultObjectNonflattenedArray testTimeSeriesResultObjectNonflattenedArray = (TimeSeriesResultObjectNonflattenedArray) exampleTimeSeriesResultObjectNonflattened.getActualInstance();

        // create a new TimeSeriesResultObjectNonflattenedMatrix
        TimeSeriesResultObjectNonflattenedMatrix exampleTimeSeriesResultObjectNonflattenedMatrix = new TimeSeriesResultObjectNonflattenedMatrix();
        // set TimeSeriesResultObjectNonflattened to TimeSeriesResultObjectNonflattenedMatrix
        exampleTimeSeriesResultObjectNonflattened.setActualInstance(exampleTimeSeriesResultObjectNonflattenedMatrix);
        // to get back the TimeSeriesResultObjectNonflattenedMatrix set earlier
        TimeSeriesResultObjectNonflattenedMatrix testTimeSeriesResultObjectNonflattenedMatrix = (TimeSeriesResultObjectNonflattenedMatrix) exampleTimeSeriesResultObjectNonflattened.getActualInstance();

        // create a new TimeSeriesResultObjectNonflattenedScalar
        TimeSeriesResultObjectNonflattenedScalar exampleTimeSeriesResultObjectNonflattenedScalar = new TimeSeriesResultObjectNonflattenedScalar();
        // set TimeSeriesResultObjectNonflattened to TimeSeriesResultObjectNonflattenedScalar
        exampleTimeSeriesResultObjectNonflattened.setActualInstance(exampleTimeSeriesResultObjectNonflattenedScalar);
        // to get back the TimeSeriesResultObjectNonflattenedScalar set earlier
        TimeSeriesResultObjectNonflattenedScalar testTimeSeriesResultObjectNonflattenedScalar = (TimeSeriesResultObjectNonflattenedScalar) exampleTimeSeriesResultObjectNonflattened.getActualInstance();

        // create a new TimeSeriesResultObjectNonflattenedTimeseriesObject
        TimeSeriesResultObjectNonflattenedTimeseriesObject exampleTimeSeriesResultObjectNonflattenedTimeseriesObject = new TimeSeriesResultObjectNonflattenedTimeseriesObject();
        // set TimeSeriesResultObjectNonflattened to TimeSeriesResultObjectNonflattenedTimeseriesObject
        exampleTimeSeriesResultObjectNonflattened.setActualInstance(exampleTimeSeriesResultObjectNonflattenedTimeseriesObject);
        // to get back the TimeSeriesResultObjectNonflattenedTimeseriesObject set earlier
        TimeSeriesResultObjectNonflattenedTimeseriesObject testTimeSeriesResultObjectNonflattenedTimeseriesObject = (TimeSeriesResultObjectNonflattenedTimeseriesObject) exampleTimeSeriesResultObjectNonflattened.getActualInstance();
    }
}
```


