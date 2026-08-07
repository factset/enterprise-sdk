# factsetbanks.Branch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Request identifier | [optional] 
**factsetEntityId** | **String** | FactSet entity identifier | [optional] 
**entityProperName** | **String** | Institution legal name | [optional] 
**coverage** | [**GlobalCoverage**](GlobalCoverage.md) |  | 
**branchCount** | **Number** | Number of branches in this location | [optional] 
**branchType** | **String** | Type of branch. Known values include: * \&quot;Full service brick and mortar branch\&quot; * \&quot;Full service retail branch\&quot; * \&quot;Limited service branch\&quot; * \&quot;Limited service drive-thru only\&quot; * \&quot;Limited service administrative office\&quot; * \&quot;Limited service mobile or seasonal\&quot; * \&quot;Limited service military\&quot; * \&quot;Limited service messenger\&quot; * \&quot;Limited service facility office\&quot; * \&quot;Limited service loan production\&quot; * \&quot;Limited service consumer credit\&quot; * \&quot;Limited service trust\&quot;  The backing dataset may introduce additional values; treat this list as non-exhaustive.  | [optional] 
**totalDeposits** | **Number** | Total deposits in thousands | [optional] 
**depositMarketSharePct** | **Number** | Deposit market share percentage | [optional] 
**marketShareType** | **String** | Market share geographic type: * **COUNTY** — Aggregated by FIPS county code (5-digit FIPS &#x60;marketShareCode&#x60;) * **ZIP** — Aggregated by ZIP code (5-digit ZIP &#x60;marketShareCode&#x60;) * **MSA** — Aggregated by Metropolitan Statistical Area (MSA &#x60;marketShareCode&#x60;) * **STATE** — One row per state (2-letter state &#x60;marketShareCode&#x60;)  | [optional] 
**marketShareCode** | **String** | Geographic code — FIPS county, ZIP, or MSA code | [optional] 
**locationDescription** | **String** | Location description | [optional] 
**branchSite** | **String** | Branch site name | [optional] 
**atmSite** | **String** | ATM site name | [optional] 
**isMainOffice** | **Boolean** | Main office flag | [optional] 
**hasMemberServices** | **Boolean** | Has member services flag | [optional] 
**hasAtm** | **Boolean** | Has ATM on-site flag | [optional] 
**hasDriveThru** | **Boolean** | Has drive-thru service flag | [optional] 
**addressId** | **Number** | Unique address identifier | [optional] 
**siteType** | **String** | Type of site | [optional] 
**locationCity** | **String** | City name | [optional] 
**stateProvince** | **String** | US state 2-letter code | [optional] 
**locationPostalCode** | **String** | Postal code | [optional] 
**locationStreet** | **String** | Street address | [optional] 
**isoCountry** | **String** | ISO country code | [optional] 
**latitude** | **Number** | Latitude coordinate | [optional] 
**longitude** | **Number** | Longitude coordinate | [optional] 
**locationId** | **Number** | Unique location identifier | [optional] 
**serviceChannelType** | **String** | Type of service channel | [optional] 
**numServiceChannel** | **Number** | Number of service channels at this location | [optional] 
**remotenessArea** | **String** | Remoteness classification | [optional] 
**sa2Code** | **Number** | Statistical Area Level 2 code - ABS | [optional] 
**state** | **String** | Australian state or territory full name | [optional] 
**address** | **String** | Full address | [optional] 
**region** | **String** | ISO 3166-2 subdivision code, subdivision part only (e.g., \&quot;ON\&quot; for Ontario, \&quot;CA\&quot; for California) | [optional] 



## Enum: MarketShareTypeEnum


* `COUNTY` (value: `"COUNTY"`)

* `ZIP` (value: `"ZIP"`)

* `MSA` (value: `"MSA"`)

* `STATE` (value: `"STATE"`)





## Enum: SiteTypeEnum


* `BRANCH_OFFICE` (value: `"BRANCH_OFFICE"`)

* `CORPORATE_OFFICE` (value: `"CORPORATE_OFFICE"`)

* `OTHER` (value: `"OTHER"`)





## Enum: ServiceChannelTypeEnum


* `BRANCH` (value: `"BRANCH"`)

* `ATMS` (value: `"ATMS"`)

* `OTHER_FACE_TO_FACE` (value: `"OTHER_FACE_TO_FACE"`)




