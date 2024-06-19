

# CrossSectionalResultObjectNonflattened

An object returning the results for a single formula.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universe** | **String** | If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested. |  [optional]
**dataItemName** | **String** | Name of data item (requestId, requested Screening formula, or fsymId) | 
**displayName** | **String** | Display Name. |  [optional]
**result** | [**java.util.List&lt;CrossSectionalResultObjectNonflattenedResultAttribute&gt;**](CrossSectionalResultObjectNonflattenedResultAttribute.md) |  | 
**dataType** | [**DataTypeEnum**](#DataTypeEnum) | Data type of the data item | 
**error** | **Integer** | Data item error indicator.  * Zero – success  * Non-zero – failure  | 
**errorMessage** | **String** | If error is non-zero, errorMessage will display the Screening formula error. |  [optional]
**warnings** | [**java.util.List&lt;WarningsObject&gt;**](WarningsObject.md) | Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula. |  [optional]



## Enum: DataTypeEnum

Name | Value
---- | -----
STRING | &quot;STRING&quot;
INTEGER | &quot;INTEGER&quot;
DOUBLE | &quot;DOUBLE&quot;


## Implemented Interfaces

* Serializable


