

# ResponseString

Chat response to the query. Provides an answer to the question or references further attached data. `Value` property of parent FederationData contains a string with natural language. If the response text contains data citations for individual phrases, they will be included at the end of the phrase as `[ID]` where ID is an integer. The citation data will be mapped in the `citations` object, keyed by the citation ID. See the example `ResponseWithCitations` data for an example of how citations are referenced in the response. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Datatype contained in this data object | 
**value** | **String** | String containing chat response to the query | 
**citations** | **Map&lt;String, java.util.List&lt;Phrase&gt;&gt;** | A map of citations, where the keys are the citation IDs and the values are the citation schema objects. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;


## Implemented Interfaces

* Serializable


