# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.NextStepItem
Directives to a front-end application to perform a certain task i.e. open a FactSet application or component, download an Excel file. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | Type of action | [optional] 
**Name** | **string** | Name of the download type | [optional] 
**Label** | **string** | Label associated with the download | [optional] 
**Category** | **string** | Category of associated file | [optional] 
**Url** | [**OpenUrlUrl**](OpenUrlUrl.md) |  | [optional] 
**Location** | **string** | Endpoint where file can be found | [optional] 
**FileId** | **Guid** | Id of associated file | [optional] 
**ContentType** | **string** | ContentType of associated file | [optional] 
**FileName** | **string** | Name of associated file | [optional] 
**Error** | **bool** | Boolean representing if there was an error generating the downloadable file | 
**ErrorMessage** | **string** | Error message detailing the error in generating the downloadable file | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

