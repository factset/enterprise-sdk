# factsetsupplychain.SupplyChainRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt; Make Note, &lt;strong&gt;GET&lt;/strong&gt; method URL request lines are limited to a total length of 8192 bytes (8 KB). For requests with large numbers of identifiers that may exceed this limit, use the corresponding &lt;strong&gt;POST&lt;/strong&gt; method where available.&lt;/p&gt; | 
**relationshipType** | [**SupplyChainRelationshipType**](SupplyChainRelationshipType.md) |  | [optional] 
**date** | **Date** | The date requested in **YYYY-MM-DD** format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**fields** | [**[SupplyChainFieldsEnum]**](SupplyChainFieldsEnum.md) | A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


