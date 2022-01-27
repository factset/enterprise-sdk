

# EntityMatch

Entity Match object showing the decision reached for each Entity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universeId** | **Integer** | The id of the universe that entities should be mapped to |  [optional]
**taskId** | **Integer** | Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow.  |  [optional]
**rowIndex** | **Integer** | Row number for match in the request or input file. |  [optional]
**matchFlag** | **Boolean** | Flag denoting if the row is a match. |  [optional]
**entityId** | **String** | FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)  |  [optional]
**entityName** | **String** | Full name corresponding to the matched entity. |  [optional]
**url** | **String** | URL of the matched entity. |  [optional]
**mapStatus** | [**MapStatusEnum**](#MapStatusEnum) | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  |  [optional]
**similarityScore** | **Double** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  |  [optional]
**confidenceScore** | **Double** | Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence.  |  [optional]
**countryCode** | **String** | ISO2 country code corresponding to the location of the matched entity. |  [optional]
**countryName** | **String** | Country name corresponding to the location of the matched entity |  [optional]
**stateCode** | **String** | Two character state code corresponding to the location of the matched entity. |  [optional]
**stateName** | **String** | State name corresponding to the location of the matched entity. |  [optional]
**sicCode** | **String** | Standard Industrial Classification (SIC) Code of the matched entity. |  [optional]
**entityTypeCode** | **String** | Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. |  [optional]
**entityTypeDescription** | **String** | Description of of the matched entity&#39;s type. |  [optional]
**entitySubTypeCode** | **String** | Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. |  [optional]
**locationCity** | **String** | City where the matched entity is located. |  [optional]
**regionName** | **String** | Region where the matched entity is located. |  [optional]
**factsetIndustryCode** | **String** | FactSet Industry Classification Code of the matched entity. |  [optional]
**factsetIndustryName** | **String** | Name of the matched entity&#39;s FactSet Industry Classification. |  [optional]
**factsetSectorCode** | **String** | Name of the matched entity&#39;s FactSet Sector Classification Code. |  [optional]
**factsetSectorName** | **String** | Name of the matched entity&#39;s FactSet Sector Classification. |  [optional]
**parentName** | **String** | Name of the matched entity&#39;s parent entity. |  [optional]
**parentMatchFlag** | **Boolean** | Flag denoting that the matched entity is the parent of another match. |  [optional]
**clientId** | **String** | Unique Identifer provided by the user in the request to represent the entity Name being requested. |  [optional]
**clientName** | **String** | Name of the entity to match as specified in the request |  [optional]
**clientCountry** | **String** | ISO2 country code specified in the request. |  [optional]
**clientState** | **String** | State code specified in the request. |  [optional]
**clientUrl** | **String** | URL specified in the request. |  [optional]
**nameMatchString** | **String** | String on which the Concordance algorithm mapped the submitted entity. |  [optional]
**nameMatchSource** | **String** | Type of name that the nameMatchString matched. |  [optional]



## Enum: MapStatusEnum

Name | Value
---- | -----
MAPPED | &quot;MAPPED&quot;
UNMAPPED | &quot;UNMAPPED&quot;
INDETERMINATE | &quot;INDETERMINATE&quot;


## Implemented Interfaces

* Serializable


