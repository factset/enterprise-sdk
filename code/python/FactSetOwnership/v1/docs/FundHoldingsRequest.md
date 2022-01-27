# FundHoldingsRequest

Holdings Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdFundHoldings**](IdFundHoldings.md) |  | 
**date** | **str** | Date of holdings expressed in YYYY-MM-DD format. | [optional] 
**topn** | **str** | Limits number of holdings or holders displayed by the top *n* securities. Default is ALL, or use integer to limit number. | [optional]  if omitted the server will use the default value of "ALL"
**asset_type** | [**AssetType**](AssetType.md) |  | [optional] 
**currency** | **str** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


