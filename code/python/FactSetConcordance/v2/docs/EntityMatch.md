# EntityMatch

Entity Match object showing the decision reached for each Entity. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universe_id** | **int, none_type** | The id of the universe that entities should be mapped to | [optional] 
**task_id** | **int, none_type** | Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow.  | [optional] 
**row_index** | **int, none_type** | Row number for match in the request or input file. | [optional] 
**match_flag** | **bool, none_type** | Flag denoting if the row is a match. | [optional] 
**entity_id** | **str, none_type** | FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)  | [optional] 
**entity_name** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**url** | **str, none_type** | URL of the matched entity. | [optional] 
**map_status** | **str, none_type** | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**similarity_score** | **float, none_type** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**confidence_score** | **float, none_type** | Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence.  | [optional] 
**country_code** | **str, none_type** | ISO2 country code corresponding to the location of the matched entity. | [optional] 
**country_name** | **str, none_type** | Country name corresponding to the location of the matched entity | [optional] 
**state_code** | **str, none_type** | Two character state code corresponding to the location of the matched entity. | [optional] 
**state_name** | **str, none_type** | State name corresponding to the location of the matched entity. | [optional] 
**sic_code** | **str, none_type** | Standard Industrial Classification (SIC) Code of the matched entity. | [optional] 
**entity_type_code** | **str, none_type** | Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. | [optional] 
**entity_type_description** | **str, none_type** | Description of of the matched entity&#39;s type. | [optional] 
**entity_sub_type_code** | **str, none_type** | Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. | [optional] 
**location_city** | **str, none_type** | City where the matched entity is located. | [optional] 
**region_name** | **str, none_type** | Region where the matched entity is located. | [optional] 
**factset_industry_code** | **str, none_type** | FactSet Industry Classification Code of the matched entity. | [optional] 
**factset_industry_name** | **str, none_type** | Name of the matched entity&#39;s FactSet Industry Classification. | [optional] 
**factset_sector_code** | **str, none_type** | Name of the matched entity&#39;s FactSet Sector Classification Code. | [optional] 
**factset_sector_name** | **str, none_type** | Name of the matched entity&#39;s FactSet Sector Classification. | [optional] 
**parent_name** | **str, none_type** | Name of the matched entity&#39;s parent entity. | [optional] 
**parent_match_flag** | **bool, none_type** | Flag denoting that the matched entity is the parent of another match. | [optional] 
**client_id** | **str, none_type** | Unique Identifer provided by the user in the request to represent the entity Name being requested. | [optional] 
**client_name** | **str, none_type** | Name of the entity to match as specified in the request | [optional] 
**client_country** | **str, none_type** | ISO2 country code specified in the request. | [optional] 
**client_state** | **str, none_type** | State code specified in the request. | [optional] 
**client_url** | **str, none_type** | URL specified in the request. | [optional] 
**name_match_string** | **str, none_type** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**name_match_source** | **str, none_type** | Type of name that the nameMatchString matched. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


