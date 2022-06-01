# EntityTaskStatus

Concordance Entity Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_id** | **int, none_type** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**task_name** | **str, none_type** | User-defined name for the task used to name the output file. | [optional] 
**task_action** | **str, none_type** | Action status for the Concordance Task process. | [optional] 
**status** | **str, none_type** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**input_file** | **str, none_type** | The input file is posted as a file object in the form.  | [optional] 
**client_id_column** | **str, none_type** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**name_column** | **str, none_type** | Name of the column in the input file that contains the entity name to be matched. | [optional] 
**country_column** | **str, none_type** | Name of the column in the input file that contains the ISO2 country code corresponding to the entity name.  The country code is used when evaluating candidates for a match.  | [optional] 
**state_column** | **str, none_type** | Name of the column in the input file that contains the Two-character state code corresponding to the entity name. The state code is used when evaluating candidates for a match.  | [optional] 
**url_column** | **str, none_type** | Name of the column in the input file that contains the URL corresponding to the entity name. The URL is used when evaluating candidates for a match.  | [optional] 
**has_result** | **bool, none_type** | Flag denoting the taskId has a result. | [optional] 
**task_submit_time** | **datetime, none_type** | Time the Task was submitted in UTC. | [optional] 
**message** | **str, none_type** | Textual message for the status. | [optional] 
**input_count** | **int, none_type** | Number of records in the Input File. | [optional] 
**mapped_count** | **int, none_type** | Number of records with status of MAPPED the Input File. | [optional] 
**unmapped_count** | **int, none_type** | Number of records with status of UNMAPPED the Input File. | [optional] 
**indeterminate_count** | **int, none_type** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**process_start_time** | **datetime, none_type** | Process start time in UTC. | [optional] 
**process_duration** | **float, none_type** | Process duration in seconds. | [optional] 
**try_count** | **int, none_type** | Number of tries made so far for the request. | [optional] 
**decision_rate** | **float, none_type** | Percentage of mapped entities in the Input File. | [optional] 
**error** | **str, none_type** |  | [optional] 
**error_title** | **str, none_type** |  | [optional] 
**include_entity_type** | **[str, none_type]** | Requested Entity types to include.  | [optional] 
**exclude_entity_type** | **[str, none_type]** | Requested Entity types to exclude.  | [optional] 
**include_entity_sub_type** | **[str, none_type]** | Requested Entity subtypes to include.  | [optional] 
**exclude_entity_sub_type** | **[str, none_type]** | Requested Entity subtypes to exclude.  | [optional] 
**user_serial** | **str, none_type** | user-serial of the person who initiated the entity task. | [optional] 
**user_full_name** | **str, none_type** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**universe_id** | **int, none_type** | The universe id this task was submitted to.  | [optional] 
**universe_name** | **str, none_type** | The name of the universe this task was submitted to.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


