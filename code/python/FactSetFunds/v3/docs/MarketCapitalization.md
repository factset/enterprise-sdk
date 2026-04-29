# MarketCapitalization

Market capitalization breakdown showing portfolio allocation across large, mid, small, and micro-cap holdings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analytics_type** | [**MarketCapitalizationType**](MarketCapitalizationType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**large_cap_percent** | **float, none_type** | Percentage of the aggregate that is composed of large-cap holdings. Large cap is defined as having a company market value greater than 12.9 billion USD | [optional] 
**mid_cap_percent** | **float, none_type** | Percentage of the aggregate that is composed of Mid-cap holdings. Mid cap is defined as having a company market value greater than 2.7 billion USD but less than 12.9 billion USD. | [optional] 
**small_cap_percent** | **float, none_type** | Percentage of the aggregate that is composed of Small-cap holdings. Small cap is defined as having a company market value greater than 600 million USD but less than 2.7 billion USD | [optional] 
**micro_cap_percent** | **float, none_type** | Percentage of the aggregate that is composed of Micro-cap holdings. Micro cap is defined as having a company market value less than 600 million USD. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


