# formula.TimeSeriesResultObjectNonflattenedScalar

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**TimeSeriesScalarValue**](TimeSeriesScalarValue.md) |  | [optional] 
**error** | **Number** | Indicates that there was an error in the execution of the FQL Formula. * Zero - success * Non-zero - failure  | 
**errorMessage** | **String** | If error is non-zero, errorMessage will display the FQL formula error. | [optional] 
**formula** | **String** | FQL formula requested. | 
**displayName** | **String** | Display Name. | [optional] 
**requestId** | **String** | Identifier requested. | 
**fsymId** | **String** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security&#39;s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 
**dataType** | **String** | Type of data returned in &#x60;result&#x60; | 
**objectType** | **String** | Type of object returned in &#x60;result&#x60; | 



## Enum: DataTypeEnum


* `STRING` (value: `"STRING"`)

* `INTEGER` (value: `"INTEGER"`)

* `DOUBLE` (value: `"DOUBLE"`)

* `null` (value: `"null"`)





## Enum: ObjectTypeEnum


* `SCALAR` (value: `"SCALAR"`)

* `ARRAY` (value: `"ARRAY"`)

* `MATRIX` (value: `"MATRIX"`)

* `TIMESERIES` (value: `"TIMESERIES"`)




