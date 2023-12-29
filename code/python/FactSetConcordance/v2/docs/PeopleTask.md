# PeopleTask

Concordance People Task object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id_column** | **str, none_type** | The number of columns of client.  | [optional] 
**person_name_column** | **str, none_type** | The person name as provided in request. | [optional] 
**first_name_column** | **str, none_type** | The first name of the client. | [optional] 
**last_name_column** | **str, none_type** | The last name of the person. | [optional] 
**middle_name_column** | **str, none_type** | The middle name of the client. | [optional] 
**priority_column** | **str, none_type** | The middle name of the client. | [optional] 
**salutation_column** | **str, none_type** | The salutation of the person. | [optional] 
**additional_context_columns** | **[str]** | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 
**has_result** | **bool, none_type** | Whether the result is available. | [optional] 
**task_action** | **str, none_type** | Action status for the Concordance Task process. | [optional] 
**input_file** | **str, none_type** | The input file is posted as a file object in the form.  | [optional] 
**entity_column** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**status** | **str, none_type** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**suffix_column** | **str, none_type** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**task_submit_time** | **datetime, none_type** | Time the Task was submitted in UTC. | [optional] 
**unmapped_count** | **int, none_type** | Number of records with status of UNMAPPED the Input File. | [optional] 
**try_count** | **int, none_type** | Number of tries made so far for the request. | [optional] 
**decision_rate** | **float, none_type** | Percentage of mapped entities in the Input File. | [optional] 
**process_start_time** | **datetime, none_type** | Process start time in UTC. | [optional] 
**process_duration** | **float, none_type** | Process duration in seconds. | [optional] 
**mapped_count** | **int, none_type** | Number of records with status of MAPPED the Input File. | [optional] 
**message** | **str, none_type** | Textual message for the status. | [optional] 
**error** | **str, none_type** |  | [optional] 
**error_title** | **str, none_type** |  | [optional] 
**input_count** | **int, none_type** | Number of records in the Input File. | [optional] 
**indeterminate_count** | **int, none_type** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**task_id** | **int, none_type** | The task identifier | [optional] 
**task_name** | **str, none_type** | The task name | [optional] 
**universe_id** | **int, none_type** | The universe identifier | [optional] 
**universe_name** | **str, none_type** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**user_full_name** | **str, none_type** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**user_serial** | **str, none_type** | user-serial of the person who initiated the people task  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


