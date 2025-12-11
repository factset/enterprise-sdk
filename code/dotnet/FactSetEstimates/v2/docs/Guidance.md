# FactSet.SDK.FactSetEstimates.Model.Guidance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Guidance identifier to be used as &#x60;guidance&#x60; input in the endpoint. | [optional] 
**FsymId** | **string** | FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Metric** | **string** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034) | [optional] 
**Currency** | **string** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**EstimateCurrency** | **string** | Estimate currency of the requested Security | [optional] 
**Periodicity** | **string** | The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA. | [optional] 
**ConsensusDate** | **DateTime?** | The perspective date representing the current consensus among analysts as of today, visit [Online Assistant Page | [optional] 
**FiscalYear** | **int?** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**FiscalEndDate** | **DateTime?** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**RelativePeriod** | **int?** | &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**FiscalPeriod** | **int?** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**GuidanceDate** | **DateTime?** | Date guidance was issued expressed in YYYY-MM-DD format. | [optional] 
**InputDateHigh** | **DateTime?** | Represents the date FactSet collected the data in YYYY-MM-DD format for guidance high. | [optional] 
**InputDateLow** | **DateTime?** | Represents the date FactSet collected the data in YYYY-MM-DD format for guidance low. | [optional] 
**InputDateHighTime** | **DateTime?** | Represents the date and timestamp FactSet collected the data in YYYY-MM-DD HH:MM:SS.SSS format for guidance high. | [optional] 
**InputDateLowTime** | **DateTime?** | Represents the date and timestamp FactSet collected the data in YYYY-MM-DD HH:MM:SS.SSS format for guidance low. | [optional] 
**GuidanceMidpoint** | **double?** |  Represents the central value in a range of projected financial guidance. | [optional] 
**GuidanceLow** | **double?** | Represents the lower end of the projected financial guidance range. | [optional] 
**GuidanceHigh** | **double?** | Represents the upper end of the projected financial guidance range. | [optional] 
**GuidanceRange** | **string** | Represents the span between the lowest and highest values in the projected financial guidance. | [optional] 
**PrevMidpoint** | **double?** | This refers to the average or central point of the financial guidance range given in a prior period. | [optional] 
**PrevLow** | **double?** | Refers to the lowest value or estimate in a financial guidance range provided in a previous period. | [optional] 
**PrevHigh** | **double?** | Refers to the highest value or estimate in a financial guidance range provided in a previous period. | [optional] 
**MeanBefore** | **double?** | This is the consensus value the day before the guidance was issued. If guidance was previously issued for the period in question, this consensus will only include estimates that have been updated since the previous update. | [optional] 
**MeanSurpriseAmt** | **double?** |  This is the difference between the before value and the guidance. | [optional] 
**MeanSurpriseAmtPercent** | **double?** | This represents the percentage difference between the before value and the guidance actual. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

