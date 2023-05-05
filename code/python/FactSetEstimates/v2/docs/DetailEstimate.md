# DetailEstimate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** |  | [optional] 
**metric** | **str** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**periodicity** | **str** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. | [optional] 
**fiscal_year** | **int** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**fiscal_period** | **int** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**fiscal_end_date** | **date** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format | [optional] 
**relative_period** | **int** | &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**currency** | **str** | Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**estimate_date** | **date** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**estimate_value** | **float** | The value of the estimate. | [optional] 
**analyst_id** | **str** | The FactSet Entity Identifier for the analyst making the estimate. | [optional] 
**analyst_name** | **str** | The name of the analyst making the estimate. | [optional] 
**broker_id** | **str** | The FactSet Entity Identifier for the broker making the estimate. | [optional] 
**broker_name** | **str** | The name of the broker making the estimate. | [optional] 
**prev_estimate_date** | **date** | Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**prev_estimate_value** | **float** | The value of the previous estimate. | [optional] 
**section** | **str** | Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus | [optional] 
**status_code** | **int** | Status code of the estimate. | [optional] 
**status_text** | **str** | Status description of the estimate. | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**input_date_time** | **str** | Date and time when the data is available at the source. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


