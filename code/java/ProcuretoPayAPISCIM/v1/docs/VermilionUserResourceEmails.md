

# VermilionUserResourceEmails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Email addresses for the user. The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;. Canonical type values of &#39;work&#39;, &#39;home&#39;, and &#39;other&#39;. |  [optional]
**display** | **String** | A human-readable name, primarily used for display purposes.  READ-ONLY. |  [optional]
**type** | **String** | A label indicating the attribute&#39;s function, e.g., &#39;work&#39; or &#39;home&#39;. |  [optional]
**primary** | **Boolean** | A Boolean value indicating the &#39;primary&#39; or preferred attribute value for this attribute, e.g., the psreferred mailing address or primary email address.  The primary attribute value &#39;true&#39; MUST appear no more than once. |  [optional]


## Implemented Interfaces

* Serializable


