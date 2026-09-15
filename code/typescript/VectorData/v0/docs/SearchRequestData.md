# vectordata.SearchRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | &gt; Natural language search query. &gt; **Note:** currently, we allow the following special characters: space, &#x60;,&#x60;, &#x60;%&#x60;, &#x60;&amp;&#x60;, &#x60;/&#x60;,&#x60; -&#x60;, &#x60;?&#x60; | 
**startDate** | **Date** | The date for (or from which) the data is required. Supports in YYYY-MM-DD format. | 
**endDate** | **Date** | The date to which data is required. Supports in YYYY-MM-DD format. | 
**formTypes** | **[String]** | &gt; The search to include valid form type for the provided sources. Use the &#x60;/form-types&#x60; endpoint to get a list of all available form types. &gt; **Note:** When used in conjunction with the &#x60;sources&#x60; parameter set to &#39;EDG&#39;, the API considers these form type values for data retrieval. For non-EDGAR/filings sources, this parameter is ignored. | [optional] 
**sources** | **[String]** | Data sources to search. Use the &#x60;/sources&#x60; endpoint to get a list of all available sources. Available sources include EDGAR (EDG), StreetAccount News (SA), FactSet CallStreet Transcripts (FCST), MT Newswire (MTN). | 
**ids** | **[String]** | Requested symbols or securities. Each symbol can be a FactSet exchange symbol | [optional] 
**resultsBySource** | **Boolean** | When true, applies the &#x60;limit&#x60; parameter individually to each specified source. For example, if you specify sources EDG, FCST, SA and MTN with &#x60;limit&#x3D;10&#x60; and &#x60;resultsBySource&#x3D;true&#x60;, you will receive up to 10 results from each source (up to 30 total). When false or omitted, &#x60;limit&#x60; applies to the overall number of results across all sources.  | [optional] [default to false]


