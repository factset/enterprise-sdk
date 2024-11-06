

# ResponseText

LLM natural language response to the query. Provides an answer to the question or references further attached data. `Value` property contains the response text represented in markdown format.   Response text from the Conversational API may contain `citations` which provide references to the source of the data in the textual response. If provided, phrases within the response text will be mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. Links to the source data are provided as links to FactSet's Document Viewer (see OA page [here](https://my.apps.factset.com/oa/pages/17390)). If available, the link URL will directly point to the excerpted content highlighted within the document.  For an example of a response with citations, see the example labeled `ResponseWithCitationsExample`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Datatype contained in this data object | 
**value** | **String** | String containing LLM natural language response to the query | 
**citations** | **Map&lt;String, java.util.List&lt;Phrase&gt;&gt;** | A map of citations, where the keys are the citation IDs and the values are the citation schema objects. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;


## Implemented Interfaces

* Serializable


