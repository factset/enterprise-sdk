

# JobOverrides

If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendar** | **Calendar** |  |  [optional]
**combinations** | [**java.util.List&lt;JobOverridesCombinationsRoot&gt;**](JobOverridesCombinationsRoot.md) | An array of date account combinations |  [optional]
**dates** | [**JobOverridesDates**](JobOverridesDates.md) |  |  [optional]
**frequency** | **Frequency** |  |  [optional]
**runAsOfDate** | **LocalDate** | PUB |  [optional]
**runAsSerialNumber** | **String** | The FactSet serial number which has the credentials wanted to run the job |  [optional]
**tasks** | **java.util.List&lt;String&gt;** | Used only for jobs where type is PA |  [optional]


## Implemented Interfaces

* Serializable


