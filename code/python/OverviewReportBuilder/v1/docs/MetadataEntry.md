# MetadataEntry

Restricted metadata entries. Restricts the possible key in the following STACH schema: - RowOrganizedPackage.CellDetail.CellMetadataEntry - RowOrganizedPackage.HeaderCellDetail.CellMetadataEntry - RowOrganizedPackage.MapOfMetadata.ItemsEntry - RowOrganizedPackage.Row.RowMetadataEntry - RowOrganizedPackage.TableData.TableMetadataEntry  And sets restrictions on the possible values for a MetadataItem. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryCategory**](CategoryCategory.md) |  | [optional] 
**currency_code** | [**CurrencyCodeCurrencyCode**](CurrencyCodeCurrencyCode.md) |  | [optional] 
**currency_symbol** | [**CurrencySymbolCurrencySymbol**](CurrencySymbolCurrencySymbol.md) |  | [optional] 
**description** | [**DescriptionDescription**](DescriptionDescription.md) |  | [optional] 
**frequency** | [**FrequencyFrequency**](FrequencyFrequency.md) |  | [optional] 
**metric** | [**MetricMetric**](MetricMetric.md) |  | [optional] 
**relevance_type** | [**RelevanceTypeRelevanceType**](RelevanceTypeRelevanceType.md) |  | [optional] 
**scale** | [**ScaleScale**](ScaleScale.md) |  | [optional] 
**transaction_id** | [**TransactionIdTransactionId**](TransactionIdTransactionId.md) |  | [optional] 
**transaction_type** | [**TransactionTypeTransactionType**](TransactionTypeTransactionType.md) |  | [optional] 
**value_type** | [**ValueTypeValueType**](ValueTypeValueType.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


