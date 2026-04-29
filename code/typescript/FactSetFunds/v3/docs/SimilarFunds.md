# factsetfunds.SimilarFunds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**structureType** | [**SimilarFundsType**](SimilarFundsType.md) |  | 
**similarFundIds** | **[String]** | Array of similar funds to the requestedId, each returned as a FactSet Permanent Security Identifier (XXXXXX-S). Data is returned for mutual funds only. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 


