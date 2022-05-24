# FactSet.SDK.ProcuretoPayAPISCIM.Model.VermilionUserResourceEmails
Email addresses for the user. The value SHOULD be canonicalized by the service provider, e.g., 'bjensen@example.com' instead of 'bjensen@EXAMPLE.COM'. Canonical type values of 'work', 'home', and 'other'.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **string** | Email addresses for the user. The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;. Canonical type values of &#39;work&#39;, &#39;home&#39;, and &#39;other&#39;. | [optional] 
**Display** | **string** | A human-readable name, primarily used for display purposes.  READ-ONLY. | [optional] 
**Type** | **string** | A label indicating the attribute&#39;s function, e.g., &#39;work&#39; or &#39;home&#39;. | [optional] 
**Primary** | **bool** | A Boolean value indicating the &#39;primary&#39; or preferred attribute value for this attribute, e.g., the psreferred mailing address or primary email address.  The primary attribute value &#39;true&#39; MUST appear no more than once. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

