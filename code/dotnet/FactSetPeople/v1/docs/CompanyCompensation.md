# FactSet.SDK.FactSetPeople.Model.CompanyCompensation
List of executives and their compensation details for the specified company identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | FactSet Name of the person | [optional] 
**PersonId** | **string** | Factset Entity Identifier for the Person | [optional] 
**Title** | **string** | The requested Position Title | [optional] 
**Salary** | **decimal** | Salary of the person. Expressed in USD and raw units. | [optional] 
**Bonus** | **decimal** | Bonus of the executive during the fiscal year. Expressed in USD and raw units. | [optional] 
**StockAwards** | **decimal** | Stock awards for the person. Expressed in USD and raw units. | [optional] 
**OptionsAwards** | **decimal** | Option Awards for the person. Expressed in USD and raw units. | [optional] 
**OtherCompensation** | **decimal** | All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units. | [optional] 
**TotalCompensation** | **decimal** | The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units. | [optional] 
**NonEquityIncentivePlanComp** | **decimal** | All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units. | [optional] 
**NonQualifiedCompEarnings** | **decimal** | All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units. | [optional] 
**CompensationYear** | **string** | The most recent year of compensation is expressed as &#39;YYYY&#39; as opposed to &#39;YYYY-MM-DD&#39; format. | [optional] 
**RequestId** | **string** | Original identifier used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

