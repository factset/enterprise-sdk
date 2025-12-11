# Guidance


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Guidance identifier to be used as &#x60;guidance&#x60; input in the endpoint. | [optional] 
**fsym_id** | **str, none_type** | FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**metric** | **str, none_type** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034) | [optional] 
**currency** | **str, none_type** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**estimate_currency** | **str, none_type** | Estimate currency of the requested Security | [optional] 
**periodicity** | **str, none_type** | The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA. | [optional] 
**consensus_date** | **date, none_type** | The perspective date representing the current consensus among analysts as of today, visit [Online Assistant Page | [optional] 
**fiscal_year** | **int, none_type** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**fiscal_end_date** | **date, none_type** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**relative_period** | **int, none_type** | &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**fiscal_period** | **int, none_type** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**guidance_date** | **date, none_type** | Date guidance was issued expressed in YYYY-MM-DD format. | [optional] 
**input_date_high** | **date, none_type** | Represents the date FactSet collected the data in YYYY-MM-DD format for guidance high. | [optional] 
**input_date_low** | **date, none_type** | Represents the date FactSet collected the data in YYYY-MM-DD format for guidance low. | [optional] 
**input_date_high_time** | **datetime, none_type** | Represents the date and timestamp FactSet collected the data in YYYY-MM-DD HH:MM:SS.SSS format for guidance high. | [optional] 
**input_date_low_time** | **datetime, none_type** | Represents the date and timestamp FactSet collected the data in YYYY-MM-DD HH:MM:SS.SSS format for guidance low. | [optional] 
**guidance_midpoint** | **float, none_type** |  Represents the central value in a range of projected financial guidance. | [optional] 
**guidance_low** | **float, none_type** | Represents the lower end of the projected financial guidance range. | [optional] 
**guidance_high** | **float, none_type** | Represents the upper end of the projected financial guidance range. | [optional] 
**guidance_range** | **str, none_type** | Represents the span between the lowest and highest values in the projected financial guidance. | [optional] 
**prev_midpoint** | **float, none_type** | This refers to the average or central point of the financial guidance range given in a prior period. | [optional] 
**prev_low** | **float, none_type** | Refers to the lowest value or estimate in a financial guidance range provided in a previous period. | [optional] 
**prev_high** | **float, none_type** | Refers to the highest value or estimate in a financial guidance range provided in a previous period. | [optional] 
**mean_before** | **float, none_type** | This is the consensus value the day before the guidance was issued. If guidance was previously issued for the period in question, this consensus will only include estimates that have been updated since the previous update. | [optional] 
**mean_surprise_amt** | **float, none_type** |  This is the difference between the before value and the guidance. | [optional] 
**mean_surprise_amt_percent** | **float, none_type** | This represents the percentage difference between the before value and the guidance actual. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


