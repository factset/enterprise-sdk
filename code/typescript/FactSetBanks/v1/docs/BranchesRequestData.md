# factsetbanks.BranchesRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**coverage** | **String** | Data source region or institution type: * **US** — US FDIC-insured bank branches — branch counts and deposit market share by county, ZIP, and MSA * **CREDIT_UNION** — US credit union individual locations (NCUA) * **AUSTRALIA** — Australian bank service channels (APRA) * **GLOBAL** — Global bank locations (ex-US)  | 
**marketShareType** | **String** | Geographic aggregation level for US FDIC deposit data (Applicable only to US): * **COUNTY** — Aggregated by FIPS county code (&#x60;marketShareCode&#x60; &#x3D; 5-digit FIPS) * **ZIP** — Aggregated by ZIP code (&#x60;marketShareCode&#x60; &#x3D; 5-digit ZIP) * **MSA** — Aggregated by Metropolitan Statistical Area (&#x60;marketShareCode&#x60; &#x3D; MSA code) * **STATE** — One row per state (the only rows carrying a populated &#x60;state_province_code&#x60; in the underlying data) * **ALL** — All aggregation levels (default)  Use the &#x60;stateCode&#x60; filter alongside any &#x60;marketShareType&#x60; to narrow results to a single state — e.g. &#x60;stateCode&#x3D;NY&#x60; with &#x60;marketShareType&#x3D;COUNTY&#x60; returns every New York county row.  | [optional] [default to &#39;ALL&#39;]
**stateCode** | [**USStateCode**](USStateCode.md) |  | [optional] 
**countyFipsCodes** | **[String]** | Filter by 5-digit FIPS county codes (e.g. \&quot;36059\&quot; &#x3D; Nassau, NY). Implicitly narrows results to county-type rows. (Applicable only to US)  | [optional] 
**msaCodes** | **[String]** | Filter by MSA (Metropolitan Statistical Area) codes (e.g. \&quot;35620\&quot; &#x3D; NY-Newark-Jersey City). Implicitly narrows results to msa-type rows. (Applicable only to US)  | [optional] 
**zipCodes** | **[String]** | Filter by 5-digit ZIP codes. Implicitly narrows results to zip-type rows. (Applicable only to US)  | [optional] 
**locationNames** | **[String]** | Case-insensitive substring match against the county/city portion of &#x60;locationDescription&#x60; (e.g. [\&quot;Nassau\&quot;, \&quot;Suffolk\&quot;] to match \&quot;New York, Nassau\&quot; and \&quot;New York, Suffolk\&quot;). Use this when you know the place name but not the FIPS/MSA code. (Applicable only to US)  | [optional] 
**branchTypes** | **[String]** | Filter by branch type string (matches the &#x60;branchType&#x60; response field exactly). (Applicable only to US)  | [optional] 
**minTotalDeposits** | **Number** | Minimum &#x60;totalDeposits&#x60; (in thousands) to include. (Applicable only to US)  | [optional] 
**maxTotalDeposits** | **Number** | Maximum &#x60;totalDeposits&#x60; (in thousands) to include. (Applicable only to US)  | [optional] 
**minBranchCount** | **Number** | Minimum &#x60;branchCount&#x60; to include. (Applicable only to US) | [optional] 
**maxBranchCount** | **Number** | Maximum &#x60;branchCount&#x60; to include. (Applicable only to US) | [optional] 
**stateName** | **String** | Australian state or territory full name filter (Applicable only to AUSTRALIA) | [optional] 
**city** | **String** | City name filter (Applicable only to CREDIT_UNION, GLOBAL) | [optional] 
**postalCode** | **String** | Postal/ZIP code filter (Applicable only to CREDIT_UNION, GLOBAL) | [optional] 
**locationType** | **String** | Type of location to return (Applicable only to CREDIT_UNION, GLOBAL) | [optional] [default to &#39;ALL&#39;]
**serviceChannelType** | **String** | Type of service channel (Applicable only to AUSTRALIA) | [optional] [default to &#39;ALL&#39;]
**country** | **String** | ISO country code filter (Applicable only to GLOBAL) | [optional] 
**region** | **String** | State/province/territory code (Applicable only to GLOBAL) | [optional] 
**isMainOffice** | **Boolean** | Return only main office/headquarters (Applicable only to CREDIT_UNION) | [optional] 
**hasDriveThru** | **Boolean** | Filter for locations with drive-thru service (Applicable only to CREDIT_UNION) | [optional] 
**hasMemberServices** | **Boolean** | Filter for locations with full member services (Applicable only to CREDIT_UNION) | [optional] 
**hasAtm** | **Boolean** | Filter for locations with ATM on-site (Applicable only to CREDIT_UNION) | [optional] 



## Enum: CoverageEnum


* `US` (value: `"US"`)

* `CREDIT_UNION` (value: `"CREDIT_UNION"`)

* `AUSTRALIA` (value: `"AUSTRALIA"`)

* `GLOBAL` (value: `"GLOBAL"`)





## Enum: MarketShareTypeEnum


* `COUNTY` (value: `"COUNTY"`)

* `ZIP` (value: `"ZIP"`)

* `MSA` (value: `"MSA"`)

* `STATE` (value: `"STATE"`)

* `ALL` (value: `"ALL"`)





## Enum: LocationTypeEnum


* `BRANCH` (value: `"BRANCH"`)

* `ATM` (value: `"ATM"`)

* `ALL` (value: `"ALL"`)





## Enum: ServiceChannelTypeEnum


* `BRANCH` (value: `"BRANCH"`)

* `ATMS` (value: `"ATMS"`)

* `OTHER_FACE_TO_FACE` (value: `"OTHER_FACE_TO_FACE"`)

* `ALL` (value: `"ALL"`)




