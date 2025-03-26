

# Error


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | [**java.util.List&lt;SchemasEnum&gt;**](#java.util.List&lt;SchemasEnum&gt;) | An array containing the standard schema URI used for identifying an error. See RFC 7644 section 3.12. |  [optional]
**scimType** | [**ScimTypeEnum**](#ScimTypeEnum) |  |  [optional]
**detail** | **String** | A detailed human-readable message. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | HTTP status code. |  [optional]



## Enum: java.util.List&lt;SchemasEnum&gt;

Name | Value
---- | -----
URN_IETF_PARAMS_SCIM_API_MESSAGES_2_0_ERROR | &quot;urn:ietf:params:scim:api:messages:2.0:Error&quot;



## Enum: ScimTypeEnum

Name | Value
---- | -----
INVALIDFILTER | &quot;invalidFilter&quot;
TOOMANY | &quot;tooMany&quot;
UNIQUENESS | &quot;uniqueness&quot;
MUTABILITY | &quot;mutability&quot;
INVALIDSYNTAX | &quot;invalidSyntax&quot;
INVALIDPATH | &quot;invalidPath&quot;
NOTARGET | &quot;noTarget&quot;
INVALIDVALUE | &quot;invalidValue&quot;
INVALIDVERS | &quot;invalidVers&quot;
SENSITIVE | &quot;sensitive&quot;



## Enum: StatusEnum

Name | Value
---- | -----
_307 | &quot;307&quot;
_308 | &quot;308&quot;
_400 | &quot;400&quot;
_401 | &quot;401&quot;
_403 | &quot;403&quot;
_404 | &quot;404&quot;
_409 | &quot;409&quot;
_412 | &quot;412&quot;
_413 | &quot;413&quot;
_500 | &quot;500&quot;
_501 | &quot;501&quot;


## Implemented Interfaces

* Serializable


