# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.Download
Directive to download a file. The `error` field specifies if there was an error generating the specific downloadable file; if an error occurred, the `errorMessage` field will detail the error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | Type of action | [optional] 
**Name** | **string** | Name of the download type | [optional] 
**Label** | **string** | Label associated with the download | [optional] 
**Category** | **string** | Category of associated file | [optional] 
**Location** | **string** | Endpoint where file can be found | [optional] 
**FileId** | **Guid** | Id of associated file | [optional] 
**ContentType** | **string** | ContentType of associated file | [optional] 
**FileName** | **string** | Name of associated file | [optional] 
**Error** | **bool** | Boolean representing if there was an error generating the downloadable file | 
**ErrorMessage** | **string** | Error message detailing the error in generating the downloadable file | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

