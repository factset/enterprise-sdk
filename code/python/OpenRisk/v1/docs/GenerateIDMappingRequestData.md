# GenerateIDMappingRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**Date**](Date.md) |  | 
**holdings** | [**Holdings**](Holdings.md) |  | 
**risk_model** | [**RiskModelCode**](RiskModelCode.md) |  | 
**allow_forced_riskless_assets** | **bool** | Allow certain assets to be entirely riskless; certain models always override this to be true. Examples of asset types to which this applies includes offset cash. | [optional]  if omitted the server will use the default value of False
**asset_types** | [**AssetTypes**](AssetTypes.md) |  | [optional] 
**calendar** | [**CalendarCode**](CalendarCode.md) |  | [optional] 
**composite_assets** | [**CompositeAssetDefinitions**](CompositeAssetDefinitions.md) |  | [optional] 
**currency** | [**CurrencyISOCode**](CurrencyISOCode.md) |  | [optional] 
**index_mapping** | [**SecurityIndexMapping**](SecurityIndexMapping.md) |  | [optional] 
**lagging_dates** | [**LaggingDates**](LaggingDates.md) |  | [optional] 
**risk_model_append_data** | [**RiskModelAppendData**](RiskModelAppendData.md) |  | [optional] 
**underlying_ids** | [**UnderlyingIDs**](UnderlyingIDs.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


