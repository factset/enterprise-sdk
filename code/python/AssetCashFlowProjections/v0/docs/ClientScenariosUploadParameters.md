# ClientScenariosUploadParameters

Details required for uploading scenario files

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_name** | **str** | Scenario file name including file extension. | 
**as_of_date** | **date** | Scenario As of Date ( Please select a Date not later than Previous Close Date) | 
**overwrite** | **bool** | Flag to indicate if existing file needs to be overwritten. Please expect a 409 if the file already exists and the overwrite is not set to true. | [optional]  if omitted the server will use the default value of False
**replace_special_characters** | **bool** | Flag to indicate if the special characters in the fileName can be replaced with underscore. Please expect a 400 if their exists some special characters in the filename and this parameter is not set to true. - &#x60;SpecialCharacters&#x60;: .^%~$!#{} ()&#39;&#x60;+,:/ | [optional]  if omitted the server will use the default value of False

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


