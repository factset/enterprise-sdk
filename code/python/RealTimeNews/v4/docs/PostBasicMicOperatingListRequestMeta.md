# PostBasicMicOperatingListRequestMeta

The meta member contains the meta information of the request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**AttributesMember**](AttributesMember.md) |  | [optional] 
**sort** | **[str]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | isoCode | | -isoCode | | name | | -name |   | [optional]  if omitted the server will use the default value of ["name"]
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


