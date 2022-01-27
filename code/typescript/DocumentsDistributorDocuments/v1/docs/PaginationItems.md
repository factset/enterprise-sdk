# documentsdistributordocuments.PaginationItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Number** | Total number of files the API returns for a particular query | [optional] 
**isEstimatedTotal** | **Boolean** | Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to False as the API should always return the exact count | [optional] 
**limit** | **Number** | Number of results returned per page | [optional] 
**offset** | **Number** | The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). Thiis value is passed in the _paginationOffset parameter to retreieve subsequent results | [optional] 


