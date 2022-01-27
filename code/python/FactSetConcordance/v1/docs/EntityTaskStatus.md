# EntityTaskStatus

Concordance Entity Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_id** | **int** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**task_name** | **str** | User-defined name for the task used to name the output file. | [optional] 
**task_action** | **str** | Action status for the Concordance Task process. | [optional] 
**status** | **str** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**input_file** | **str** | The input file is posted as a file object in the form.  | [optional] 
**client_id_column** | **str** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**name_column** | **str** | Name of the column in the input file that contains the entity name to be matched. | [optional] 
**country_column** | **str** | Name of the column in the input file that contains the ISO2 country code corresponding to the entity name.  The country code is used when evaluating candidates for a match.  | [optional] 
**state_column** | **str** | Name of the column in the input file that contains the Two-character state code corresponding to the entity name. The state code is used when evaluating candidates for a match.  | [optional] 
**url_column** | **str** | Name of the column in the input file that contains the URL corresponding to the entity name. The URL is used when evaluating candidates for a match.  | [optional] 
**has_result** | **bool** | Flag denoting the taskId has a result. | [optional] 
**task_submit_time** | **datetime** | Time the Task was submitted in UTC. | [optional] 
**message** | **str** | Textual message for the status. | [optional] 
**input_count** | **int** | Number of records in the Input File. | [optional] 
**mapped_count** | **int** | Number of records with status of MAPPED the Input File. | [optional] 
**unmapped_count** | **int** | Number of records with status of UNMAPPED the Input File. | [optional] 
**indeterminate_count** | **int** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**process_start_time** | **datetime** | Process start time in UTC. | [optional] 
**process_duration** | **float** | Process duration in seconds. | [optional] 
**try_count** | **int** | Number of tries made so far for the request. | [optional] 
**decision_rate** | **float** | Percentage of mapped entities in the Input File. | [optional] 
**error** | **str** |  | [optional] 
**error_title** | **str** |  | [optional] 
**include_entity_type** | **[str]** | Requested Entity types to include.  | [optional] 
**exclude_entity_type** | **[str]** | Requested Entity types to exclude.  | [optional] 
**include_entity_sub_type** | **[str]** | Requested Entity subtypes to include.  | [optional] 
**exclude_entity_sub_type** | **[str]** | Requested Entity subtypes to exclude.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


