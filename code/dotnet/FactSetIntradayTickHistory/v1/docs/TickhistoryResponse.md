# FactSet.SDK.FactSetIntradayTickHistory.Model.TickhistoryResponse
response for tick history

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestedID** | **string** | Request Identification String. | [optional] 
**RequestedSymbol** | **string** | Single Requested Symbol or Security. | [optional] 
**RequestedFields** | [**List&lt;Fields&gt;**](Fields.md) | Array of requested fields  | [optional] 
**RequestKey** | **string** |  | [optional] 
**ErrorCode** | **string** |  | [optional] 
**ErrorDescription** | **string** | Brief description of error response. Blank if successful. | [optional] 
**FieldNames** | **string** | Requested Field Names | [optional] 
**FieldIDs** | **decimal** | Requested Field ID numbers &#39;FID&#39;. Found in Data Service Manual. | [optional] 
**Key** | **string** | Requested Symbol Key, where :D represented delayed data. | [optional] 
**Values** | **decimal** | Array of field values. Each value is returned for requested interval query. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

