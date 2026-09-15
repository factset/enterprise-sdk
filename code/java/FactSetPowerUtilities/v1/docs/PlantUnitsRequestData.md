

# PlantUnitsRequestData

Plant unit query parameters. The `category` field selects the record shape returned. 

## oneOf schemas
* [PlantMetadataData](PlantMetadataData.md)
* [PlantPipelineData](PlantPipelineData.md)
* [PlantSolarData](PlantSolarData.md)
* [PlantThermalData](PlantThermalData.md)
* [PlantWindData](PlantWindData.md)

## Example
```java
// Import classes:
import com.factset.sdk.FactSetPowerUtilities.models.PlantUnitsRequestData;
import com.factset.sdk.FactSetPowerUtilities.models.PlantMetadataData;
import com.factset.sdk.FactSetPowerUtilities.models.PlantPipelineData;
import com.factset.sdk.FactSetPowerUtilities.models.PlantSolarData;
import com.factset.sdk.FactSetPowerUtilities.models.PlantThermalData;
import com.factset.sdk.FactSetPowerUtilities.models.PlantWindData;

public class Example {
    public static void main(String[] args) {
        PlantUnitsRequestData examplePlantUnitsRequestData = new PlantUnitsRequestData();

        // create a new PlantMetadataData
        PlantMetadataData examplePlantMetadataData = new PlantMetadataData();
        // set PlantUnitsRequestData to PlantMetadataData
        examplePlantUnitsRequestData.setActualInstance(examplePlantMetadataData);
        // to get back the PlantMetadataData set earlier
        PlantMetadataData testPlantMetadataData = (PlantMetadataData) examplePlantUnitsRequestData.getActualInstance();

        // create a new PlantPipelineData
        PlantPipelineData examplePlantPipelineData = new PlantPipelineData();
        // set PlantUnitsRequestData to PlantPipelineData
        examplePlantUnitsRequestData.setActualInstance(examplePlantPipelineData);
        // to get back the PlantPipelineData set earlier
        PlantPipelineData testPlantPipelineData = (PlantPipelineData) examplePlantUnitsRequestData.getActualInstance();

        // create a new PlantSolarData
        PlantSolarData examplePlantSolarData = new PlantSolarData();
        // set PlantUnitsRequestData to PlantSolarData
        examplePlantUnitsRequestData.setActualInstance(examplePlantSolarData);
        // to get back the PlantSolarData set earlier
        PlantSolarData testPlantSolarData = (PlantSolarData) examplePlantUnitsRequestData.getActualInstance();

        // create a new PlantThermalData
        PlantThermalData examplePlantThermalData = new PlantThermalData();
        // set PlantUnitsRequestData to PlantThermalData
        examplePlantUnitsRequestData.setActualInstance(examplePlantThermalData);
        // to get back the PlantThermalData set earlier
        PlantThermalData testPlantThermalData = (PlantThermalData) examplePlantUnitsRequestData.getActualInstance();

        // create a new PlantWindData
        PlantWindData examplePlantWindData = new PlantWindData();
        // set PlantUnitsRequestData to PlantWindData
        examplePlantUnitsRequestData.setActualInstance(examplePlantWindData);
        // to get back the PlantWindData set earlier
        PlantWindData testPlantWindData = (PlantWindData) examplePlantUnitsRequestData.getActualInstance();
    }
}
```


