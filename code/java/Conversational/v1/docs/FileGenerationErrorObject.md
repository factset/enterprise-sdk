

# FileGenerationErrorObject

`null` if no error occurred, otherwise contains an error object with details regarding the file generation error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | Id of error |  [optional]
**title** | [**TitleEnum**](#TitleEnum) | Title of error |  [optional]
**code** | [**CodeEnum**](#CodeEnum) | Code of error |  [optional]
**detail** | **String** | Details of error |  [optional]



## Enum: TitleEnum

Name | Value
---- | -----
FILE_GENERATION_ERROR | &quot;File Generation Error&quot;



## Enum: CodeEnum

Name | Value
---- | -----
CONVERSATIONAL_API_FILEGENERATIONERROR | &quot;conversational_api_fileGenerationError&quot;


## Implemented Interfaces

* Serializable


