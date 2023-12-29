# PeopleMappingRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. | 
**universe_id** | **int** | A unique identifier supplied to a person to save the data into his/her universe. | 
**client_entity** | **str** | Used to describe the company of the person | [optional] 
**client_first_name** | **str** | Used to describe the first name of the person | [optional] 
**client_last_name** | **str** | Used to describe the last name of the person. | [optional] 
**client_middle_name** | **str** | Used to describe the middle name of the person. | [optional] 
**client_person_name** | **str** | Used to describe the name of the person | [optional] 
**client_priority** | **str** | Used to indicate the priority of the person | [optional] 
**client_salutation** | **str** | Used to indicate the salutation of the person | [optional] 
**client_suffix** | **str** | Used to indicate the suffix for the person&#39;s name | [optional] 
**client_additional_context** | **{str: (str,)}** | Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records.  | [optional] 
**person_id** | **str** | A unique identifier used to identify a person. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


