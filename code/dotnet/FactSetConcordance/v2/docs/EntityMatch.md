# FactSet.SDK.FactSetConcordance.Model.EntityMatch
Entity Match object showing the decision reached for each Entity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UniverseId** | **int?** | The id of the universe that entities should be mapped to | [optional] 
**TaskId** | **int?** | Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow.  | [optional] 
**RowIndex** | **int?** | Row number for match in the request or input file. | [optional] 
**MatchFlag** | **bool?** | Flag denoting if the row is a match. | [optional] 
**EntityId** | **string** | FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)  | [optional] 
**EntityName** | **string** | Full name corresponding to the matched entity. | [optional] 
**Url** | **string** | URL of the matched entity. | [optional] 
**MapStatus** | **string** | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**SimilarityScore** | **double?** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**ConfidenceScore** | **double?** | Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence.  | [optional] 
**CountryCode** | **string** | ISO2 country code corresponding to the location of the matched entity. | [optional] 
**CountryName** | **string** | Country name corresponding to the location of the matched entity | [optional] 
**StateCode** | **string** | Two character state code corresponding to the location of the matched entity. | [optional] 
**StateName** | **string** | State name corresponding to the location of the matched entity. | [optional] 
**SicCode** | **string** | Standard Industrial Classification (SIC) Code of the matched entity. | [optional] 
**EntityTypeCode** | **string** | Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. | [optional] 
**EntityTypeDescription** | **string** | Description of of the matched entity&#39;s type. | [optional] 
**EntitySubTypeCode** | **string** | Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. | [optional] 
**LocationCity** | **string** | City where the matched entity is located. | [optional] 
**RegionName** | **string** | Region where the matched entity is located. | [optional] 
**FactsetIndustryCode** | **string** | FactSet Industry Classification Code of the matched entity. | [optional] 
**FactsetIndustryName** | **string** | Name of the matched entity&#39;s FactSet Industry Classification. | [optional] 
**FactsetSectorCode** | **string** | Name of the matched entity&#39;s FactSet Sector Classification Code. | [optional] 
**FactsetSectorName** | **string** | Name of the matched entity&#39;s FactSet Sector Classification. | [optional] 
**ParentName** | **string** | Name of the matched entity&#39;s parent entity. | [optional] 
**ParentMatchFlag** | **bool?** | Flag denoting that the matched entity is the parent of another match. | [optional] 
**ClientId** | **string** | Unique Identifer provided by the user in the request to represent the entity Name being requested. | [optional] 
**ClientName** | **string** | Name of the entity to match as specified in the request | [optional] 
**ClientCountry** | **string** | ISO2 country code specified in the request. | [optional] 
**ClientState** | **string** | State code specified in the request. | [optional] 
**ClientUrl** | **string** | URL specified in the request. | [optional] 
**NameMatchString** | **string** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**NameMatchSource** | **string** | Type of name that the nameMatchString matched. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

