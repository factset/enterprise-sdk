# FactSet.SDK.FactSetEstimates.Model.SegmentsDetailsEstimate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the securityâ€™s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Metric** | **string** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034) | [optional] 
**SegmentId** | **string** | Use the /segments-metrics endpoint for a complete list. | [optional] 
**SegmentType** | **string** | Controls the type of segment selected.   * **BUS** &#x3D; Business   * **GEO** &#x3D; Geographic  | [optional] [default to SegmentTypeEnum.BUS]
**FiscalYear** | **int?** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**FiscalPeriod** | **int?** | Company&#39;s &#39;fiscal period&#39; for the estimate record. Periods for periodicity of ANN &#x3D; 1, and SEMI &#x3D; 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598). | [optional] 
**FiscalEndDate** | **DateTime?** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**SegmentLabel** | **string** | Displays the specific label of the segment. | [optional] 
**SegmentLevel** | **string** | Returns the level of the segment item as either &#x60;P &#x3D; Parent&#x60; or &#x60;S &#x3D; Subordinate&#x60; | [optional] 
**Currency** | **string** | Currency used estimates in consensus calculations. Use &#x60;ESTIMATE&#x60; as input for values in Estimate Currency. For a list of currency ISO codes, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/1470\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page #1470&lt;/a&gt;. | [optional] 
**EstimateCurrency** | **string** | Estimate currency of the requested Security | [optional] 
**EstimateDate** | **DateTime?** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit &lt;a href&#x3D;\&quot;https://oa.apps.factset.com/pages/16598\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Online Assistant Page | [optional] 
**EstimateValue** | **double?** | The value of the estimate. | [optional] 
**AnalystId** | **string** | The FactSet Entity Identifier for the analyst making the estimate. | [optional] 
**AnalystName** | **string** | The name of the analyst making the estimate. | [optional] 
**BrokerId** | **string** | The FactSet Entity Identifier for the broker making the estimate. | [optional] 
**BrokerName** | **string** | The name of the broker making the estimate. | [optional] 
**LastModifiedDate** | **DateTime?** | The date at which a broker provided an estimate that is a revision. | [optional] 
**PrevEstimateDate** | **DateTime?** | Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**PrevEstimateValue** | **double?** | The value of the previous estimate. | [optional] 
**Section** | **string** | Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus | [optional] 
**StatusCode** | **int?** | Status code of the estimate. | [optional] 
**StatusText** | **string** | Status description of the estimate. | [optional] 
**InputDateTime** | **string** | Date and time when the data is available at the source. | [optional] 
**SecurityCurrency** | **string** | The currency that the company trades in. | [optional] 
**BrokerEstimateCurrency** | **string** | The currency in which estimates are made by broker. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

