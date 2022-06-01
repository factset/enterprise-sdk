# PeopleTask

People Match object showing the decision reached for each Entity. 

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
**has_result** | **bool, none_type** | Whether the result is available. | [optional] 
**task_action** | **str, none_type** | Action status for the Concordance Task process. | [optional] 
**input_file** | **str, none_type** | The input file is posted as a file object in the form.  | [optional] 
**entity_column** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**status** | **str, none_type** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**suffix_column** | **str, none_type** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**task_submit_time** | **datetime, none_type** | Time the Task was submitted in UTC. | [optional] 
**task_id** | **int, none_type** | The task identifier | [optional] 
**task_name** | **str, none_type** | The task name | [optional] 
**universe_id** | **int, none_type** | The universe identifier | [optional] 
**universe_name** | **str, none_type** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**user_serial** | **str, none_type** | user-serial of the person who initiated the entity task. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


