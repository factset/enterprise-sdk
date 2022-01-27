

# Pagination

List of pagination objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | Total number of files the API returns for a particular query |  [optional]
**isEstimatedTotal** | **Boolean** | Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to  “False” as the API should always return the exact count |  [optional]
**limit** | **Integer** | Number of results returned per page |  [optional]
**offset** | **Integer** | The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results |  [optional]


## Implemented Interfaces

* Serializable


