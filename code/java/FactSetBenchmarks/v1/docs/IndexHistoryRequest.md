

# IndexHistoryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. | 
**startDate** | **String** | Requested start date expressed in YYYY-MM-DD format. |  [optional]
**endDate** | **String** | Requested end date for Range expressed in YYYY-MM-DD format. |  [optional]
**frequency** | **Frequency** |  |  [optional]
**returnType** | **ReturnType** |  |  [optional]
**hedgeType** | **HedgeType** |  |  [optional]
**currency** | **String** | Currency for response. |  [optional]
**calendar** | **String** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. |  [optional]
**impliedDate** | **ImpliedDate** |  |  [optional]


## Implemented Interfaces

* Serializable


