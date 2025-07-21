

# NrtCallsRequestByTicker

Search criteria for NRT calls based on ticker, entity, or status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** | Ticker-region identifier for the company hosting the event. |  [optional]
**entityId** | **String** | FactSet entity level identifier for the company hosting the event. |  [optional]
**callStatus** | [**CallStatusEnum**](#CallStatusEnum) | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. |  [optional]



## Enum: CallStatusEnum

Name | Value
---- | -----
INPROGRESS | &quot;InProgress&quot;
ENDED | &quot;Ended&quot;
EWN | &quot;EWN&quot;
ISSUEATSOURCE | &quot;IssueAtSource&quot;


## Implemented Interfaces

* Serializable


