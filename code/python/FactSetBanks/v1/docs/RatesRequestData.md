# RatesRequestData

Deposit rate query parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**start_date** | **date** | Filters for deposit rate records with an &#x60;asOfDate&#x60; on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all records from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available rates are returned.  | [optional] 
**end_date** | **date** | Filters for deposit rate records with an &#x60;asOfDate&#x60; on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent rates on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available rates are returned.  | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**deposit_product** | **str** | Filter by deposit product type (e.g., \&quot;Savings\&quot;, \&quot;Certificate of Deposit\&quot;, \&quot;Fixed Rate IRA\&quot;). Omit to retrieve all products.  | [optional] 
**term** | **str** | Filter by product term (e.g., \&quot;0 Month\&quot;, \&quot;1 Year\&quot;, \&quot;18 Months\&quot;, \&quot;All\&quot;). Omit to retrieve all terms.  | [optional] 
**state** | [**USStateCode**](USStateCode.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


