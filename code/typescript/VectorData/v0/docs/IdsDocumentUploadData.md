# vectordata.IdsDocumentUploadData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Server-generated UUID for request tracing and support. | [optional] 
**documentID** | **String** | Unique identifier of the document. | [optional] 
**fileName** | **String** | fileName of the document. | [optional] 
**uploadUrl** | **String** | ### CRITICAL CLIENT UPLOAD PROTOCOL INSTRUCTIONS This is a short-lived presigned HTTPS URL for uploading the document directly to S3.  When executing your HTTP PUT binary stream transfer out to this exact URL, your client-side code **MUST** explicitly attach these exact matching metadata headers: * &#x60;x-amz-meta-request-id&#x60; : Set to matching response requestId value. * &#x60;x-amz-meta-document-id&#x60; : Set to matching response documentID value.  Failure to pass these identical headers will cause an immediate HTTP 403 Forbidden error from Amazon S3.  | [optional] 


