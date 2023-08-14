

# UnlinkedPATemplateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**directory** | **String** | The directory to create an unlinked PA template | 
**templateTypeId** | **String** | Template type id | 
**description** | **String** | Template description |  [optional]
**accounts** | [**java.util.List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of accounts |  [optional]
**benchmarks** | [**java.util.List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of benchmarks |  [optional]
**columns** | [**java.util.List&lt;PACalculationColumn&gt;**](PACalculationColumn.md) | List of columns for the PA calculation |  [optional]
**dates** | [**PADateParameters**](PADateParameters.md) |  |  [optional]
**groups** | [**java.util.List&lt;PACalculationGroup&gt;**](PACalculationGroup.md) | List of groupings for the PA calculation |  [optional]
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  |  [optional]
**currencyisocode** | **String** | Currency ISO code for calculation. |  [optional]
**componentdetail** | **String** | PA storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES. |  [optional]
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  |  [optional]


## Implemented Interfaces

* Serializable


