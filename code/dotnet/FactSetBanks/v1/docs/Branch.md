# FactSet.SDK.FactSetBanks.Model.Branch
A single row of branch or location data. Structure varies by coverage type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Request identifier | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 
**EntityProperName** | **string** | Institution legal name | [optional] 
**Coverage** | **GlobalCoverage** |  | 
**BranchCount** | **int?** | Number of branches in this location | [optional] 
**BranchType** | **string** | Type of branch. Known values include: * \&quot;Full service brick and mortar branch\&quot; * \&quot;Full service retail branch\&quot; * \&quot;Limited service branch\&quot; * \&quot;Limited service drive-thru only\&quot; * \&quot;Limited service administrative office\&quot; * \&quot;Limited service mobile or seasonal\&quot; * \&quot;Limited service military\&quot; * \&quot;Limited service messenger\&quot; * \&quot;Limited service facility office\&quot; * \&quot;Limited service loan production\&quot; * \&quot;Limited service consumer credit\&quot; * \&quot;Limited service trust\&quot;  The backing dataset may introduce additional values; treat this list as non-exhaustive.  | [optional] 
**TotalDeposits** | **double?** | Total deposits in thousands | [optional] 
**DepositMarketSharePct** | **double?** | Deposit market share percentage | [optional] 
**MarketShareType** | **string** | Market share geographic type: * **COUNTY** — Aggregated by FIPS county code (5-digit FIPS &#x60;marketShareCode&#x60;) * **ZIP** — Aggregated by ZIP code (5-digit ZIP &#x60;marketShareCode&#x60;) * **MSA** — Aggregated by Metropolitan Statistical Area (MSA &#x60;marketShareCode&#x60;) * **STATE** — One row per state (2-letter state &#x60;marketShareCode&#x60;)  | [optional] 
**MarketShareCode** | **string** | Geographic code — FIPS county, ZIP, or MSA code | [optional] 
**LocationDescription** | **string** | Location description | [optional] 
**BranchSite** | **string** | Branch site name | [optional] 
**AtmSite** | **string** | ATM site name | [optional] 
**IsMainOffice** | **bool?** | Main office flag | [optional] 
**HasMemberServices** | **bool?** | Has member services flag | [optional] 
**HasAtm** | **bool?** | Has ATM on-site flag | [optional] 
**HasDriveThru** | **bool?** | Has drive-thru service flag | [optional] 
**AddressId** | **int?** | Unique address identifier | [optional] 
**SiteType** | **string** | Type of site | [optional] 
**LocationCity** | **string** | City name | [optional] 
**StateProvince** | **string** | US state 2-letter code | [optional] 
**LocationPostalCode** | **string** | Postal code | [optional] 
**LocationStreet** | **string** | Street address | [optional] 
**IsoCountry** | **string** | ISO country code | [optional] 
**Latitude** | **double?** | Latitude coordinate | [optional] 
**Longitude** | **double?** | Longitude coordinate | [optional] 
**LocationId** | **int?** | Unique location identifier | [optional] 
**ServiceChannelType** | **string** | Type of service channel | [optional] 
**NumServiceChannel** | **int?** | Number of service channels at this location | [optional] 
**RemotenessArea** | **string** | Remoteness classification | [optional] 
**Sa2Code** | **int?** | Statistical Area Level 2 code - ABS | [optional] 
**State** | **string** | Australian state or territory full name | [optional] 
**Address** | **string** | Full address | [optional] 
**Region** | **string** | ISO 3166-2 subdivision code, subdivision part only (e.g., \&quot;ON\&quot; for Ontario, \&quot;CA\&quot; for California) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

