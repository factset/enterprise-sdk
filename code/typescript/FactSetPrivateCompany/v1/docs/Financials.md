# factsetprivatecompany.Financials

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier used in &#x60;ids&#x60;. | [optional] 
**fsymId** | **String** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**metric** | **String** | The requested &#x60;metric&#x60; input representing the Private Company Financial Data Item. | [optional] 
**fiscalYear** | **Number** | Fiscal year of the reported period in YYYY format. | [optional] 
**fiscalEndDate** | **Date** | The normalized data the fiscal period ended. | [optional] 
**currency** | **String** | ISO Code representing the local currency. For more details,  visit Online Assistant page [OA1470](https://my.apps.factset.com/oa/pages/1470)  | [optional] 
**value** | **Number** | Value of the data item requested. | [optional] 
**fpcIndicator** | **Number** |  Indicates whether the value for the respective &#x60;fpc_item&#x60; is actual, modeled, or computed. The possible values are as follows  0 - Actual:  Indicates values of an entity that are directly sourced from sources such as company filings,websites, press releases, trade and country registries, and news articles.  1 - Estimated (Low End of Range):  Indicates values of China entities that fall in the lower end of a range. For more information on Revenue &amp; Employee Range Data, see section [Revenue &amp; Employee Range Data- China](https://my.apps.factset.com/oa/cms/oaAttachment/cb2fc8ec-de25-41e2-b549-a07c637383e0/23961).  3 - Modeled:  Indicates reliable revenue estimates for private companies generated using a machine learningregression model trained on relevant inputs (such as employee count, industry sector, and scale of operation,etc.) from a comparable peer group of companies. At FactSet, the modelled revenues can either be internallygenerated (using a proprietary model) or sourced from a third-party data partner. For more information onour modelled revenue methodology, visit [Online Assistant Page 23588](https://my.apps.factset.com/oa/pages/23588).  4 - Computed(from US Tax Filings): Indicates values of an entity estimated by extracting tax, employment,and related information from over 80K federal, state, and local jurisdictions across the United States. Formore information on our Imputed Tax Financials Methodology, visit [Online Assistant Page 23587](https://my.apps.factset.com/oa/pages/23587).  | [optional] 


