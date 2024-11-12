# factsetfundamentals.Metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** | Metric identifier to be used as &#x60;metrics&#x60; input in &#x60;/fundamentals/v#/fundamentals&#x60; endpoint. | [optional] 
**name** | **String** | Plain text name of the metric. | [optional] 
**category** | **String** | Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS. | [optional] 
**subcategory** | **String** | Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc. | [optional] 
**oaPageId** | **String** | The Online Assistant Page ID in D***** format, used to look up the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES. | [optional] 
**description** | **String** | Description of the metric item. | [optional] 
**oaUrl** | **String** | The Online Assistant Page URL, is used to look up the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES. | [optional] 
**factor** | **Number** | The factor for the metric (e.g. 1000 &#x3D; thousands). | [optional] 
**sdfPackage** | **String** | An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API. | [optional] 
**dataType** | **String** | The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision of up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - Function will hold data for multiple periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. The function will hold data for multiple time periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series.  | [optional] 



## Enum: SdfPackageEnum


* `BASIC` (value: `"BASIC"`)

* `ADVANCED` (value: `"ADVANCED"`)




