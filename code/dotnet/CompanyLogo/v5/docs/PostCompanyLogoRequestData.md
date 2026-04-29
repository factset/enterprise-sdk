# FactSet.SDK.CompanyLogo.Model.PostCompanyLogoRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | [**PostCompanyLogoRequestDataIdentifier**](PostCompanyLogoRequestDataIdentifier.md) |  | 
**Format** | **string** | Format of the logo. If no format is defined all available formats are returned. Accepted formats are:  * **rectangular** - Logos in rectangular format.  * **square** - Logos in square format.  | [optional] [default to FormatEnum.Rectangular]
**Size** | [**PostCompanyLogoRequestDataSize**](PostCompanyLogoRequestDataSize.md) |  | 
**MimeType** | **string** | Mime type of the logo. Accepted mime types are: * **image/png** - PNG compressed image. * **image/svg+xml** - Scalable Vector Graphics (SVG).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

