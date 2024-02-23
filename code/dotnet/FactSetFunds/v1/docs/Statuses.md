# FactSet.SDK.FactSetFunds.Model.Statuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**ActiveFlag** | **int?** | Binary flag to indicate whether the fund is currently active, where 1 is active and 0 is inactive. | [optional] 
**ShrClassActiveFlag** | **int?** | Returns a binary indicator of whether the specified share class is currently active, where 1 is active and 0 is inactive. | [optional] 
**IsonFFD** | **int?** | Returns a binary indicator of whether the specified fund is available in the FactSet Funds Database (FFD). | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

