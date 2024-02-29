# openrisk.InlineResponse2001Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Model code | 
**currencies** | **[String]** | Currencies that can be used with the model | 
**currency** | **String** | ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. | 
**factors** | [**[InlineResponse2001DataFactors]**](InlineResponse2001DataFactors.md) | Factors of the model | 
**factorIdToIsoCurrency** | **{String: String}** | Map of currency factor IDs to ISO currency code. | 
**firstDate** | **Date** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**frequency** | **String** | Frequency of the model | 
**latestDate** | **Date** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**name** | **String** | Model name | 
**riskModelAppendFormat** | [**[InlineResponse2001DataRiskModelAppendFormat]**](InlineResponse2001DataRiskModelAppendFormat.md) | List of fields which are supported by the risk model for appending additional asset data | [optional] 
**universeCount** | **Number** | Total universe count of the model | 
**vendor** | **String** | Model vendor | 


