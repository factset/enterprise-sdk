

# PAComponentData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | [**java.util.List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of accounts. |  [optional]
**benchmarks** | [**java.util.List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of benchmarks. |  [optional]
**groups** | [**java.util.List&lt;PACalculationGroup&gt;**](PACalculationGroup.md) | List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document. |  [optional]
**columns** | [**java.util.List&lt;PACalculationColumn&gt;**](PACalculationColumn.md) | List of columns for the PA calculation. This will take precedence over the columns saved in the PA document. |  [optional]
**dates** | [**PADateParameters**](PADateParameters.md) |  |  [optional]
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  |  [optional]
**currencyisocode** | **String** | Currency ISO code for calculation. |  [optional]
**componentdetail** | **String** | PA Storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES. |  [optional]


## Implemented Interfaces

* Serializable


