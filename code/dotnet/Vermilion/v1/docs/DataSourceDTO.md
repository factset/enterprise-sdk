# FactSet.SDK.Vermilion.Model.DataSourceDTO
A DataSource object aggregates data from multiple providers, such as APIs, databases, or file systems, to simplify access and processing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataSourceId** | **int** | Unique Identifier for the Data Source. | [optional] 
**Name** | **string** | Name of the Data Source. | [optional] 
**Code** | **string** | Code of the Data Source. | [optional] 
**DsType** | **string** | Type of the Data Source. | [optional] 
**Entities** | [**List&lt;EntityDTO&gt;**](EntityDTO.md) | An array of entities that are used in the Data Source. | [optional] 
**OutputRecordSet** | **string** | Recordset name that is used for output in the Data Source. | [optional] 
**ReleaseTag** | **string** | Release tag associated with the Data Source. | [optional] 
**DefaultDataSourceName** | **string** | Name of the default Data Source. | [optional] 
**DataPreview** | **string** | Name of the component/report used for Data Source preview. | [optional] 
**LastUpdatedBy** | **string** | Indicates the username of the person who last updated the Data Source. | [optional] 
**LastUpdated** | **decimal** | The timestamp of the most recent update in epoch format of the Data Source | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

