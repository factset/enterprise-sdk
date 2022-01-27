# CompanyCompensation

List of executives and their compensation details for the specified company identifier.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | FactSet Name of the person | [optional] 
**person_id** | **str** | Factset Entity Identifier for the Person | [optional] 
**title** | **str** | The requested Position Title | [optional] 
**salary** | **float** | Salary of the person. Expressed in USD and raw units. | [optional] 
**bonus** | **float** | Bonus of the executive during the fiscal year. Expressed in USD and raw units. | [optional] 
**stock_awards** | **float** | Stock awards for the person. Expressed in USD and raw units. | [optional] 
**options_awards** | **float** | Option Awards for the person. Expressed in USD and raw units. | [optional] 
**other_compensation** | **float** | All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units. | [optional] 
**total_compensation** | **float** | The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units. | [optional] 
**non_equity_incentive_plan_comp** | **float** | All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units. | [optional] 
**non_qualified_comp_earnings** | **float** | All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units. | [optional] 
**compensation_year** | **str** | The most recent year of compensation is expressed as &#39;YYYY&#39; as opposed to &#39;YYYY-MM-DD&#39; format. | [optional] 
**request_id** | **str** | Original identifier used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


