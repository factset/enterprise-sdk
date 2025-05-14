# vermilion.DataSourceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSourceId** | **Number** | Unique Identifier for the Data Source. | [optional] 
**name** | **String** | Name of the Data Source. | [optional] 
**code** | **String** | Code of the Data Source. | [optional] 
**dsType** | **String** | Type of the Data Source. | [optional] 
**entities** | [**[EntityDTO]**](EntityDTO.md) | An array of entities that are used in the Data Source. | [optional] 
**outputRecordSet** | **String** | Recordset name that is used for output in the Data Source. | [optional] 
**releaseTag** | **String** | Release tag associated with the Data Source. | [optional] 
**defaultDataSourceName** | **String** | Name of the default Data Source. | [optional] 
**dataPreview** | **String** | Name of the component/report used for Data Source preview. | [optional] 
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated the Data Source. | [optional] 
**lastUpdated** | **Number** | The timestamp of the most recent update in epoch format of the Data Source | [optional] 



## Enum: DsTypeEnum


* `AUTOMATIC` (value: `"AUTOMATIC"`)

* `MANUAL` (value: `"MANUAL"`)

* `FILTER` (value: `"FILTER"`)




