# PeopleDecisions

Concordance Entity Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_role** | **bool, none_type** | If the role is active or not of the person. | [optional] 
**client_entity** | **str, none_type** | Name of the entity of the client.  | [optional] 
**client_id** | **str, none_type** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**client_first_name** | **str, none_type** | First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_last_name** | **str, none_type** | Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_middle_name** | **str, none_type** | Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_salutation** | **str, none_type** | Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_suffix** | **str, none_type** | Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_priority** | **str, none_type** | Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**client_person_name** | **str, none_type** | The name provided by the client. | [optional] 
**email** | **str, none_type** | The email address of the client. | [optional] 
**entity** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**map_status** | **str, none_type** | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**first_name** | **str, none_type** | Name of the column in the input file that contains the first name. | [optional] 
**last_name** | **str, none_type** | Name of the column in the input file that contains the first name.  | [optional] 
**middle_name** | **str, none_type** | Name of the column in the input file that contains the middle name.  | [optional] 
**person_id** | **str, none_type** | The id of the person. | [optional] 
**name_match_string** | **str, none_type** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**person_name** | **str, none_type** | Name of the column in the input file that contains the person name.  | [optional] 
**suffix** | **str, none_type** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**similarity_score** | **float, none_type** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**row_index** | **int, none_type** | Row number for match in the request or input file. | [optional] 
**task_id** | **int, none_type** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**title** | **str, none_type** | The title of the person. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


