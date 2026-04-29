

# PostCompanyLogoRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostCompanyLogoRequestDataIdentifier**](PostCompanyLogoRequestDataIdentifier.md) |  | 
**format** | [**FormatEnum**](#FormatEnum) | Format of the logo. If no format is defined all available formats are returned. Accepted formats are:  * **rectangular** - Logos in rectangular format.  * **square** - Logos in square format.  |  [optional]
**size** | [**PostCompanyLogoRequestDataSize**](PostCompanyLogoRequestDataSize.md) |  | 
**mimeType** | [**MimeTypeEnum**](#MimeTypeEnum) | Mime type of the logo. Accepted mime types are: * **image/png** - PNG compressed image. * **image/svg+xml** - Scalable Vector Graphics (SVG).  |  [optional]



## Enum: FormatEnum

Name | Value
---- | -----
RECTANGULAR | &quot;rectangular&quot;
SQUARE | &quot;square&quot;



## Enum: MimeTypeEnum

Name | Value
---- | -----
PNG | &quot;image/png&quot;
SVG_XML | &quot;image/svg+xml&quot;


## Implemented Interfaces

* Serializable


