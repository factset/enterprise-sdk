# LiquidityResponseFields

Liquidity Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fysm_id** | **str** | Identifier that was used for the request. | [optional] 
**metric** | **str, none_type** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. | [optional] 
**fiscal_year** | **int, none_type** | Fiscal year of the reported period in YYYY format. | [optional] 
**report_date** | **date, none_type** | Reporting date for the debt instrument. | [optional] 
**currency** | **str, none_type** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**LiquidityValue**](LiquidityValue.md) |  | [optional] 
**instrument_id** | **str, none_type** | Identifier for the debt instrument. | [optional] 
**instrument_type** | **str, none_type** | Type of debt instrument. | [optional] 
**description** | **str, none_type** | Description of the debt instrument. | [optional] 
**amount_outstanding** | **float, none_type** | Balance sheet amount outstanding. | [optional] 
**facility_amount** | **float, none_type** | Facility Amount for liquidity. | [optional] 
**borrowing_base** | **float, none_type** | Borrowing Base for liquidity. | [optional] 
**maturity_date** | **date, none_type** | Maturity date for the debt instrument. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


