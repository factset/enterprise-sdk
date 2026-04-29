

# PostCompanyLogoRequestDataSize

Standard or custom-size for the logo. Either a predefined size from the available options must be selected, or a custom size in pixels must be provided.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predefined** | [**java.util.Set&lt;PredefinedEnum&gt;**](#java.util.Set&lt;PredefinedEnum&gt;) | Set of predefined sizes for logos. Accepted sizes are:  * **small** - Rectangular logo maximum width of 88 pixels and maximum height of 31 pixels. Square logo 31 x 31 pixels.  * **medium** - Small logo scaled up by 200%.  * **large** - Small logo scaled up by 300%.  * **vector** - Can be rendered at any size.  |  [optional]
**custom** | [**PostCompanyLogoRequestDataSizeCustom**](PostCompanyLogoRequestDataSizeCustom.md) |  |  [optional]



## Enum: java.util.Set&lt;PredefinedEnum&gt;

Name | Value
---- | -----
SMALL | &quot;small&quot;
MEDIUM | &quot;medium&quot;
LARGE | &quot;large&quot;
VECTOR | &quot;vector&quot;


## Implemented Interfaces

* Serializable


