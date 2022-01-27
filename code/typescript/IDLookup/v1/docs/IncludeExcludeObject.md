# idlookup.IncludeExcludeObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | String containing the field name to filter on. Each asset class has its own set of field (i.e. “equity_type”, “is_primary”, “region”,etc)  | [optional] 
**entity** | **String** | String containing the asset class for the filter to be applied on. If not included or left empty, it will apply the filter against all asset classes  | [optional] 
**values** | **[Object]** | Values you wish to filter on, as a comma-separated list. The values within this list are tied by an OR operation.  | [optional] 


