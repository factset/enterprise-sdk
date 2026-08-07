

# USBranch

A single row of US bank branch count and deposit market share data by geographic area.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Request identifier |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**coverage** | **USCoverage** |  | 
**branchCount** | **Integer** | Number of branches in this location |  [optional]
**branchType** | **String** | Type of branch. Known values include: * \&quot;Full service brick and mortar branch\&quot; * \&quot;Full service retail branch\&quot; * \&quot;Limited service branch\&quot; * \&quot;Limited service drive-thru only\&quot; * \&quot;Limited service administrative office\&quot; * \&quot;Limited service mobile or seasonal\&quot; * \&quot;Limited service military\&quot; * \&quot;Limited service messenger\&quot; * \&quot;Limited service facility office\&quot; * \&quot;Limited service loan production\&quot; * \&quot;Limited service consumer credit\&quot; * \&quot;Limited service trust\&quot;  The backing dataset may introduce additional values; treat this list as non-exhaustive.  |  [optional]
**totalDeposits** | **Double** | Total deposits in thousands |  [optional]
**depositMarketSharePct** | **Double** | Deposit market share percentage |  [optional]
**marketShareType** | [**MarketShareTypeEnum**](#MarketShareTypeEnum) | Market share geographic type: * **COUNTY** — Aggregated by FIPS county code (5-digit FIPS &#x60;marketShareCode&#x60;) * **ZIP** — Aggregated by ZIP code (5-digit ZIP &#x60;marketShareCode&#x60;) * **MSA** — Aggregated by Metropolitan Statistical Area (MSA &#x60;marketShareCode&#x60;) * **STATE** — One row per state (2-letter state &#x60;marketShareCode&#x60;)  |  [optional]
**marketShareCode** | **String** | Geographic code — FIPS county, ZIP, or MSA code |  [optional]
**locationDescription** | **String** | Location description |  [optional]



## Enum: MarketShareTypeEnum

Name | Value
---- | -----
COUNTY | &quot;COUNTY&quot;
ZIP | &quot;ZIP&quot;
MSA | &quot;MSA&quot;
STATE | &quot;STATE&quot;


## Implemented Interfaces

* Serializable


