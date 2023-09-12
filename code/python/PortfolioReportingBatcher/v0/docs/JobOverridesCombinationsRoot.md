# JobOverridesCombinationsRoot

Used for Vault job type only. This creates a matrix of given accounts and dates. When the job is run, it will only run for the accounts and dates within this object. (Settings will only be used temporarily and no changes will be made to the default PRB job.)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **[str]** | An array of accounts | [optional] 
**dates** | **[date]** | An array of dates | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


