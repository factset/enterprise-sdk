# FactSet.SDK.OffPlatformIntegrations.Model.ErrorResponse
Standard error response envelope returned on all non-successful responses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**List&lt;ErrorItem&gt;**](ErrorItem.md) | A list of one or more errors that describe why the request failed. | 
**Data** | [**List&lt;AccessCheckResult&gt;**](AccessCheckResult.md) | Present only when some codes were successfully decrypted alongside failures. Contains the results for the successfully decrypted codes. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

