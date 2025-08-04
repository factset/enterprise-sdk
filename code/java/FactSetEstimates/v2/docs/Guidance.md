

# Guidance


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Guidance identifier to be used as &#x60;guidance&#x60; input in the endpoint. |  [optional]
**fsymId** | **String** | FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**metric** | **String** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034) |  [optional]
**currency** | **String** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**estimateCurrency** | **String** | Estimate currency of the requested Security |  [optional]
**periodicity** | **String** | The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List &#x3D; ANN, QTR, SEMI, LTMA, or NMTA. |  [optional]
**consensusDate** | **LocalDate** | The perspective date representing the current consensus among analysts as of today, visit [Online Assistant Page |  [optional]
**fiscalYear** | **Integer** | Company&#39;s &#39;fiscal year&#39; for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) |  [optional]
**fiscalEndDate** | **LocalDate** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) |  [optional]
**relativePeriod** | **Integer** | &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) |  [optional]
**fiscalPeriod** | **Integer** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. |  [optional]
**guidanceDate** | **LocalDate** | Date guidance was issued expressed in YYYY-MM-DD format. |  [optional]
**guidanceMidpoint** | **Double** |  Represents the central value in a range of projected financial guidance. |  [optional]
**guidanceLow** | **Double** | Represents the lower end of the projected financial guidance range. |  [optional]
**guidanceHigh** | **Double** | Represents the upper end of the projected financial guidance range. |  [optional]
**guidanceRange** | **String** | Represents the span between the lowest and highest values in the projected financial guidance. |  [optional]
**prevMidpoint** | **Double** | This refers to the average or central point of the financial guidance range given in a prior period. |  [optional]
**prevLow** | **Double** | Refers to the lowest value or estimate in a financial guidance range provided in a previous period. |  [optional]
**prevHigh** | **Double** | Refers to the highest value or estimate in a financial guidance range provided in a previous period. |  [optional]
**meanBefore** | **Double** | This is the consensus value the day before the guidance was issued. If guidance was previously issued for the period in question, this consensus will only include estimates that have been updated since the previous update. |  [optional]
**meanSurpriseAmt** | **Double** |  This is the difference between the before value and the guidance. |  [optional]
**meanSurpriseAmtPercent** | **Double** | This represents the percentage difference between the before value and the guidance actual. |  [optional]


## Implemented Interfaces

* Serializable


