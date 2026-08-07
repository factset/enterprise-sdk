# DcsResponseFields

Debt Capital Structure Totals Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fysm_id** | **str** | Identifier that was used for the request. | [optional] 
**metric** | **str, none_type** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. | [optional] 
**fiscal_year** | **int, none_type** | Fiscal year of the reported period in YYYY format. | [optional] 
**report_date** | **date, none_type** | Reporting date for the debt instrument. | [optional] 
**date** | **date, none_type** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**currency** | **str, none_type** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**DCSValue**](DCSValue.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


