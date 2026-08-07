# FactSet.SDK.FactSetBanks.Model.BranchesRequestData
Branch query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**Coverage** | **string** | Data source region or institution type: * **US** — US FDIC-insured bank branches — branch counts and deposit market share by county, ZIP, and MSA * **CREDIT_UNION** — US credit union individual locations (NCUA) * **AUSTRALIA** — Australian bank service channels (APRA) * **GLOBAL** — Global bank locations (ex-US)  | 
**MarketShareType** | **string** | Geographic aggregation level for US FDIC deposit data (Applicable only to US): * **COUNTY** — Aggregated by FIPS county code (&#x60;marketShareCode&#x60; &#x3D; 5-digit FIPS) * **ZIP** — Aggregated by ZIP code (&#x60;marketShareCode&#x60; &#x3D; 5-digit ZIP) * **MSA** — Aggregated by Metropolitan Statistical Area (&#x60;marketShareCode&#x60; &#x3D; MSA code) * **STATE** — One row per state (the only rows carrying a populated &#x60;state_province_code&#x60; in the underlying data) * **ALL** — All aggregation levels (default)  Use the &#x60;stateCode&#x60; filter alongside any &#x60;marketShareType&#x60; to narrow results to a single state — e.g. &#x60;stateCode&#x3D;NY&#x60; with &#x60;marketShareType&#x3D;COUNTY&#x60; returns every New York county row.  | [optional] [default to MarketShareTypeEnum.ALL]
**StateCode** | **USStateCode** |  | [optional] 
**CountyFipsCodes** | **List&lt;string&gt;** | Filter by 5-digit FIPS county codes (e.g. \&quot;36059\&quot; &#x3D; Nassau, NY). Implicitly narrows results to county-type rows. (Applicable only to US)  | [optional] 
**MsaCodes** | **List&lt;string&gt;** | Filter by MSA (Metropolitan Statistical Area) codes (e.g. \&quot;35620\&quot; &#x3D; NY-Newark-Jersey City). Implicitly narrows results to msa-type rows. (Applicable only to US)  | [optional] 
**ZipCodes** | **List&lt;string&gt;** | Filter by 5-digit ZIP codes. Implicitly narrows results to zip-type rows. (Applicable only to US)  | [optional] 
**LocationNames** | **List&lt;string&gt;** | Case-insensitive substring match against the county/city portion of &#x60;locationDescription&#x60; (e.g. [\&quot;Nassau\&quot;, \&quot;Suffolk\&quot;] to match \&quot;New York, Nassau\&quot; and \&quot;New York, Suffolk\&quot;). Use this when you know the place name but not the FIPS/MSA code. (Applicable only to US)  | [optional] 
**BranchTypes** | **List&lt;string&gt;** | Filter by branch type string (matches the &#x60;branchType&#x60; response field exactly). (Applicable only to US)  | [optional] 
**MinTotalDeposits** | **decimal** | Minimum &#x60;totalDeposits&#x60; (in thousands) to include. (Applicable only to US)  | [optional] 
**MaxTotalDeposits** | **decimal** | Maximum &#x60;totalDeposits&#x60; (in thousands) to include. (Applicable only to US)  | [optional] 
**MinBranchCount** | **int** | Minimum &#x60;branchCount&#x60; to include. (Applicable only to US) | [optional] 
**MaxBranchCount** | **int** | Maximum &#x60;branchCount&#x60; to include. (Applicable only to US) | [optional] 
**StateName** | **string** | Australian state or territory full name filter (Applicable only to AUSTRALIA) | [optional] 
**City** | **string** | City name filter (Applicable only to CREDIT_UNION, GLOBAL) | [optional] 
**PostalCode** | **string** | Postal/ZIP code filter (Applicable only to CREDIT_UNION, GLOBAL) | [optional] 
**LocationType** | **string** | Type of location to return (Applicable only to CREDIT_UNION, GLOBAL) | [optional] [default to LocationTypeEnum.ALL]
**ServiceChannelType** | **string** | Type of service channel (Applicable only to AUSTRALIA) | [optional] [default to ServiceChannelTypeEnum.ALL]
**Country** | **string** | ISO country code filter (Applicable only to GLOBAL) | [optional] 
**Region** | **string** | State/province/territory code (Applicable only to GLOBAL) | [optional] 
**IsMainOffice** | **bool** | Return only main office/headquarters (Applicable only to CREDIT_UNION) | [optional] 
**HasDriveThru** | **bool** | Filter for locations with drive-thru service (Applicable only to CREDIT_UNION) | [optional] 
**HasMemberServices** | **bool** | Filter for locations with full member services (Applicable only to CREDIT_UNION) | [optional] 
**HasAtm** | **bool** | Filter for locations with ATM on-site (Applicable only to CREDIT_UNION) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

