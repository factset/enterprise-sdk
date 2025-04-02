# InsiderTransactions

insiderTransactions response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used in the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**currency** | **str, none_type** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**holder_name** | **str, none_type** | Returns the names of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**holder_title** | **str, none_type** | Returns the titles of the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**holder_id** | **str, none_type** | Returns the holder IDs for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**shares** | **float, none_type** | Returns the transaction shares for the transactions that occurred between the specified start and end dates. | [optional] 
**price** | **float, none_type** | Returns the transaction prices for the transactions that occurred between the specified start and end dates. | [optional] 
**net_value_change** | **float, none_type** | Returns the transaction values for the transactions that occurred between the specified start and end dates. | [optional] 
**filing_date** | **str, none_type** | Returns the dates on which the transactions that occurred between the specified start and end dates were processed. | [optional] 
**is_derivative** | **bool, none_type** | Returns a Derivative/Non-Derivative flag for the transactions that occurred between the specified start and end dates. Returns true for Derivative and false for Non-Derivative. | [optional] 
**is_direct** | **bool, none_type** | Returns a direct/indirect flag for the transactions that occurred between the specified start and end dates. | [optional] 
**trade_type** | **str, none_type** | Returns an acquisition/disposition flag for the transactions that occurred between the specified start and end dates. | [optional] 
**form_type** | **str, none_type** | Returns the form types for the transactions that occurred between the specified start and end dates. | [optional] 
**transaction_date** | **str, none_type** | Returns the transaction dates for the transactions that occurred between the specified start and end dates. | [optional] 
**shares_owned** | **float, none_type** | Returns the shares owned data for the transactions that occurred between the specified start and end dates. | [optional] 
**sec_rule10b51** | **bool, none_type** | Returns rule 10b5-1 flags for the insiders involved in the transactions that occurred between the specified start and end dates. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


