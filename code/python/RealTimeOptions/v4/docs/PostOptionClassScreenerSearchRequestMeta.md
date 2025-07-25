# PostOptionClassScreenerSearchRequestMeta

The meta member contains the meta information of the request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**AttributesMember**](AttributesMember.md) |  | [optional] 
**language** | [**LanguageMember**](LanguageMember.md) |  | [optional] 
**sort** | **[str]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | symbol | | -symbol | | isin | | -isin | | name | | -name | | market.name | | -market.name | | underlying.name | | -underlying.name | | currency.code | | -currency.code | | category.name | | -category.name |   | [optional]  if omitted the server will use the default value of ["symbol"]
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


