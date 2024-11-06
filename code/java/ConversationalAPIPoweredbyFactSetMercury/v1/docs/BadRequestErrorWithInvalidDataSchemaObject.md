

# BadRequestErrorWithInvalidDataSchemaObject

Represents a single error from a bad query request, with error name and identifiers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | Id of error | 
**title** | [**TitleEnum**](#TitleEnum) | Title of error | 
**code** | [**CodeEnum**](#CodeEnum) | Code of error | 
**detail** | **String** | Details of error | 



## Enum: TitleEnum

Name | Value
---- | -----
NO_DATA | &quot;No Data&quot;
PARAMETER_ERROR | &quot;Parameter Error&quot;
INVALID_REQUEST_BODY | &quot;Invalid Request Body&quot;
INVALID_URI | &quot;Invalid URI&quot;
INVALID_DATA_SCHEMA | &quot;Invalid Data Schema&quot;



## Enum: CodeEnum

Name | Value
---- | -----
NOTFOUND | &quot;notFound&quot;
PARAMETERERROR | &quot;parameterError&quot;
REQUESTBODYINVALID | &quot;requestBodyInvalid&quot;
CONVERSATIONAL_API_INVALIDURI | &quot;conversational_api_invalidUri&quot;
CONVERSATIONAL_API_INVALIDDATASCHEMA | &quot;conversational_api_invalidDataSchema&quot;


## Implemented Interfaces

* Serializable


