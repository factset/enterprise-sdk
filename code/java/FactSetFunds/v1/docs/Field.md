

# Field

Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | Field name. |  [optional]
**displayName** | **String** | Field display name as provided during the creation of the content set. This is returned only for custom content sets. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Field data type, where field datatype can be one of the following: * &#x60;text&#x60;  &#x3D; String, * &#x60;float&#x60; &#x3D; Floating point number, * &#x60;long&#x60;  &#x3D; integer, * &#x60;date&#x60; &#x3D; Date. * &#x60;boolean&#x60; &#x3D; &#x60;true&#x60; or &#x60;false&#x60;.  &lt;br&gt;  |  [optional]
**description** | **String** | Field description. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TEXT | &quot;text&quot;
FLOAT | &quot;float&quot;
LONG | &quot;long&quot;
DATE | &quot;date&quot;
BOOLEAN | &quot;boolean&quot;


## Implemented Interfaces

* Serializable


