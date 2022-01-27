# Metric


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **str** | Metric identifier to be used as &#x60;metrics&#x60; input in _ETF_ endpoints.  | 
**name** | **str** | Plain text name of the metric. | [optional] 
**category** | [**Category**](Category.md) |  | [optional] 
**data_type** | **str** | The data type for the metric. Each dataType is defined below -   * **DATE** - date format expressed in YYYY-MM-DD.   * **DOUBLE** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides for a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **INTEGER** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **STRING** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. Function will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


