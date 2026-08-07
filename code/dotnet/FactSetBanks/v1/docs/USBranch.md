# FactSet.SDK.FactSetBanks.Model.USBranch
A single row of US bank branch count and deposit market share data by geographic area.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Request identifier | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 
**EntityProperName** | **string** | Institution legal name | [optional] 
**Coverage** | **USCoverage** |  | 
**BranchCount** | **int?** | Number of branches in this location | [optional] 
**BranchType** | **string** | Type of branch. Known values include: * \&quot;Full service brick and mortar branch\&quot; * \&quot;Full service retail branch\&quot; * \&quot;Limited service branch\&quot; * \&quot;Limited service drive-thru only\&quot; * \&quot;Limited service administrative office\&quot; * \&quot;Limited service mobile or seasonal\&quot; * \&quot;Limited service military\&quot; * \&quot;Limited service messenger\&quot; * \&quot;Limited service facility office\&quot; * \&quot;Limited service loan production\&quot; * \&quot;Limited service consumer credit\&quot; * \&quot;Limited service trust\&quot;  The backing dataset may introduce additional values; treat this list as non-exhaustive.  | [optional] 
**TotalDeposits** | **double?** | Total deposits in thousands | [optional] 
**DepositMarketSharePct** | **double?** | Deposit market share percentage | [optional] 
**MarketShareType** | **string** | Market share geographic type: * **COUNTY** — Aggregated by FIPS county code (5-digit FIPS &#x60;marketShareCode&#x60;) * **ZIP** — Aggregated by ZIP code (5-digit ZIP &#x60;marketShareCode&#x60;) * **MSA** — Aggregated by Metropolitan Statistical Area (MSA &#x60;marketShareCode&#x60;) * **STATE** — One row per state (2-letter state &#x60;marketShareCode&#x60;)  | [optional] 
**MarketShareCode** | **string** | Geographic code — FIPS county, ZIP, or MSA code | [optional] 
**LocationDescription** | **string** | Location description | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

