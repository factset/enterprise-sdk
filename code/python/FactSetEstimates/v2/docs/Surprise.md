# Surprise


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** |  | [optional] 
**date** | **date** | Date for data expressed in YYYY-MM-DD format. | [optional] 
**currency** | **str** | Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**metric** | **str** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**statistic** | **str** | Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). | [optional] 
**periodicity** | **str** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported. | [optional] 
**fiscal_end_date** | **date** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format | [optional] 
**fiscal_year** | **int** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**fiscal_period** | **int** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**surprise_date** | **date** | Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**surprise_amount** | **float** | Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**surprise_percent** | **float** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**surprise_before** | **float** | Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**surprise_after** | **float** | Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**event_description** | **str** | Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**event_flag** | **int** | Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**request_id** | **str** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


