

# NRTSnippetsMetaPagination


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | Total number for results returned for a specific query |  [optional]
**isEstimatedTotal** | **Boolean** | This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results |  [optional]
**limit** | **Integer** | Number of results returned per page |  [optional]
**offset** | **Integer** | The flag indicating the position in the results array if additional results are available beyond the default value or the value in _paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retrieve subsequent results |  [optional]


## Implemented Interfaces

* Serializable


