

# FIABCalculationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt. |  [optional]
**startdatetime** | **OffsetDateTime** |  |  [optional]
**completiondatetime** | **OffsetDateTime** |  |  [optional]
**progress** | **Integer** |  |  [optional]
**batchevents** | [**java.util.List&lt;EventSummary&gt;**](EventSummary.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
INPROGRESS | &quot;InProgress&quot;
DONE | &quot;Done&quot;
PAUSED | &quot;Paused&quot;
CANCELLED | &quot;Cancelled&quot;
ERROR | &quot;Error&quot;


## Implemented Interfaces

* Serializable


