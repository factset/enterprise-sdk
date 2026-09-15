# IdsDocumentUploadData

Upload confirmation containing the presigned upload URL.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Server-generated UUID for request tracing and support. | [optional] 
**document_id** | **str** | Unique identifier of the document. | [optional] 
**file_name** | **str** | fileName of the document. | [optional] 
**upload_url** | **str** | ### CRITICAL CLIENT UPLOAD PROTOCOL INSTRUCTIONS This is a short-lived presigned HTTPS URL for uploading the document directly to S3.  When executing your HTTP PUT binary stream transfer out to this exact URL, your client-side code **MUST** explicitly attach these exact matching metadata headers: * &#x60;x-amz-meta-request-id&#x60; : Set to matching response requestId value. * &#x60;x-amz-meta-document-id&#x60; : Set to matching response documentID value.  Failure to pass these identical headers will cause an immediate HTTP 403 Forbidden error from Amazon S3.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


