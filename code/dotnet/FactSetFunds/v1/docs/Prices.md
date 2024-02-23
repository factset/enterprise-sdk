# FactSet.SDK.FactSetFunds.Model.Prices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**Price** | **double?** | The NAV for the requested share class. NOTE - FactSet Mutual Funds does not use seven-day yields to price money market funds. | [optional] 
**Date** | **DateTime?** | The date of the NAV in YYYY-MM-DD format. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Currency** | **string** | ISO3 Currency | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

