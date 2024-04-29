# factsetmergersandacquisitions.DealCompany

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | Identifier for the deal. | [optional] 
**target** | [**Target**](Target.md) |  | [optional] 
**buyers** | [**[Participant]**](Participant.md) | Array of participants in the deal who are buyers. | [optional] 
**sellers** | [**[Participant]**](Participant.md) | Array of participants in the deal who are sellers. | [optional] 
**dealType** | **String** | Type of deal. | [optional] 
**announceDate** | **Date** | Date the deal was announced. If the deal has a status of &#x60;rumor&#x60; or &#x60;rumor cancelled&#x60;, then this may be the same as &#x60;rumorDate&#x60;. | [optional] 
**closeDate** | **Date** | Date the deal was closed. | [optional] 
**transactionValue** | **Number** | Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target&#39;s outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target&#39;s outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target&#39;s outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target&#39;s outstanding net debt. Amounts returned are in USD. | [optional] 
**status** | **String** | Status of the deal  | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 



## Enum: DealTypeEnum


* `Acquisition / Merger` (value: `"Acquisition / Merger"`)

* `Majority Stake` (value: `"Majority Stake"`)

* `Minority Stake` (value: `"Minority Stake"`)

* `Spinoff` (value: `"Spinoff"`)





## Enum: StatusEnum


* `Pending` (value: `"Pending"`)

* `Complete` (value: `"Complete"`)

* `Cancelled` (value: `"Cancelled"`)

* `Rumor` (value: `"Rumor"`)

* `Rumor Cancelled` (value: `"Rumor Cancelled"`)




