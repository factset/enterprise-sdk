

# PlantUnitDetail

A single plant unit record. Record shape matches the requested `category`.

## oneOf schemas
* [PlantMetadataDetail](PlantMetadataDetail.md)
* [PlantPipelineDetail](PlantPipelineDetail.md)
* [PlantSolarDetail](PlantSolarDetail.md)
* [PlantThermalDetail](PlantThermalDetail.md)
* [PlantWindDetail](PlantWindDetail.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.models.PlantUnitDetail;
import com.factset.sdk.FactSetPowerUtilities.models.PlantMetadataDetail;
import com.factset.sdk.FactSetPowerUtilities.models.PlantPipelineDetail;
import com.factset.sdk.FactSetPowerUtilities.models.PlantSolarDetail;
import com.factset.sdk.FactSetPowerUtilities.models.PlantThermalDetail;
import com.factset.sdk.FactSetPowerUtilities.models.PlantWindDetail;

public class Example {
    public static void main(String[] args) {
        PlantUnitDetail examplePlantUnitDetail = new PlantUnitDetail();

        // create a new PlantMetadataDetail
        PlantMetadataDetail examplePlantMetadataDetail = new PlantMetadataDetail();
        // set PlantUnitDetail to PlantMetadataDetail
        examplePlantUnitDetail.setActualInstance(examplePlantMetadataDetail);
        // to get back the PlantMetadataDetail set earlier
        PlantMetadataDetail testPlantMetadataDetail = (PlantMetadataDetail) examplePlantUnitDetail.getActualInstance();

        // create a new PlantPipelineDetail
        PlantPipelineDetail examplePlantPipelineDetail = new PlantPipelineDetail();
        // set PlantUnitDetail to PlantPipelineDetail
        examplePlantUnitDetail.setActualInstance(examplePlantPipelineDetail);
        // to get back the PlantPipelineDetail set earlier
        PlantPipelineDetail testPlantPipelineDetail = (PlantPipelineDetail) examplePlantUnitDetail.getActualInstance();

        // create a new PlantSolarDetail
        PlantSolarDetail examplePlantSolarDetail = new PlantSolarDetail();
        // set PlantUnitDetail to PlantSolarDetail
        examplePlantUnitDetail.setActualInstance(examplePlantSolarDetail);
        // to get back the PlantSolarDetail set earlier
        PlantSolarDetail testPlantSolarDetail = (PlantSolarDetail) examplePlantUnitDetail.getActualInstance();

        // create a new PlantThermalDetail
        PlantThermalDetail examplePlantThermalDetail = new PlantThermalDetail();
        // set PlantUnitDetail to PlantThermalDetail
        examplePlantUnitDetail.setActualInstance(examplePlantThermalDetail);
        // to get back the PlantThermalDetail set earlier
        PlantThermalDetail testPlantThermalDetail = (PlantThermalDetail) examplePlantUnitDetail.getActualInstance();

        // create a new PlantWindDetail
        PlantWindDetail examplePlantWindDetail = new PlantWindDetail();
        // set PlantUnitDetail to PlantWindDetail
        examplePlantUnitDetail.setActualInstance(examplePlantWindDetail);
        // to get back the PlantWindDetail set earlier
        PlantWindDetail testPlantWindDetail = (PlantWindDetail) examplePlantUnitDetail.getActualInstance();
    }
}
```


