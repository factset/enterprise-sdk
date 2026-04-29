# Flows

Fund flows data representing inflows and outflows for the specified share class

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**fund_flows** | **float, none_type** | Fund flows data for the specified share class in raw units of the specified currency. | [optional] 
**currency** | **str, none_type** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**date** | **date, none_type** | The date of the AUM in YYYY-MM-DD format. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


