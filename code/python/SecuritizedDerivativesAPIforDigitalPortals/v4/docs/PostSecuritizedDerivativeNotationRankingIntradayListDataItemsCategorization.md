# PostSecuritizedDerivativeNotationRankingIntradayListDataItemsCategorization

Categorization of the securitized derivative. Not all securitized derivatives have an assignement to all category systems. For each category system, the categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ddv** | [**[PostSecuritizedDerivativeNotationRankingIntradayListDataCategorizationDdvItems]**](PostSecuritizedDerivativeNotationRankingIntradayListDataCategorizationDdvItems.md) | Categorization based on the DDV (Deutscher Derivate Verband, German for German Derivatives Association) product classification. This category system covers securitized derivatives traded in Germany except exchange trade commodities (ETC) and exchange traded notes (ETN). See endpoint &#x60;/category/list-by-system&#x60; for category system 23 for possible values. | [optional] 
**eusipa** | [**[PostSecuritizedDerivativeNotationRankingIntradayListDataCategorizationEusipaItems]**](PostSecuritizedDerivativeNotationRankingIntradayListDataCategorizationEusipaItems.md) | Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system  covers all securitized derivatives. See endpoint &#x60;/category/list-by-system&#x60; for category system 18 for possible values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


