# PeopleTaskStatus

Concordance People Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id_column** | **str, none_type** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**decision_rate** | **int, none_type** | Percentage of mapped entities in the Input File. | [optional] 
**entity_column** | **str, none_type** | Name of the column of the entity.  | [optional] 
**first_name_column** | **str, none_type** | Name of the column in the input file that contains the first name. | [optional] 
**has_result** | **bool, none_type** | Whether the result is available. | [optional] 
**input_count** | **int, none_type** | Number of records in the Input File. | [optional] 
**input_file** | **str, none_type** | The input file is posted as a file object in the form.  | [optional] 
**last_name_column** | **str, none_type** | Name of the column in the input file that contains the first name.  | [optional] 
**mapped_count** | **int, none_type** | Number of records with status of MAPPED the Input File. | [optional] 
**middle_name_column** | **str, none_type** | Name of the column in the input file that contains the middle name.  | [optional] 
**person_name_column** | **str, none_type** | Name of the column in the input file that contains the person name.  | [optional] 
**priority_column** | **str, none_type** | Name of the column in the input file that contains the priority.  | [optional] 
**process_start_time** | **datetime, none_type** | Process start time in UTC. | [optional] 
**process_duration** | **float, none_type** | Process duration in seconds. | [optional] 
**salutation_column** | **str, none_type** | Name of the column in the input file that contains the person&#39;s salutation.  | [optional] 
**status** | **str, none_type** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**suffix_column** | **str, none_type** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**task_action** | **str, none_type** | Action status for the Concordance Task process. | [optional] 
**task_id** | **int, none_type** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**task_name** | **str, none_type** | User-defined name for the task used to name the output file. | [optional] 
**unmapped_count** | **int, none_type** | Number of records with status of UNMAPPED the Input File. | [optional] 
**try_count** | **int, none_type** | Number of tries made so far for the request. | [optional] 
**message** | **str, none_type** | Textual message for the status. | [optional] 
**error** | **str, none_type** |  | [optional] 
**error_title** | **str, none_type** |  | [optional] 
**indeterminate_count** | **int, none_type** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**task_submit_time** | **datetime, none_type** | Time the Task was submitted in UTC. | [optional] 
**universe_id** | **int, none_type** | The universe identifier | [optional] 
**universe_name** | **str, none_type** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**user_full_name** | **str, none_type** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**user_serial** | **str, none_type** | user-serial of the person who initiated the entity task. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


