# intradaytickhistory.TickhistoryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestedID** | **String** | Request Identification String. | [optional] 
**requestedSymbol** | **String** | Single Requested Symbol or Security. | [optional] 
**requestedFields** | [**[Fields]**](Fields.md) | Array of requested fields  | [optional] 
**requestKey** | **String** |  | [optional] 
**errorCode** | **String** |  | [optional] 
**errorDescription** | **String** | Brief description of error response. Blank if successful. | [optional] 
**fieldNames** | **String** | Requested Field Names | [optional] 
**fieldIDs** | **Number** | Requested Field ID numbers &#39;FID&#39;. Found in Data Service Manual. | [optional] 
**key** | **String** | Requested Symbol Key, where :D represented delayed data. | [optional] 
**values** | **Number** | Array of field values. Each value is returned for requested interval query. | [optional] 


