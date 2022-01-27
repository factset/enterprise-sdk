# symbology.FactsetTranslation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) | [optional] 
**fsymSecurityId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) | [optional] 
**fsymRegionalId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security’s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) | [optional] 
**fsymListingId** | **String** | FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. &#39;-USA&#39;) since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) | [optional] 
**fsymEntityId** | **String** | FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) | [optional] 
**fsymTickerExchange** | **String** | FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544). | [optional] 
**fsymTickerRegion** | **String** | FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258) | [optional] 
**frefListingExchange** | **String** | Primary Listing Exchange Code. For details on Exchange Code Definitions, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544)  | [optional] 
**currency** | **String** | Three character ISO Currency code. For details on ISO Currency Code definitions, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470) | [optional] 
**securityType** | **String** | Returns security types for equities. For definitions of Security Types, visit [Online Assistant Page #15776](https://oa.apps.factset.com/pages/15776) | [optional] 
**name** | **String** | Proper Name of company or issuer. | [optional] 
**requestId** | **String** | Identifier specified in the &#x60;ids&#x60; parameter of the request. | [optional] 


