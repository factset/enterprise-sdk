# InlineResponse2001Data

Risk model metadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**RiskModelCode**](RiskModelCode.md) |  | 
**currencies** | [**[CurrencyIsoCode]**](CurrencyIsoCode.md) | Currencies that can be used with the model | 
**currency** | [**CurrencyIsoCode**](CurrencyIsoCode.md) |  | 
**factors** | [**[RiskModelFactorDetails]**](RiskModelFactorDetails.md) | Factors of the model | 
**factor_id_to_iso_currency** | **{str: (CurrencyIsoCode,)}** | Map of currency factor IDs to ISO currency code. | 
**first_date** | **date** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**frequency** | **str** | Frequency of the model | 
**latest_date** | **date** | **(since 1.12.0)**  Date format YYYY-MM-DD. | 
**name** | **str** | Model name | 
**universe_count** | **int** | Total universe count of the model | 
**vendor** | **str** | Model vendor | 
**risk_model_append_format** | [**[RiskModelAppendFieldType]**](RiskModelAppendFieldType.md) | List of fields which are supported by the risk model for appending additional asset data | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


