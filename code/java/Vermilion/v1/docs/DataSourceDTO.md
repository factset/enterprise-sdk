

# DataSourceDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSourceId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**dsType** | [**DsTypeEnum**](#DsTypeEnum) |  |  [optional]
**entities** | [**java.util.List&lt;EntityDTO&gt;**](EntityDTO.md) |  |  [optional]
**outputRecordSet** | **String** |  |  [optional]
**releaseTag** | **String** |  |  [optional]
**lastUpdatedBy** | **String** |  |  [optional]
**lastUpdated** | **BigDecimal** |  |  [optional]



## Enum: DsTypeEnum

Name | Value
---- | -----
AUTOMATIC | &quot;AUTOMATIC&quot;
MANUAL | &quot;MANUAL&quot;
FILTER | &quot;FILTER&quot;


## Implemented Interfaces

* Serializable


