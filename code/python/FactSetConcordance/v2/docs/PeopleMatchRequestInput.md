# PeopleMatchRequestInput


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**person_name** | **str** | The People name to match. | [optional] 
**client_id** | **str** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**salutation** | **str** | The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName.  | [optional] 
**first_name** | **str** | The first name of the person. This field should not be given along with personName.  | [optional] 
**middle_name** | **str** | The middle name of the person. This field should not be given along with personName.  | [optional] 
**last_name** | **str** | The last name of the person. This field should not be given along with personName.  | [optional] 
**additional_context** | **{str: (str,)}** | Any additional context information along with other input values that need to be saved for an entity during search. To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified.  | [optional] 
**suffix** | **str** | The suffix of person&#39;s name. This field should not be given along with personName.  | [optional] 
**entity** | **str** | The enity of the Person.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


