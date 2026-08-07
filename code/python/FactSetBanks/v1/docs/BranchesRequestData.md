# BranchesRequestData

Branch query parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**coverage** | **str** | Data source region or institution type: * **US** — US FDIC-insured bank branches — branch counts and deposit market share by county, ZIP, and MSA * **CREDIT_UNION** — US credit union individual locations (NCUA) * **AUSTRALIA** — Australian bank service channels (APRA) * **GLOBAL** — Global bank locations (ex-US)  | 
**market_share_type** | **str** | Geographic aggregation level for US FDIC deposit data (Applicable only to US): * **COUNTY** — Aggregated by FIPS county code (&#x60;marketShareCode&#x60; &#x3D; 5-digit FIPS) * **ZIP** — Aggregated by ZIP code (&#x60;marketShareCode&#x60; &#x3D; 5-digit ZIP) * **MSA** — Aggregated by Metropolitan Statistical Area (&#x60;marketShareCode&#x60; &#x3D; MSA code) * **STATE** — One row per state (the only rows carrying a populated &#x60;state_province_code&#x60; in the underlying data) * **ALL** — All aggregation levels (default)  Use the &#x60;stateCode&#x60; filter alongside any &#x60;marketShareType&#x60; to narrow results to a single state — e.g. &#x60;stateCode&#x3D;NY&#x60; with &#x60;marketShareType&#x3D;COUNTY&#x60; returns every New York county row.  | [optional]  if omitted the server will use the default value of "ALL"
**state_code** | [**USStateCode**](USStateCode.md) |  | [optional] 
**county_fips_codes** | **[str]** | Filter by 5-digit FIPS county codes (e.g. \&quot;36059\&quot; &#x3D; Nassau, NY). Implicitly narrows results to county-type rows. (Applicable only to US)  | [optional] 
**msa_codes** | **[str]** | Filter by MSA (Metropolitan Statistical Area) codes (e.g. \&quot;35620\&quot; &#x3D; NY-Newark-Jersey City). Implicitly narrows results to msa-type rows. (Applicable only to US)  | [optional] 
**zip_codes** | **[str]** | Filter by 5-digit ZIP codes. Implicitly narrows results to zip-type rows. (Applicable only to US)  | [optional] 
**location_names** | **[str]** | Case-insensitive substring match against the county/city portion of &#x60;locationDescription&#x60; (e.g. [\&quot;Nassau\&quot;, \&quot;Suffolk\&quot;] to match \&quot;New York, Nassau\&quot; and \&quot;New York, Suffolk\&quot;). Use this when you know the place name but not the FIPS/MSA code. (Applicable only to US)  | [optional] 
**branch_types** | **[str]** | Filter by branch type string (matches the &#x60;branchType&#x60; response field exactly). (Applicable only to US)  | [optional] 
**min_total_deposits** | **float** | Minimum &#x60;totalDeposits&#x60; (in thousands) to include. (Applicable only to US)  | [optional] 
**max_total_deposits** | **float** | Maximum &#x60;totalDeposits&#x60; (in thousands) to include. (Applicable only to US)  | [optional] 
**min_branch_count** | **int** | Minimum &#x60;branchCount&#x60; to include. (Applicable only to US) | [optional] 
**max_branch_count** | **int** | Maximum &#x60;branchCount&#x60; to include. (Applicable only to US) | [optional] 
**state_name** | **str** | Australian state or territory full name filter (Applicable only to AUSTRALIA) | [optional] 
**city** | **str** | City name filter (Applicable only to CREDIT_UNION, GLOBAL) | [optional] 
**postal_code** | **str** | Postal/ZIP code filter (Applicable only to CREDIT_UNION, GLOBAL) | [optional] 
**location_type** | **str** | Type of location to return (Applicable only to CREDIT_UNION, GLOBAL) | [optional]  if omitted the server will use the default value of "ALL"
**service_channel_type** | **str** | Type of service channel (Applicable only to AUSTRALIA) | [optional]  if omitted the server will use the default value of "ALL"
**country** | **str** | ISO country code filter (Applicable only to GLOBAL) | [optional] 
**region** | **str** | State/province/territory code (Applicable only to GLOBAL) | [optional] 
**is_main_office** | **bool** | Return only main office/headquarters (Applicable only to CREDIT_UNION) | [optional] 
**has_drive_thru** | **bool** | Filter for locations with drive-thru service (Applicable only to CREDIT_UNION) | [optional] 
**has_member_services** | **bool** | Filter for locations with full member services (Applicable only to CREDIT_UNION) | [optional] 
**has_atm** | **bool** | Filter for locations with ATM on-site (Applicable only to CREDIT_UNION) | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


