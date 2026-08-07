

# AustraliaBranch

A single Australian bank branch or service channel location record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Request identifier |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**coverage** | **AustraliaCoverage** |  | 
**locationId** | **Integer** | Unique location identifier |  [optional]
**serviceChannelType** | [**ServiceChannelTypeEnum**](#ServiceChannelTypeEnum) | Type of service channel |  [optional]
**numServiceChannel** | **Integer** | Number of service channels at this location |  [optional]
**remotenessArea** | **String** | Remoteness classification |  [optional]
**sa2Code** | **Integer** | Statistical Area Level 2 code - ABS |  [optional]
**state** | **String** | Australian state or territory full name |  [optional]
**address** | **String** | Full address |  [optional]
**latitude** | **Double** | Latitude coordinate |  [optional]
**longitude** | **Double** | Longitude coordinate |  [optional]



## Enum: ServiceChannelTypeEnum

Name | Value
---- | -----
BRANCH | &quot;BRANCH&quot;
ATMS | &quot;ATMS&quot;
OTHER_FACE_TO_FACE | &quot;OTHER_FACE_TO_FACE&quot;


## Implemented Interfaces

* Serializable


