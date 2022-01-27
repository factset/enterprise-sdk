

# MetadataEntry

Restricted metadata entries. Restricts the possible key in the following STACH schema: - RowOrganizedPackage.CellDetail.CellMetadataEntry - RowOrganizedPackage.HeaderCellDetail.CellMetadataEntry - RowOrganizedPackage.MapOfMetadata.ItemsEntry - RowOrganizedPackage.Row.RowMetadataEntry - RowOrganizedPackage.TableData.TableMetadataEntry  And sets restrictions on the possible values for a MetadataItem. 

## oneOf schemas
* [Category](Category.md)
* [CurrencyCode](CurrencyCode.md)
* [CurrencySymbol](CurrencySymbol.md)
* [Description](Description.md)
* [Frequency](Frequency.md)
* [MetricEstimates](MetricEstimates.md)
* [Scale](Scale.md)
* [ValueType](ValueType.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetEstimatesReportBuilder.models.MetadataEntry;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.Category;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.CurrencyCode;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.CurrencySymbol;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.Description;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.Frequency;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.MetricEstimates;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.Scale;
import com.factset.sdk.FactSetEstimatesReportBuilder.models.ValueType;

public class Example {
    public static void main(String[] args) {
        MetadataEntry exampleMetadataEntry = new MetadataEntry();

        // create a new Category
        Category exampleCategory = new Category();
        // set MetadataEntry to Category
        exampleMetadataEntry.setActualInstance(exampleCategory);
        // to get back the Category set earlier
        Category testCategory = (Category) exampleMetadataEntry.getActualInstance();

        // create a new CurrencyCode
        CurrencyCode exampleCurrencyCode = new CurrencyCode();
        // set MetadataEntry to CurrencyCode
        exampleMetadataEntry.setActualInstance(exampleCurrencyCode);
        // to get back the CurrencyCode set earlier
        CurrencyCode testCurrencyCode = (CurrencyCode) exampleMetadataEntry.getActualInstance();

        // create a new CurrencySymbol
        CurrencySymbol exampleCurrencySymbol = new CurrencySymbol();
        // set MetadataEntry to CurrencySymbol
        exampleMetadataEntry.setActualInstance(exampleCurrencySymbol);
        // to get back the CurrencySymbol set earlier
        CurrencySymbol testCurrencySymbol = (CurrencySymbol) exampleMetadataEntry.getActualInstance();

        // create a new Description
        Description exampleDescription = new Description();
        // set MetadataEntry to Description
        exampleMetadataEntry.setActualInstance(exampleDescription);
        // to get back the Description set earlier
        Description testDescription = (Description) exampleMetadataEntry.getActualInstance();

        // create a new Frequency
        Frequency exampleFrequency = new Frequency();
        // set MetadataEntry to Frequency
        exampleMetadataEntry.setActualInstance(exampleFrequency);
        // to get back the Frequency set earlier
        Frequency testFrequency = (Frequency) exampleMetadataEntry.getActualInstance();

        // create a new MetricEstimates
        MetricEstimates exampleMetricEstimates = new MetricEstimates();
        // set MetadataEntry to MetricEstimates
        exampleMetadataEntry.setActualInstance(exampleMetricEstimates);
        // to get back the MetricEstimates set earlier
        MetricEstimates testMetricEstimates = (MetricEstimates) exampleMetadataEntry.getActualInstance();

        // create a new Scale
        Scale exampleScale = new Scale();
        // set MetadataEntry to Scale
        exampleMetadataEntry.setActualInstance(exampleScale);
        // to get back the Scale set earlier
        Scale testScale = (Scale) exampleMetadataEntry.getActualInstance();

        // create a new ValueType
        ValueType exampleValueType = new ValueType();
        // set MetadataEntry to ValueType
        exampleMetadataEntry.setActualInstance(exampleValueType);
        // to get back the ValueType set earlier
        ValueType testValueType = (ValueType) exampleMetadataEntry.getActualInstance();
    }
}
```


