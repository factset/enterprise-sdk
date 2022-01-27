# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2005DataCategorization
Lists of categories of the securitized derivatives. Starting with the most coarse level (one), for each level of the category system, the list of categories of the securitized derivatives, matching the parameters, is returned. See endpoint `/category/listBySystem` for possible values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ddv** | [**List&lt;InlineResponse2005DataCategorizationDdv&gt;**](InlineResponse2005DataCategorizationDdv.md) | Categorization based on the DDV (Deutscher Derivate Verband, German for German Derivatives Association) product classification. This category system (&#x60;id&#x3D;23&#x60;) covers securitized derivatives traded in Germany except exchange trade commodities (ETC) and exchange traded notes (ETN). | [optional] 
**Eusipa** | [**List&lt;InlineResponse2005DataCategorizationDdv&gt;**](InlineResponse2005DataCategorizationDdv.md) | Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (&#x60;id&#x3D;18&#x60;) covers all securitized derivatives. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

