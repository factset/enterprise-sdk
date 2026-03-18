# SegmentsDetailsEstimate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the securityâ€™s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**metric** | **str, none_type** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034) | [optional] 
**segment_id** | **str, none_type** | Use the /segments-metrics endpoint for a complete list. | [optional] 
**segment_type** | **str** | Controls the type of segment selected.   * **BUS** &#x3D; Business   * **GEO** &#x3D; Geographic  | [optional]  if omitted the server will use the default value of "BUS"
**fiscal_year** | **int, none_type** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**fiscal_period** | **int, none_type** | Company&#39;s &#39;fiscal period&#39; for the estimate record. Periods for periodicity of ANN &#x3D; 1, and SEMI &#x3D; 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598). | [optional] 
**fiscal_end_date** | **date, none_type** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**segment_label** | **str, none_type** | Displays the specific label of the segment. | [optional] 
**segment_level** | **str, none_type** | Returns the level of the segment item as either &#x60;P &#x3D; Parent&#x60; or &#x60;S &#x3D; Subordinate&#x60; | [optional] 
**currency** | **str, none_type** | Currency used estimates in consensus calculations. Use &#x60;ESTIMATE&#x60; as input for values in Estimate Currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page #1470&lt;/a&gt;. | [optional] 
**estimate_currency** | **str, none_type** | Estimate currency of the requested Security | [optional] 
**estimate_date** | **date, none_type** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/16598\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page | [optional] 
**estimate_value** | **float, none_type** | The value of the estimate. | [optional] 
**analyst_id** | **str, none_type** | The FactSet Entity Identifier for the analyst making the estimate. | [optional] 
**analyst_name** | **str, none_type** | The name of the analyst making the estimate. | [optional] 
**broker_id** | **str, none_type** | The FactSet Entity Identifier for the broker making the estimate. | [optional] 
**broker_name** | **str, none_type** | The name of the broker making the estimate. | [optional] 
**last_modified_date** | **date, none_type** | The date at which a broker provided an estimate that is a revision. | [optional] 
**prev_estimate_date** | **date, none_type** | Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**prev_estimate_value** | **float, none_type** | The value of the previous estimate. | [optional] 
**section** | **str, none_type** | Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus | [optional] 
**status_code** | **int, none_type** | Status code of the estimate. | [optional] 
**status_text** | **str, none_type** | Status description of the estimate. | [optional] 
**input_date_time** | **str, none_type** | Date and time when the data is available at the source. | [optional] 
**security_currency** | **str, none_type** | The currency that the company trades in. | [optional] 
**broker_estimate_currency** | **str, none_type** | The currency in which estimates are made by broker. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


