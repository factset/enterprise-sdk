# companylogo.PostCompanyLogoRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostCompanyLogoRequestDataIdentifier**](PostCompanyLogoRequestDataIdentifier.md) |  | 
**format** | **String** | Format of the logo. If no format is defined all available formats are returned. Accepted formats are:  * **rectangular** - Logos in rectangular format.  * **square** - Logos in square format.  | [optional] [default to &#39;rectangular&#39;]
**size** | [**PostCompanyLogoRequestDataSize**](PostCompanyLogoRequestDataSize.md) |  | 
**mimeType** | **String** | Mime type of the logo. Accepted mime types are: * **image/png** - PNG compressed image. * **image/svg+xml** - Scalable Vector Graphics (SVG).  | [optional] 



## Enum: FormatEnum


* `rectangular` (value: `"rectangular"`)

* `square` (value: `"square"`)





## Enum: MimeTypeEnum


* `png` (value: `"image/png"`)

* `svg+xml` (value: `"image/svg+xml"`)




