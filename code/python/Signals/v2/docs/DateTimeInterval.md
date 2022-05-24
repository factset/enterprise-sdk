# DateTimeInterval

Represents a valid date/time interval. The upper bound of the interval is represented by the attribute **gt** or **gte**. The lower bound of the interval is presented by **lt** or **lte** The interval can contain either of the bounds or both. e.g. { \"gt\": \"2021-05-01T00:00:00.000Z\", \"lt\": \"2021-05-08T00:00:00.000Z\" } 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gt** | **datetime** | A date/time string in ISO 8601 format. | [optional] 
**gte** | **datetime** | A date/time string in ISO 8601 format. | [optional] 
**lt** | **datetime** | A date/time string in ISO 8601 format. | [optional] 
**lte** | **datetime** | A date/time string in ISO 8601 format. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


