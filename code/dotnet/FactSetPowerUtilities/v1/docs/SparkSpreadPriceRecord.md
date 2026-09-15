# FactSet.SDK.FactSetPowerUtilities.Model.SparkSpreadPriceRecord
Natural gas spark spread price record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**LocationId** | **string** | Location identifier, as submitted in the request. | 
**LocationName** | **string** | Full location name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code. | [optional] 
**Category** | **CategorySparkSpread** |  | 
**PriceDate** | **DateTime?** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**NgiLocName** | **string** | Corresponding natural gas delivery point name, as given by Natural Gas Intelligence. | [optional] 
**SparkSpreadType** | **string** | Spark spread type. | [optional] 
**SparkSpreadPricesMwh** | [**SparkSpreadPricesMwh**](SparkSpreadPricesMwh.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

