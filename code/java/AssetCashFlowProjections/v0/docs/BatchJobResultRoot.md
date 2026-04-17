

# BatchJobResultRoot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID generated on trigerring the batch |  [optional]
**duration** | **String** | Time taken to run the batch represented in HH:MM:SS |  [optional]
**jobs** | [**java.util.List&lt;BatchJobResults&gt;**](BatchJobResults.md) | Job id generated in the batch |  [optional]
**name** | **String** | Name of the ACFP document trigerred |  [optional]
**runDate** | **LocalDate** | Date and time of the trigeered batch represented in MM/DD/YYYY HH:MM:SS |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the batch |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
COMPLETED | &quot;completed&quot;
CANCELLED | &quot;cancelled&quot;


## Implemented Interfaces

* Serializable


