# QnAAnswerParameters

Schema that defines the parameters needed to be supplied for generating answer(s).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **str** | The text input that provides the context | 
**question** | **str** | Question associated to the provided context | 
**number_of_answers** | **int** | Number of answers for the question | [optional]  if omitted the server will use the default value of 2
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


