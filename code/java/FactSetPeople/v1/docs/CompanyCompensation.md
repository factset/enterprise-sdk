

# CompanyCompensation

List of executives and their compensation details for the specified company identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | FactSet Name of the person |  [optional]
**personId** | **String** | Factset Entity Identifier for the Person |  [optional]
**title** | **String** | The requested Position Title |  [optional]
**salary** | **BigDecimal** | Salary of the person. Expressed in USD and raw units. |  [optional]
**bonus** | **BigDecimal** | Bonus of the executive during the fiscal year. Expressed in USD and raw units. |  [optional]
**stockAwards** | **BigDecimal** | Stock awards for the person. Expressed in USD and raw units. |  [optional]
**optionsAwards** | **BigDecimal** | Option Awards for the person. Expressed in USD and raw units. |  [optional]
**otherCompensation** | **BigDecimal** | All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units. |  [optional]
**totalCompensation** | **BigDecimal** | The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units. |  [optional]
**nonEquityIncentivePlanComp** | **BigDecimal** | All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units. |  [optional]
**nonQualifiedCompEarnings** | **BigDecimal** | All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units. |  [optional]
**compensationYear** | **String** | The most recent year of compensation is expressed as &#39;YYYY&#39; as opposed to &#39;YYYY-MM-DD&#39; format. |  [optional]
**requestId** | **String** | Original identifier used for the request. |  [optional]


## Implemented Interfaces

* Serializable


