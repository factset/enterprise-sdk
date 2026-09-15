# MarketDataRequestData

Market data query parameters. The `category` field selects the record shape returned. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryInterchange**](CategoryInterchange.md) |  | 
**respondent_factset_ba_sub_reg_id** | **str, none_type** | Filter to a specific counterpart balancing authority sub-region. | [optional]  if omitted the server will use the default value of "null"
**ids** | [**BalancingAuthoritySubRegionIds**](BalancingAuthoritySubRegionIds.md) |  | [optional] 
**start_date** | **date** | Return records on or after this date (YYYY-MM-DD). | [optional] 
**end_date** | **date** | Return records on or before this date (YYYY-MM-DD). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


