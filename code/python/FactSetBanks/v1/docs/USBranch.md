# USBranch

A single row of US bank branch count and deposit market share data by geographic area.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | [**USCoverage**](USCoverage.md) |  | 
**request_id** | **str** | Request identifier | [optional] 
**factset_entity_id** | **str, none_type** | FactSet entity identifier | [optional] 
**entity_proper_name** | **str, none_type** | Institution legal name | [optional] 
**branch_count** | **int, none_type** | Number of branches in this location | [optional] 
**branch_type** | **str, none_type** | Type of branch. Known values include: * \&quot;Full service brick and mortar branch\&quot; * \&quot;Full service retail branch\&quot; * \&quot;Limited service branch\&quot; * \&quot;Limited service drive-thru only\&quot; * \&quot;Limited service administrative office\&quot; * \&quot;Limited service mobile or seasonal\&quot; * \&quot;Limited service military\&quot; * \&quot;Limited service messenger\&quot; * \&quot;Limited service facility office\&quot; * \&quot;Limited service loan production\&quot; * \&quot;Limited service consumer credit\&quot; * \&quot;Limited service trust\&quot;  The backing dataset may introduce additional values; treat this list as non-exhaustive.  | [optional] 
**total_deposits** | **float, none_type** | Total deposits in thousands | [optional] 
**deposit_market_share_pct** | **float, none_type** | Deposit market share percentage | [optional] 
**market_share_type** | **str, none_type** | Market share geographic type: * **COUNTY** — Aggregated by FIPS county code (5-digit FIPS &#x60;marketShareCode&#x60;) * **ZIP** — Aggregated by ZIP code (5-digit ZIP &#x60;marketShareCode&#x60;) * **MSA** — Aggregated by Metropolitan Statistical Area (MSA &#x60;marketShareCode&#x60;) * **STATE** — One row per state (2-letter state &#x60;marketShareCode&#x60;)  | [optional] 
**market_share_code** | **str, none_type** | Geographic code — FIPS county, ZIP, or MSA code | [optional] 
**location_description** | **str, none_type** | Location description | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


