# FactSet.SDK.VectorData.Model.IdsDocumentUploadData
Upload confirmation containing the presigned upload URL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **Guid** | Server-generated UUID for request tracing and support. | [optional] 
**DocumentID** | **string** | Unique identifier of the document. | [optional] 
**FileName** | **string** | fileName of the document. | [optional] 
**UploadUrl** | **string** | ### CRITICAL CLIENT UPLOAD PROTOCOL INSTRUCTIONS This is a short-lived presigned HTTPS URL for uploading the document directly to S3.  When executing your HTTP PUT binary stream transfer out to this exact URL, your client-side code **MUST** explicitly attach these exact matching metadata headers: * &#x60;x-amz-meta-request-id&#x60; : Set to matching response requestId value. * &#x60;x-amz-meta-document-id&#x60; : Set to matching response documentID value.  Failure to pass these identical headers will cause an immediate HTTP 403 Forbidden error from Amazon S3.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

