# FactSet.SDK.Cabot.Model.AddTrimRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountPath** | **string** | The account path of the portfolio you want to retrieve the data for. | 
**BenchmarkPath** | **string** | The path of the benchmark you want to retrieve the data for. | 
**Period** | **string** | For which period you want to retrieve the data. | 
**Attribute** | **Attributes** |  | [optional] 
**Sector** | **string** | Represents the sector based on the company&#39;s industry breakdown. | [optional] 
**Region** | **string** | Region of domicile represents the region based on the company&#39;s primary listing. | [optional] 
**Holdings** | **AddTrimHoldings** |  | [optional] 
**CustomClassifications** | **Dictionary&lt;string, string&gt;** | A map-like structure representing key-value pairs of custom classifications. This differs from the default classifications such as region and sector, for which we have different query parameters. If both are provided, the API will choose which one to use based on your portfolio. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

