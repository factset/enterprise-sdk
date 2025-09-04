# TimeSeriesResponseObjectItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security&#39;s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 
**date** | **date, none_type** | Date associated with FQL formula. | [optional] 
**error_message** | **str, none_type** | If error is non-zero, errorMessage will display the FQL formula error. | [optional] 
**display_name** | **str, none_type** | Display Name. | [optional] 
**request_id** | **str** | Identifier requested. | [optional] 
**error** | **int** | Indicates that there was an error in the execution of the FQL Formula. * Zero - success * Non-zero - failure  | [optional] 
**formula** | **str** | FQL formula requested. | [optional] 
**data_type** | **str, none_type** | Type of data returned in &#x60;result&#x60; | [optional] 
**object_type** | **str** | Type of object returned in &#x60;result&#x60; | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


