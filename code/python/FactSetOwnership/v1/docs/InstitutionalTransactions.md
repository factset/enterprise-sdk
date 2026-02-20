# InstitutionalTransactions

institutionalTransactions response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used in the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**currency** | **str, none_type** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**holder_name** | **str, none_type** | Returns the names of the institutions involved in the transactions that occurred between the specified start and end dates. | [optional] 
**pct_os** | **float, none_type** | Returns position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**pct_change** | **float, none_type** | Returns change in position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**pos_change** | **float, none_type** | Returns position change data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**market_val** | **float, none_type** | Returns market value data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**period_of_measure** | **str, none_type** | Returns the range over which the code calculates change for Percent Ownership and Position Change. | [optional] 
**report_date** | **date, none_type** | Returns the report date for the transactions that occurred between the specified start and end dates. | [optional] 
**as_of_date** | **date, none_type** | Date on which the specified data or information is accurate or relevant. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


