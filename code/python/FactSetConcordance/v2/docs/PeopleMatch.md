# PeopleMatch

People Match object showing the decision reached for each Entity. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_id** | **int, none_type** | Identifier denoting a specific Concordance task submitted by the user. This value will be null for /people-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow.  | [optional] 
**active_role** | **str, none_type** | This tells whether the person is now active in the entity | [optional] 
**client_entity** | **str, none_type** | The entity for which the person is working.  | [optional] 
**client_first_name** | **str, none_type** | First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_last_name** | **str, none_type** | Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_middle_name** | **str, none_type** | Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_salutation** | **str, none_type** | Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_suffix** | **str, none_type** | Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_priority** | **str, none_type** | Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_person_name** | **str, none_type** | The person name as provided in request. | [optional] 
**first_name** | **str, none_type** | The first name of the client. | [optional] 
**person_id** | **str, none_type** | The id of the person. | [optional] 
**last_name** | **str, none_type** | The last name of the person. | [optional] 
**middle_name** | **str, none_type** | The middle name of the client. | [optional] 
**suffix** | **str, none_type** | The suffix in the name of the person | [optional] 
**salutation** | **str, none_type** | Title of a person&#39;s name | [optional] 
**person_name** | **str, none_type** | Full name of the person matched | [optional] 
**email** | **str, none_type** | Email of the person | [optional] 
**client_id** | **str, none_type** | User defined person id provided when matched with FactSet person. | [optional] 
**entity** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**map_status** | **str, none_type** | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**match_flag** | **str, none_type** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**name_match_source** | **str, none_type** | Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence.  | [optional] 
**name_match_string** | **str, none_type** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**row_index** | **int, none_type** | Country name corresponding to the location of the matched entity | [optional] 
**similarity_score** | **float, none_type** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**title** | **str, none_type** | The title that the person is holding. | [optional] 
**universe_id** | **int, none_type** | The universe identifier | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


