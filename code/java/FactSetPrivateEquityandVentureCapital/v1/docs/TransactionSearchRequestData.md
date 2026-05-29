

# TransactionSearchRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Filter by factset portfolio company entity identifiers | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the transaction |  [optional]
**stage** | [**StageEnum**](#StageEnum) | The stage type code of the transaction |  [optional]
**investmentType** | [**InvestmentTypeEnum**](#InvestmentTypeEnum) | Investment type of the transaction |  [optional]
**startDate** | **LocalDate** | Start date for announcement date filter |  [optional]
**endDate** | **LocalDate** | End date for announcement date filter |  [optional]
**minAmount** | **BigDecimal** | Minimum transaction amount in USD |  [optional]
**maxAmount** | **BigDecimal** | Maximum transaction amount in USD |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
CANCELLED | &quot;Cancelled&quot;
COMPLETED | &quot;Completed&quot;



## Enum: StageEnum

Name | Value
---- | -----
SEED | &quot;Seed&quot;
EARLY | &quot;Early&quot;
LATE | &quot;Late&quot;
RECAP | &quot;Recap&quot;



## Enum: InvestmentTypeEnum

Name | Value
---- | -----
VENTURE_CAPITAL | &quot;Venture Capital&quot;
GROWTH | &quot;Growth&quot;
CORPORATE | &quot;Corporate&quot;
CAPITALIZATION | &quot;Capitalization&quot;
ANGEL | &quot;Angel&quot;
CROWDFUNDING | &quot;Crowdfunding&quot;
ACCELERATOR_INCUBATOR | &quot;Accelerator/Incubator&quot;
SECONDARY | &quot;Secondary&quot;
UNDISCLOSED_ROUND | &quot;Undisclosed Round&quot;


## Implemented Interfaces

* Serializable


