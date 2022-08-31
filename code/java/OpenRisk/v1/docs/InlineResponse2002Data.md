

# InlineResponse2002Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Model code | 
**currencies** | **java.util.List&lt;String&gt;** | Currencies that can be used with the model | 
**currency** | **String** | ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. | 
**factors** | [**java.util.List&lt;InlineResponse2002DataFactors&gt;**](InlineResponse2002DataFactors.md) | Factors of the model | 
**factorIdToIsoCurrency** | **Map&lt;String, String&gt;** | Map of currency factor IDs to ISO currency code. | 
**firstDate** | **LocalDate** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**frequency** | **String** | Frequency of the model | 
**latestDate** | **LocalDate** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**name** | **String** | Model name | 
**riskModelAppendFormat** | [**java.util.List&lt;InlineResponse2002DataRiskModelAppendFormat&gt;**](InlineResponse2002DataRiskModelAppendFormat.md) | List of fields which are supported by the risk model for appending additional asset data |  [optional]
**universeCount** | **Integer** | Total universe count of the model | 
**vendor** | **String** | Model vendor | 


## Implemented Interfaces

* Serializable


