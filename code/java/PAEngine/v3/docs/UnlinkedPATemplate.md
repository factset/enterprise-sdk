

# UnlinkedPATemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Template id. |  [optional]
**directory** | **String** | Template directory. |  [optional]
**templateTypeId** | **String** | Template type id |  [optional]
**snapshot** | **Boolean** | snapshot. |  [optional]
**accounts** | [**java.util.List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of accounts |  [optional]
**benchmarks** | [**java.util.List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of benchmarks |  [optional]
**columns** | [**java.util.List&lt;PACalculationColumn&gt;**](PACalculationColumn.md) | List of columns for the PA calculation |  [optional]
**dates** | [**PADateParameters**](PADateParameters.md) |  |  [optional]
**groups** | [**java.util.List&lt;PACalculationGroup&gt;**](PACalculationGroup.md) | List of groupings for the PA calculation |  [optional]
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  |  [optional]
**currencyisocode** | **String** | Currency ISO code for calculation. |  [optional]
**componentdetail** | **String** | PA storage type. It can be GROUPS or TOTALS or SECURITIES. |  [optional]
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  |  [optional]
**description** | **String** | Template description. |  [optional]
**name** | **String** | Template name. |  [optional]
**category** | **String** | Unlinked template category |  [optional]


## Implemented Interfaces

* Serializable


