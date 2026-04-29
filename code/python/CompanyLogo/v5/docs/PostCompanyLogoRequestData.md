# PostCompanyLogoRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostCompanyLogoRequestDataIdentifier**](PostCompanyLogoRequestDataIdentifier.md) |  | 
**size** | [**PostCompanyLogoRequestDataSize**](PostCompanyLogoRequestDataSize.md) |  | 
**format** | **str** | Format of the logo. If no format is defined all available formats are returned. Accepted formats are:  * **rectangular** - Logos in rectangular format.  * **square** - Logos in square format.  | [optional]  if omitted the server will use the default value of "rectangular"
**mime_type** | **str** | Mime type of the logo. Accepted mime types are: * **image/png** - PNG compressed image. * **image/svg+xml** - Scalable Vector Graphics (SVG).  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


