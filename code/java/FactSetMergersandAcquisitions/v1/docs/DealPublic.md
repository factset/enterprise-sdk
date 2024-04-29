

# DealPublic


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | Identifier for the deal. |  [optional]
**target** | [**Target**](Target.md) |  |  [optional]
**buyers** | [**java.util.List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are buyers. |  [optional]
**sellers** | [**java.util.List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are sellers. |  [optional]
**dealType** | [**DealTypeEnum**](#DealTypeEnum) | Type of deal. |  [optional]
**announceDate** | **LocalDate** | Date the deal was announced. |  [optional]
**closeDate** | **LocalDate** | Date the deal was closed. |  [optional]
**transactionValue** | **BigDecimal** | Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target&#39;s outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target&#39;s outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target&#39;s outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target&#39;s outstanding net debt. Amounts returned are in USD. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the deal  |  [optional]



## Enum: DealTypeEnum

Name | Value
---- | -----
ACQUISITION_MERGER | &quot;Acquisition / Merger&quot;
MAJORITY_STAKE | &quot;Majority Stake&quot;
MINORITY_STAKE | &quot;Minority Stake&quot;
SPINOFF | &quot;Spinoff&quot;



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
COMPLETE | &quot;Complete&quot;
CANCELLED | &quot;Cancelled&quot;
RUMOR | &quot;Rumor&quot;
RUMOR_CANCELLED | &quot;Rumor Cancelled&quot;


## Implemented Interfaces

* Serializable


