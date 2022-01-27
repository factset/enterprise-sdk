# etfprofileandprices.InlineResponse200DataIndex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the underlying index of the ETP. This data is available for all the regions. | [optional] 
**family** | **String** | The name of the index provider for the underlying index of the ETP. This data is available for all the regions. | [optional] 
**website** | **String** | The link to the underlying index&#39;s homepage. This data is available for all the regions. | [optional] 
**distributionTreatment** | **String** | Describes the treatment of constituent cash flows by the index, whether capitalized (reinvested) or ignored, as well as tax withholding by foreign countries. Text and standardized value available for this data item. This data is available for Europe only. | [optional] 
**rebalancingFrequency** | **String** | Period of time between reweighting underlying index constituents. | [optional] 
**currency** | **String** | Base calculation currency of underlying index. This data is available for all the regions and currency code is in the format ISO 4217. | [optional] 



## Enum: RebalancingFrequencyEnum


* `Monthly` (value: `"Monthly"`)

* `Annually` (value: `"Annually"`)

* `Quarterly` (value: `"Quarterly"`)

* `Semi-annual` (value: `"Semi-annual"`)

* `Daily` (value: `"Daily"`)

* `As Needed` (value: `"As Needed"`)

* `Bi-Monthly` (value: `"Bi-Monthly"`)

* `Weekly` (value: `"Weekly"`)




