# SearchRequestData

Elements of search request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **str** | &gt; Natural language search query. &gt; **Note:** currently, we allow the following special characters: space, &#x60;,&#x60;, &#x60;%&#x60;, &#x60;&amp;&#x60;, &#x60;/&#x60;,&#x60; -&#x60;, &#x60;?&#x60; | 
**start_date** | **date** | The date for (or from which) the data is required. Supports in YYYY-MM-DD format. | 
**end_date** | **date** | The date to which data is required. Supports in YYYY-MM-DD format. | 
**sources** | **[str]** | Data sources to search. Use the &#x60;/sources&#x60; endpoint to get a list of all available sources. Available sources include EDGAR (EDG), StreetAccount News (SA), FactSet CallStreet Transcripts (FCST), MT Newswire (MTN). | 
**form_types** | **[str]** | &gt; The search to include valid form type for the provided sources. Use the &#x60;/form-types&#x60; endpoint to get a list of all available form types. &gt; **Note:** When used in conjunction with the &#x60;sources&#x60; parameter set to &#39;EDG&#39;, the API considers these form type values for data retrieval. For non-EDGAR/filings sources, this parameter is ignored. | [optional] 
**ids** | **[str]** | Requested symbols or securities. Each symbol can be a FactSet exchange symbol | [optional] 
**results_by_source** | **bool** | When true, applies the &#x60;limit&#x60; parameter individually to each specified source. For example, if you specify sources EDG, FCST, SA and MTN with &#x60;limit&#x3D;10&#x60; and &#x60;resultsBySource&#x3D;true&#x60;, you will receive up to 10 results from each source (up to 30 total). When false or omitted, &#x60;limit&#x60; applies to the overall number of results across all sources.  | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


