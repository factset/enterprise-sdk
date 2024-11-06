# ResponseText

LLM natural language response to the query. Provides an answer to the question or references further attached data. `Value` property contains the response text represented in markdown format.   Response text from the Conversational API may contain `citations` which provide references to the source of the data in the textual response. If provided, phrases within the response text will be mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. Links to the source data are provided as links to FactSet's Document Viewer (see OA page [here](https://my.apps.factset.com/oa/pages/17390)). If available, the link URL will directly point to the excerpted content highlighted within the document.  For an example of a response with citations, see the example labeled `ResponseWithCitationsExample`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | String containing LLM natural language response to the query | 
**type** | **str** | Datatype contained in this data object | defaults to "string"
**citations** | [**Citations**](Citations.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


