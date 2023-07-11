# Surprise


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** |  | [optional] 
**date** | **date, none_type** | Date for data expressed in YYYY-MM-DD format. | [optional] 
**currency** | **str, none_type** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**estimate_currency** | **str, none_type** | Estimate currency of the requested Security | [optional] 
**metric** | **str, none_type** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**statistic** | **str, none_type** | Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). | [optional] 
**periodicity** | **str, none_type** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported. | [optional] 
**fiscal_end_date** | **date, none_type** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format | [optional] 
**fiscal_year** | **int, none_type** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**fiscal_period** | **int, none_type** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**surprise_date** | **date, none_type** | Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**surprise_amount** | **float, none_type** | Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**surprise_percent** | **float, none_type** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**surprise_before** | **float, none_type** | Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**surprise_after** | **float, none_type** | Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**event_description** | **str, none_type** | Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**event_flag** | **int, none_type** | Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**request_id** | **str** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


