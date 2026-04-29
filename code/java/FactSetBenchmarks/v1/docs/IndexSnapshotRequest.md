

# IndexSnapshotRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. | 
**date** | **String** | Date of holding expressed in YYYY-MM-DD format. |  [optional]
**returnType** | **ReturnType** |  |  [optional]
**currency** | **String** | Currency for response. Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**calendar** | **String** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. |  [optional]


## Implemented Interfaces

* Serializable


