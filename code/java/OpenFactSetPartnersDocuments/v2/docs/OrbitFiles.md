

# OrbitFiles

Returns Orbit Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stockCode** | **String** | The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  |  [optional]
**eventStartDateTime** | **OffsetDateTime** | The timestamp when latest version of the call was published at the source. |  [optional]
**eventEndDateTime** | **OffsetDateTime** | The timestamp when the file is last updated. |  [optional]
**typesOfInvestorRelationsActivities** | **String** | Specifies the type of the call. |  [optional]
**transcriptUniqueId** | **String** | Unique identifier for the transcript |  [optional]
**uploadTime** | **OffsetDateTime** | The timestamp when the transcript was last uploaded. |  [optional]
**title** | **String** | The headline of the transcript. |  [optional]
**exchangeCode** | **String** | Exchange Code |  [optional]
**versionId** | **Integer** | Helpful to distinguish corrected reports. |  [optional]
**fileName** | **String** | The filename of the transcript. |  [optional]
**fileTimestamp** | **OffsetDateTime** | The time when file is available for ingestion at the source. |  [optional]
**updateTimestamp** | **OffsetDateTime** | The time when file is processed. |  [optional]
**fileSize** | **Integer** | Defines the size of the file. |  [optional]
**url** | **String** | Download link for the transcripts provided by the Orbit feed. |  [optional]


## Implemented Interfaces

* Serializable


