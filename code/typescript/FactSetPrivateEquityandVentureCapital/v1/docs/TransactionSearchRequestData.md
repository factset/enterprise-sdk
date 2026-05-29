# factsetprivateequityandventurecapital.TransactionSearchRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Filter by factset portfolio company entity identifiers | 
**status** | **String** | Status of the transaction | [optional] 
**stage** | **String** | The stage type code of the transaction | [optional] 
**investmentType** | **String** | Investment type of the transaction | [optional] 
**startDate** | **Date** | Start date for announcement date filter | [optional] 
**endDate** | **Date** | End date for announcement date filter | [optional] 
**minAmount** | **Number** | Minimum transaction amount in USD | [optional] 
**maxAmount** | **Number** | Maximum transaction amount in USD | [optional] 



## Enum: StatusEnum


* `Pending` (value: `"Pending"`)

* `Cancelled` (value: `"Cancelled"`)

* `Completed` (value: `"Completed"`)





## Enum: StageEnum


* `Seed` (value: `"Seed"`)

* `Early` (value: `"Early"`)

* `Late` (value: `"Late"`)

* `Recap` (value: `"Recap"`)





## Enum: InvestmentTypeEnum


* `Venture Capital` (value: `"Venture Capital"`)

* `Growth` (value: `"Growth"`)

* `Corporate` (value: `"Corporate"`)

* `Capitalization` (value: `"Capitalization"`)

* `Angel` (value: `"Angel"`)

* `Crowdfunding` (value: `"Crowdfunding"`)

* `Accelerator/Incubator` (value: `"Accelerator/Incubator"`)

* `Secondary` (value: `"Secondary"`)

* `Undisclosed Round` (value: `"Undisclosed Round"`)




