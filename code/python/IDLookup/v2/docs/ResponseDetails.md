# ResponseDetails

Response Details Object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataset** | **str** | Type of dataset. | 
**name** | **str** | Name of the related dataset. | 
**id** | **str** | Identifier of a market security pertaining to the dataset . | [optional] 
**id_type** | **str** | Type of the identifier. * &#x60;symbol&#x60;: The value in symbol is associated with the name of the related dataset. It is the only value that should be passed back to any FactSet services to retrieve data. Example: M-US.   * &#x60;tickerRegion&#x60;: FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258). Example: MKSXX-US.   * &#x60;tickerExchange&#x60;: FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544). Example: N3ZWW5.FI-CEP.    * &#x60;entityId&#x60;: FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Example: 000F9X-E.  | [optional] 
**issuer_name** | **str** | Name of the issuer. | [optional] 
**entity_id** | **str** | FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  | [optional] 
**underlying** | [**ResponseDetailsUnderlying**](ResponseDetailsUnderlying.md) |  | [optional] 
**fsym_regional_id** | **str** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). | [optional] 
**fsym_listing_id** | **str** | FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. | [optional] 
**fsym_underlying_id** | **str** | FactSet Underlying Id | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


