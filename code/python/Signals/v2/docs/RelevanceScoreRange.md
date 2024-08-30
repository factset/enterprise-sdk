# RelevanceScoreRange

Represents a valid range for user relevancy score for signal events. The upper bound of the range is represented by the attribute **gt** or **gte**. The lower bound of the range is presented by **lt** or **lte** The range can contain either of the bounds or both. e.g. { \"gt\": 0.4, \"lt\": 0.8 } 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gt** | **float** | A date/time string in ISO 8601 format. gt stands for greater than | [optional] 
**gte** | **float** | A date/time string in ISO 8601 format. gte stands for greater than or equal to | [optional] 
**lt** | **float** | A date/time string in ISO 8601 format. lt stands for less than | [optional] 
**lte** | **float** | A date/time string in ISO 8601 format. lte stands for less than or equal to | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


