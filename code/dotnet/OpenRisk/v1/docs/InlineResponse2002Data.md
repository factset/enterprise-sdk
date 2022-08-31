# FactSet.SDK.OpenRisk.Model.InlineResponse2002Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Model code | 
**Currencies** | **List&lt;string&gt;** | Currencies that can be used with the model | 
**Currency** | **string** | ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. | 
**Factors** | [**List&lt;InlineResponse2002DataFactors&gt;**](InlineResponse2002DataFactors.md) | Factors of the model | 
**FactorIdToIsoCurrency** | **Dictionary&lt;string, string&gt;** | Map of currency factor IDs to ISO currency code. | 
**FirstDate** | **DateTime** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**Frequency** | **string** | Frequency of the model | 
**LatestDate** | **DateTime** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**Name** | **string** | Model name | 
**RiskModelAppendFormat** | [**List&lt;InlineResponse2002DataRiskModelAppendFormat&gt;**](InlineResponse2002DataRiskModelAppendFormat.md) | List of fields which are supported by the risk model for appending additional asset data | [optional] 
**UniverseCount** | **int** | Total universe count of the model | 
**Vendor** | **string** | Model vendor | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

