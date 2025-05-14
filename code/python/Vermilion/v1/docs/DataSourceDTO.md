# DataSourceDTO

A DataSource object aggregates data from multiple providers, such as APIs, databases, or file systems, to simplify access and processing.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_source_id** | **int** | Unique Identifier for the Data Source. | [optional] 
**name** | **str** | Name of the Data Source. | [optional] 
**code** | **str** | Code of the Data Source. | [optional] 
**ds_type** | **str** | Type of the Data Source. | [optional] 
**entities** | [**[EntityDTO]**](EntityDTO.md) | An array of entities that are used in the Data Source. | [optional] 
**output_record_set** | **str** | Recordset name that is used for output in the Data Source. | [optional] 
**release_tag** | **str** | Release tag associated with the Data Source. | [optional] 
**default_data_source_name** | **str** | Name of the default Data Source. | [optional] 
**data_preview** | **str** | Name of the component/report used for Data Source preview. | [optional] 
**last_updated_by** | **str** | Indicates the username of the person who last updated the Data Source. | [optional] 
**last_updated** | **float** | The timestamp of the most recent update in epoch format of the Data Source | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


