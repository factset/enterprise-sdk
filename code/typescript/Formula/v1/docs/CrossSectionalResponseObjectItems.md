# formula.CrossSectionalResponseObjectItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universe** | **String** | If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested. | [optional] 
**dataItemName** | **String** | Name of data item (requestId, requested Screening formula, or fsymId) | 
**displayName** | **String** | Display Name. | [optional] 
**result** | [**[CrossSectionalResultObjectNonflattenedResultAttribute]**](CrossSectionalResultObjectNonflattenedResultAttribute.md) |  | 
**dataType** | **String** | Data type of the data item | 
**error** | **Number** | Data item error indicator.  * Zero – success  * Non-zero – failure  | 
**errorMessage** | **String** | If error is non-zero, errorMessage will display the Screening formula error. | [optional] 
**warnings** | [**[WarningsObject]**](WarningsObject.md) | Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula. | [optional] 
**requestId** | **String** | Identifier requested. | 
**fsymId** | **String** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 



## Enum: DataTypeEnum


* `STRING` (value: `"STRING"`)

* `INTEGER` (value: `"INTEGER"`)

* `DOUBLE` (value: `"DOUBLE"`)




