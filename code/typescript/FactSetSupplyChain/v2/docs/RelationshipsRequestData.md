# factsetsupplychain.RelationshipsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt; Make Note, &lt;strong&gt;GET&lt;/strong&gt; method URL request lines are limited to a total length of 8192 bytes (8 KB). For requests with large numbers of identifiers that may exceed this limit, use the corresponding &lt;strong&gt;POST&lt;/strong&gt; method where available.&lt;/p&gt; | 
**relationshipType** | [**[RelationshipTypeEnum]**](RelationshipTypeEnum.md) | Controls the relationship types returned in the response. Multiple relationship types can be selected simultaneously.    * **COMPETITOR** &#x3D; Returns entities disclosed by the source company as competitors or rivals.    * **ALL_PARTNERS** &#x3D; Returns all available partner relationship types in a single response.    * **PARTNER_DISTRIBUTION** &#x3D; Returns distribution partnership relationships.    * **PARTNER_EQUITY_INVESTMENT** &#x3D; Returns equity investment partnership relationships.    * **PARTNER_INTEGRATED_PRODUCT_OFFERING** &#x3D; Returns integrated product offering partnerships.    * **PARTNER_INVESTORS** &#x3D; Returns investor-related partnership relationships.    * **PARTNER_JOINT_VENTURE** &#x3D; Returns joint venture partnership relationships.    * **PARTNER_IN_LICENSING** &#x3D; Returns in-licensing partnership relationships.    * **PARTNER_OUT_LICENSING** &#x3D; Returns out-licensing partnership relationships.    * **PARTNER_MANUFACTURING** &#x3D; Returns manufacturing partnership relationships.    * **PARTNER_MARKETING** &#x3D; Returns marketing partnership relationships.    * **PARTNER_RESEARCH_COLLABORATION** &#x3D; Returns research collaboration partnership relationships. | [optional] 
**date** | **Date** | The date requested in **YYYY-MM-DD** format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**fields** | [**[RelationshipsFieldsEnum]**](RelationshipsFieldsEnum.md) | A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


