

# ClientScenariosUploadParameters

Details required for uploading scenario files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | Scenario file name including file extension. | 
**asOfDate** | **LocalDate** | Scenario As of Date ( Please select a Date not later than Previous Close Date) | 
**overwrite** | **Boolean** | Flag to indicate if existing file needs to be overwritten. Please expect a 409 if the file already exists and the overwrite is not set to true. |  [optional]
**replaceSpecialCharacters** | **Boolean** | Flag to indicate if the special characters in the fileName can be replaced with underscore. Please expect a 400 if their exists some special characters in the filename and this parameter is not set to true. - &#x60;SpecialCharacters&#x60;: .^%~$!#{} ()&#39;&#x60;+,:/ |  [optional]


## Implemented Interfaces

* Serializable


