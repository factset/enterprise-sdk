# cabot.AddTrimRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountPath** | **String** | The account path of the portfolio you want to retrieve the data for. | 
**benchmarkPath** | **String** | The path of the benchmark you want to retrieve the data for. | 
**period** | **String** | For which period you want to retrieve the data. | 
**attribute** | [**Attributes**](Attributes.md) |  | [optional] 
**sector** | **String** | Represents the sector based on the company&#39;s industry breakdown. | [optional] 
**region** | **String** | Region of domicile represents the region based on the company&#39;s primary listing. | [optional] 
**holdings** | [**AddTrimHoldings**](AddTrimHoldings.md) |  | [optional] 
**customClassifications** | **{String: String}** | A map-like structure representing key-value pairs of custom classifications. This differs from the default classifications such as region and sector, for which we have different query parameters. If both are provided, the API will choose which one to use based on your portfolio. | [optional] 


