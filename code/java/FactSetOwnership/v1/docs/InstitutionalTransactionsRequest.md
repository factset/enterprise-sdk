

# InstitutionalTransactionsRequest

Institutional Transactions Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | List of identifiers. | 
**startDate** | **LocalDate** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **LocalDate** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**topNHolders** | **TopNHolders** |  |  [optional]
**holderType** | **HolderType** |  |  [optional]
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**frequency** | **Frequency** |  |  [optional]


## Implemented Interfaces

* Serializable


