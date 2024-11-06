# SegmentsEstimate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the securityâ€™s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**segment_type** | **str, none_type** | Segment selected | [optional] 
**metric** | **str, none_type** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034) | [optional] 
**fiscal_period** | **int, none_type** | Company&#39;s &#39;fiscal period&#39; for the estimate record. Periods for periodicity of ANN &#x3D; 1, and SEMI &#x3D; 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598). | [optional] 
**fiscal_year** | **int, none_type** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**segment_label** | **str, none_type** | Displays the specific label of the segment. | [optional] 
**segment_level** | **str, none_type** | Returns the level of the segment item as either P &#x3D; Parent or S &#x3D; Subordinate | [optional] 
**fiscal_end_date** | **date, none_type** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**estimate_date** | **date, none_type** | The date the estimates are as of in YYYY-MM-DD format. | [optional] 
**currency** | **str, none_type** | Currency used estimates in consensus calculations. Use &#39;ESTIMATE&#39; as input for values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**estimate_currency** | **str, none_type** | Estimate currency of the requested Security | [optional] 
**mean** | **float, none_type** | Mean of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114) | [optional] 
**median** | **float, none_type** | Median of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114) | [optional] 
**standard_deviation** | **float, none_type** | Standard deviation of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114) | [optional] 
**high** | **float, none_type** | Highest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). | [optional] 
**low** | **float, none_type** | Lowest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114) | [optional] 
**estimate_count** | **int, none_type** | Count or NEST of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114) | [optional] 
**up** | **int, none_type** | Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). | [optional] 
**down** | **int, none_type** | Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


